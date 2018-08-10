package ar.com.system.afip.wsmtxca.business.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;

import ar.com.system.afip.wsmtxca.service.api.WsmtxcaError;

public class MtxcaResponseException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3179903710312596888L;
	private final Iterable<? extends WsmtxcaError> errors;

	public MtxcaResponseException(Iterable<? extends WsmtxcaError> errors) {
		super(buildErrorMessage(errors));
		this.errors = checkNotNull(errors);
	}

	public Iterable<? extends WsmtxcaError> getErrors() {
		return errors;
	}

	@Override
	public String toString() {
		return "WsmtxcaException [errors=" + errors + "]";
	}
	
	private static String buildErrorMessage(Iterable<? extends WsmtxcaError> errors) {
		return Joiner.on('\n')
				.join(Iterables.transform(errors, WsmtxcaError::getMsg));
	}
}
