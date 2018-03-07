package ar.com.system.afip.wsaa.business.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.inject.Inject;
import javax.inject.Singleton;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaManager;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.service.api.Credentials;

import com.google.common.base.Function;

@Singleton
public class WsaaTemplateImpl implements WsaaTemplate {
	public static class FactoryImpl implements Factory {
		private final WsaaManager wsaaManager;

		@Inject
		public FactoryImpl(WsaaManager wsaaManager) {
			this.wsaaManager = checkNotNull(wsaaManager);
		}

		@Override
		public WsaaTemplate create(Service service) {
			return new WsaaTemplateImpl(wsaaManager, service);
		}
	}

	private final WsaaManager wsaaManager;
	private final Service service;
	private Credentials credentials;

	private WsaaTemplateImpl(WsaaManager wsaaManager, Service service) {
		this.wsaaManager = checkNotNull(wsaaManager);
		this.service = checkNotNull(service);
	}

	@Override
	public <T> T runAuhtenticated(Function<Credentials, T> callback) {
		checkNotNull(callback);
		try {
			login();
			return callback.apply(credentials);
		} catch (RuntimeException e) {
			if (e.getMessage().equals(
					"El tiempo de expiraci�n es inferior a la hora actual")) {
				credentials = null;
				login();
				return callback.apply(credentials);
			} else {
				throw e;
			}
		}
	}

	private void login() {
		if (credentials == null) {
			synchronized (this) {
				if (credentials == null) {
					credentials = wsaaManager.login(service);
				}
			}
		}
	}
}
