package ar.com.system.afip.jre.wsfe.service;

import static com.google.common.base.Preconditions.checkNotNull;

import java.net.MalformedURLException;
import java.net.URL;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsfe.service.api.ServiceSoap;

import com.google.common.base.Throwables;

public class ServiceSoapProvider implements Provider<ServiceSoap> {
	private final SetupDao setupDao;

	@Inject
	public ServiceSoapProvider(SetupDao setupDao) {
		this.setupDao = checkNotNull(setupDao);
	}

	@Override
	public ServiceSoap get() {
		try {
			Service service = Service.create(new URL(setupDao.readSetup()
					.geBillingWsdl()), new QName(ServiceSoap.SERVICE_NAMESPACE,
					ServiceSoap.SERVICE_NAME));
			return service.getPort(new QName(ServiceSoap.SERVICE_NAMESPACE,
					ServiceSoap.PORT_NAME), ServiceSoap.class);
		} catch (MalformedURLException e) {
			throw Throwables.propagate(e);
		}
	}
}
