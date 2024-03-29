package ar.com.system.afip.wsaa.business.impl;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

import java.util.Date;

@Order(elements = {"source",
        "destination",
        "uniqueId",
        "generationTime",
        "expirationTime"})
public class Header {
    @Element(required = false)
    private String source;
    @Element(required = false)
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