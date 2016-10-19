package ar.com.system.afip.wsfe.service.api;

public enum Resultado {
	APROBADO, RECHAZADO, PARCIAL;

	public String getCode() {
		return toString().substring(0, 1);
	}
}