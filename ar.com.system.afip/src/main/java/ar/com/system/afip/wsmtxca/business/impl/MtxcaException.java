package ar.com.system.afip.wsmtxca.business.impl;


import ar.com.system.afip.wsmtxca.service.api.ExceptionFaultMsg;

public class MtxcaException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6140230396277534874L;
	
	public MtxcaException(ExceptionFaultMsg root) {
		super(root);
	}
	
}
