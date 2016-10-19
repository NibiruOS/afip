package ar.com.system.afip.wsaa.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.net.MalformedURLException;
import java.net.URL;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ar.com.system.afip.wsaa.data.api.Setup;
import ar.com.system.afip.wsaa.data.api.SetupDao;
import ar.com.system.afip.wsaa.service.api.LoginCMS;

import com.google.common.base.Throwables;

public class LoginCMSProvider implements Provider<LoginCMS> {
	private final SetupDao setupDao;

	@Inject
	public LoginCMSProvider(SetupDao setupDao) {
		this.setupDao = checkNotNull(setupDao);
	}

	@Override
	public LoginCMS get() {
		try {
			Setup setup = setupDao.readSetup();
			Service service = Service.create(new URL(setup.getWsaaWsdl()),
					new QName(setup.getWsaaTargetNamespace(),
							LoginCMS.SERVICE_NAME));
			return service.getPort(new QName(setup.getWsaaTargetNamespace(),
					LoginCMS.PORT_NAME), LoginCMS.class);
		} catch (MalformedURLException e) {
			throw Throwables.propagate(e);
		}
	}
}
