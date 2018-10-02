package ar.com.system.afip.wsfe.service.api;

public enum Reporceso {
	NO, SI;

	public String getCode() {
		return toString().substring(0, 1);
	}
}