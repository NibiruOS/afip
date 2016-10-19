package ar.com.system.afip.wsaa.business.impl;

import ar.com.system.afip.wsaa.service.api.Credentials;


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
