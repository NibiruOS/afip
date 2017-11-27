package ar.com.system.afip.wsaa.business.impl;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import ar.com.system.afip.wsaa.service.api.Credentials;


@JacksonXmlRootElement(localName = "loginTicketResponse")
public class LoginTicketResponse {
	private Header header;
	private Credentials credentials;

	public Header getHeader() {
		return header;
	}

	public Credentials getCredentials() {
		return credentials;
	}

}
