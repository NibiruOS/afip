package ar.com.system.afip.wsfe.business.impl;

import static com.google.common.base.Preconditions.checkNotNull;
import ar.com.system.afip.wsfe.service.api.WsfeError;

public class WsfeException extends RuntimeException {
	private static final long serialVersionUID = -4960037303683142255L;
	private final Iterable<? extends WsfeError> errors;

	public WsfeException(Iterable<? extends WsfeError> errors) {
		this.errors = checkNotNull(errors);
	}

	public Iterable<? extends WsfeError> getErrors() {
		return errors;
	}

	@Override
	public String toString() {
		return "WsfeException [errors=" + errors + "]";
	}
}
