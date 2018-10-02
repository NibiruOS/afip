package ar.com.system.afip.wsaa.business.api;

import ar.com.system.afip.wsaa.service.api.Credentials;

public interface WsaaManager {
	void initializeKeys();

	String buildCertificateRequest();

	void updateCertificate(String certificate);

	Credentials login(Service service);
}
