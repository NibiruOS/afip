package ar.com.system.afip.wsfe.business.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import ar.com.system.afip.wsfe.service.api.Err;

public class WsfeException extends RuntimeException {
	private static final long serialVersionUID = -4960037303683142255L;
	private final List<Err> errors;

	public WsfeException(List<Err> errors) {
		this.errors = checkNotNull(errors);
	}

	public List<Err> getErrors() {
		return errors;
	}
}
