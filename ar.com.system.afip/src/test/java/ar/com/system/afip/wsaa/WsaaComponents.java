package ar.com.system.afip.wsaa;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.business.api.XmlConverter;
import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManager;
import ar.com.system.afip.wsaa.business.impl.WsaaTemplateImpl;
import ar.com.system.afip.wsaa.data.api.*;
import ar.com.system.afip.wsaa.data.impl.FileSystemCredentialsDao;
import ar.com.system.afip.wsaa.data.impl.HomoSetupDao;
import ar.com.system.afip.wsaa.data.impl.InMemoryWsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import com.google.gson.Gson;

import java.io.File;
import java.util.Date;

import static ar.com.system.afip.util.Constants.*;

public class WsaaComponents {
    private static LoginCMS loginCms;
    private static XmlConverter xmlConverter;
    private static WsaaDao wsaaDao;
    private static CredentialsDao credentialsDao;

    public static void init(LoginCMS loginCms,
                            XmlConverter xmlConverter) {
        WsaaComponents.loginCms = loginCms;
        WsaaComponents.xmlConverter = xmlConverter;
        wsaaDao = new InMemoryWsaaDao();
        wsaaDao.saveCompanyInfo(new CompanyInfo(0,
                COMPANY,
                true,
                UNIT,
                CUIT,
                PUBLIC_KEY,
                PRIVATE_KEY,
                CERTIFICATE,
                "",
                new Date(),
                TaxCategory.MONOTRIBUTO,
                ADDRESS,
                LOCATION,
                CN));

        credentialsDao = new FileSystemCredentialsDao(System.getProperty("java.io.tmpdir")
                + File.separator
                + "afip_credentials.json",
                new Gson(),
                wsaaDao);
    }

    public static SetupDao setupDao(Service service) {
        return new HomoSetupDao(service);
    }

    public static WsaaDao wsaaDao() {
        return wsaaDao;
    }

    public static WsaaManager wsaaManager(Service service) {
        return new BouncyCastleWsaaManager(wsaaDao(),
                setupDao(service),
                loginCms,
                xmlConverter);
    }

    public static WsaaTemplate wsaaTemplate(Service service) {
        return new WsaaTemplateImpl.FactoryImpl(wsaaManager(service),
                credentialsDao())
                .create(service);
    }

    public static CredentialsDao credentialsDao() {
        return credentialsDao;
    }

    public static Credentials credentials(Service service) {
        Credentials credentials = credentialsDao()
                .loadCredentials(service);
        if (credentials == null) {
            credentials = wsaaManager(service)
                    .login(service);
            WsaaComponents.credentialsDao()
                    .saveCredentials(credentials, service);
        }
        return credentials;
    }
}
