package ar.com.system.afip.wsaa.data.api;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.annotation.Nullable;

public class CompanyInfo {
	private final String name;
	private final String unit;
	private final String cuit;
	private final String publicKey;
	private final String privateKey;
	private final String certificate;

	public CompanyInfo(String name,
			String unit,
			String cuit,
			@Nullable String publicKey,
			@Nullable String privateKey,
			@Nullable String certificate) {
		this.name = checkNotNull(name);
		this.unit = checkNotNull(unit);
		this.cuit = checkNotNull(cuit);
		this.publicKey = publicKey;
		this.privateKey = privateKey;
		this.certificate = certificate;
	}

	public String getName() {
		return name;
	}

	public String getUnit() {
		return unit;
	}

	public String getCuit() {
		return cuit;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public String getCertificate() {
		return certificate;
	}

	public String buildSource() {
		return String.format(
				"C=ar, O=%s, OU=%s, SERIALNUMBER=CUIT %s, CN=srv1", name, unit,
				cuit);
	}
}
