package ar.com.system.afip.util;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.business.api.XmlConverter;
import ar.com.system.afip.wsaa.business.impl.BouncyCastleWsaaManager;
import ar.com.system.afip.wsaa.business.impl.WsaaTemplateImpl;
import ar.com.system.afip.wsaa.data.api.*;
import ar.com.system.afip.wsaa.data.impl.FileSystemCredentialsDao;
import ar.com.system.afip.wsaa.data.impl.InMemoryWsaaDao;
import ar.com.system.afip.wsaa.service.api.Credentials;
import ar.com.system.afip.wsaa.service.api.LoginCMS;
import ar.com.system.afip.wsfe.business.api.WsfeManager;
import ar.com.system.afip.wsfe.business.impl.WsfeManagerImpl;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;
import com.google.gson.Gson;

import java.io.File;
import java.util.Date;

import static ar.com.system.afip.util.Constants.*;

public class Dependencies {
    private static SetupDao setupDao;
    private static LoginCMS loginCms;
    private static ServiceSoap serviceSoap;
    private static XmlConverter xmlConverter;
    private static WsaaDao wsaaDao;
    private static CredentialsDao credentialsDao;

    public static void init(SetupDao setupDao,
                            LoginCMS loginCms,
                            ServiceSoap serviceSoap,
                            XmlConverter xmlConverter) {
        Dependencies.setupDao = setupDao;
        Dependencies.loginCms = loginCms;
        Dependencies.serviceSoap = serviceSoap;
        Dependencies.xmlConverter = xmlConverter;
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
                new Gson());
    }

    public static WsaaDao wsaaDao() {
        return wsaaDao;
    }

    public static WsaaManager wsaaManager() {
        return new BouncyCastleWsaaManager(wsaaDao(),
                setupDao,
                loginCms,
                xmlConverter);
    }

    public static WsaaTemplate wsaaTemplate(Service service) {
        return new WsaaTemplateImpl.FactoryImpl(wsaaManager(),
                credentialsDao())
                .create(service);
    }

    public static ServiceSoap serviceSoap() {
        return serviceSoap;
    }

    public static WsfeManager wsfeManager() {
        return new WsfeManagerImpl(
                new WsaaTemplateImpl.FactoryImpl(
                        wsaaManager(),
                        credentialsDao()),
                serviceSoap(),
                wsaaDao());
    }

    public static CredentialsDao credentialsDao() {
        return credentialsDao;
    }

    public static Credentials credentials(Service service) {
        Credentials credentials = Dependencies.credentialsDao()
                .loadCredentials(service);
        if (credentials == null) {
            credentials = wsaaManager().login(service);
            Dependencies.credentialsDao()
                    .saveCredentials(credentials, service);
        }
        return credentials;
    }
}
