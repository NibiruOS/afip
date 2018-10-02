package ar.com.system.afip.utils;

import ar.com.system.afip.android.common.service.RetrofitBuilderProvider;
import ar.com.system.afip.android.common.service.RetrosoapExceptionConverter;
import ar.com.system.afip.android.wsaa.business.SerializerProvider;
import ar.com.system.afip.android.wsaa.business.SimpleXmlConverter;
import ar.com.system.afip.android.wsaa.service.LoginCmsImpl;
import ar.com.system.afip.android.wsaa.service.RetrofitLoginCmsProvider;
import ar.com.system.afip.android.wsfe.service.RetrofitServiceSoapProvider;
import ar.com.system.afip.android.wsfe.service.ServiceSoapImpl;
import ar.com.system.afip.android.wsmtxca.service.MtxcaServicePortTypeImpl;
import ar.com.system.afip.android.wsmtxca.service.RetrofitMtxcaServicePortTypeProvider;
import ar.com.system.afip.wsaa.WsaaComponents;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsfe.WsfeComponents;
import ar.com.system.afip.wsmtxca.WsmtxcaComponents;
import io.github.nibiruos.retrosoap.ServiceFactory;
import io.github.nibiruos.retrosoap.WsdlParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

import javax.inject.Provider;

public class Utils {
    public static void initWsaa() {
        Provider<XmlPullParser> pullParserProvider = new XmlPullParserProvider();
        Provider<XmlSerializer> serializerProvider = new XmlSerializerProvider();

        ServiceFactory serviceFactory = new ServiceFactory(
                new WsdlParser(pullParserProvider),
                new RetrofitBuilderProvider(serializerProvider,
                        pullParserProvider));
        WsaaComponents.init(new LoginCmsImpl(new RetrofitLoginCmsProvider(new HomoSetupDao(Service.WSFE),
                        serviceFactory)
                        .get()),
                new SimpleXmlConverter(new SerializerProvider().get()));
    }

    public static void initWsfe() {
        Provider<XmlPullParser> pullParserProvider = new XmlPullParserProvider();
        Provider<XmlSerializer> serializerProvider = new XmlSerializerProvider();

        ServiceFactory serviceFactory = new ServiceFactory(
                new WsdlParser(pullParserProvider),
                new RetrofitBuilderProvider(serializerProvider,
                        pullParserProvider));
        WsaaComponents.init(new LoginCmsImpl(new RetrofitLoginCmsProvider(new HomoSetupDao(Service.WSFE),
                        serviceFactory)
                        .get()),
                new SimpleXmlConverter(new SerializerProvider().get()));

        WsfeComponents.init(new ServiceSoapImpl(new RetrofitServiceSoapProvider(WsaaComponents.setupDao(Service.WSFE),
                        serviceFactory)
                        .get()),
                new RetrosoapExceptionConverter());
    }


    public static void initWsmtxca() {
        Provider<XmlPullParser> pullParserProvider = new XmlPullParserProvider();
        Provider<XmlSerializer> serializerProvider = new XmlSerializerProvider();

        ServiceFactory serviceFactory = new ServiceFactory(
                new WsdlParser(pullParserProvider),
                new RetrofitBuilderProvider(serializerProvider,
                        pullParserProvider));
        WsaaComponents.init(new LoginCmsImpl(new RetrofitLoginCmsProvider(new HomoSetupDao(Service.WSMTXCA),
                        serviceFactory)
                        .get()),
                new SimpleXmlConverter(new SerializerProvider().get()));

        WsmtxcaComponents.init(new MtxcaServicePortTypeImpl(new RetrofitMtxcaServicePortTypeProvider(WsaaComponents.setupDao(Service.WSMTXCA),
                        serviceFactory)
                        .get()),
                new RetrosoapExceptionConverter());
    }
}
