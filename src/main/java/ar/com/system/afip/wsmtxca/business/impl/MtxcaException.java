package ar.com.system.afip.wsmtxca.business.impl;

import ar.com.system.afip.wsmtxca.service.api.ExceptionFaultMsg;

public class MtxcaException extends RuntimeException {
	public MtxcaException(ExceptionFaultMsg root) {
		super(root);
	}
}
