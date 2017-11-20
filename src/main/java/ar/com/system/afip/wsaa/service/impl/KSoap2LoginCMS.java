package ar.com.system.afip.wsaa.service.impl;


import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

import javax.inject.Inject;

import ar.com.system.afip.wsaa.data.api.Setup;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import ar.com.system.afip.wsaa.service.api.LoginFaultException;

import static com.google.common.base.Preconditions.checkNotNull;

public class KSoap2LoginCMS implements LoginCMS {
    private final SetupDao setupDao;

    @Inject
    public KSoap2LoginCMS(SetupDao setupDao) {
        this.setupDao = checkNotNull(setupDao);
    }

    @Override
    public String loginCms(String cms) throws LoginFaultException {
        try {
            Setup setup = setupDao.readSetup();

            SoapObject request = new SoapObject(WSAA_NAMESPACE, LOGIN_CMS);

            PropertyInfo propInfo = new PropertyInfo();
            propInfo.name = "arg0";
            propInfo.type = PropertyInfo.STRING_CLASS;

            request.addProperty("cms", cms);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

            envelope.setOutputSoapObject(request);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(setup.getWsaaWsdl()); //TODO: tomar del DAO

            androidHttpTransport.call("", envelope);

            SoapPrimitive resultsRequestSOAP = (SoapPrimitive) envelope.getResponse();

            return resultsRequestSOAP.toString();
        } catch (IOException | XmlPullParserException e) {
            throw new RuntimeException(e);
        }

    }
}
