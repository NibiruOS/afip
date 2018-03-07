package ar.com.system.afip.wsaa.service.api;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService
public interface LoginCMS {
	String SERVICE_NAME = "LoginCMSService";
	String PORT_NAME = "LoginCms";
	String WSAA_NAMESPACE = "http://wsaa.view.sua.dvadac.desein.afip.gov";

	@WebMethod
	@WebResult(name = "loginCmsReturn", targetNamespace = LoginCMS.WSAA_NAMESPACE)
	@RequestWrapper(localName = "loginCms", targetNamespace = LoginCMS.WSAA_NAMESPACE)
	@ResponseWrapper(localName = "loginCmsResponse", targetNamespace = LoginCMS.WSAA_NAMESPACE)
	public String loginCms(String cms) throws LoginFaultException;

}
