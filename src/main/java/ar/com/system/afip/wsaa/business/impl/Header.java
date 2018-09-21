package ar.com.system.afip.wsaa.business.impl;

import org.simpleframework.xml.Element;

import java.util.Date;

public class Header {
	@Element
	private String source;
	@Element
	private String destination;
	@Element
	private long uniqueId;
	@Element
	private Date generationTime;
	@Element
	private Date expirationTime;

	Header() {
	}

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