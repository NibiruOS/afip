package ar.com.system.afip.wsaa.business.impl;

import java.util.Date;

public class Header {
	private final String source;
	private final String destination;
	private final long uniqueId;
	private final Date generationTime;
	private final Date expirationTime;

	Header(String source, String destination, long uniqueId,
			Date generationTime, Date expirationTime) {
		this.source = source;
		this.destination = destination;
		this.uniqueId = uniqueId;
		this.generationTime = generationTime;
		this.expirationTime = expirationTime;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public long getUniqueId() {
		return uniqueId;
	}

	public Date getGenerationTime() {
		return generationTime;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}
}