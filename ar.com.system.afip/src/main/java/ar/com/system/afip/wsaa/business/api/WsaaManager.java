package ar.com.system.afip.wsaa.business.api;

import ar.com.system.afip.wsaa.service.api.Credentials;

import javax.annotation.Nonnull;

public interface WsaaManager {
	void initializeKeys();

	String buildCertificateRequest();

	void updateCertificate(@Nonnull String certificate);

	Credentials login(@Nonnull Service service);
}
