package ar.com.system.afip.wsaa.service.api;

import javax.xml.ws.WebFault;

@WebFault(name = "fault")
public class LoginFaultException extends RuntimeException {
	private static final long serialVersionUID = -5232619485947675014L;
	private final LoginFault faultInfo;

	public LoginFaultException(String message, LoginFault faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	public LoginFaultException(String message, LoginFault faultInfo,
			Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	public LoginFault getFaultInfo() {
		return faultInfo;
	}
}
