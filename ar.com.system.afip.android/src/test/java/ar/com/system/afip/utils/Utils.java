package ar.com.system.afip.utils;

import ar.com.system.afip.android.common.service.RetrofitBuilderProvider;
import ar.com.system.afip.android.wsaa.business.SerializerProvider;
import ar.com.system.afip.android.wsaa.business.SimpleXmlConverter;
import ar.com.system.afip.android.wsaa.service.LoginCmsImpl;
import ar.com.system.afip.android.wsaa.service.RetrofitLoginCmsProvider;
import ar.com.system.afip.android.wsfe.service.RetrofitServiceSoapProvider;
import ar.com.system.afip.android.wsfe.service.ServiceSoapImpl;
import ar.com.system.afip.util.Dependencies;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.WsdlParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

import javax.inject.Provider;

public class Utils {
    public static void init() {
        Provider<XmlPullParser> pullParserProvider = new XmlPullParserProvider();
        Provider<XmlSerializer> serializerProvider = new XmlSerializerProvider();
        SetupDao setupDao = new HomoSetupDao();
        ServiceFactory serviceFactory = new ServiceFactory(
                new WsdlParser(pullParserProvider),
                new RetrofitBuilderProvider(serializerProvider,
                        pullParserProvider));
        Dependencies.init(new HomoSetupDao(),
                new LoginCmsImpl(new RetrofitLoginCmsProvider(setupDao,
                        serviceFactory)
                        .get()),
                new ServiceSoapImpl(new RetrofitServiceSoapProvider(setupDao,
                        serviceFactory)
                        .get()),
                new SimpleXmlConverter(new SerializerProvider().get()));

    }
}
