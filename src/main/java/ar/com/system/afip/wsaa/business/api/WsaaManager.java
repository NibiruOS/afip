package ar.com.system.afip.wsaa.business.api;

import ar.com.system.afip.wsaa.service.api.Credentials;

public interface WsaaManager {
	void initialize(String companyName, String unit, String cuit);

	void initializeKeys();

	String buildCertificateRequest();

	void updateCertificate(String certificate);

	Credentials login(Service service);
}
