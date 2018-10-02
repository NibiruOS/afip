package ar.com.system.afip.jre.wsaa.business;

import ar.com.system.afip.wsaa.business.api.XmlConverter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.CompactWriter;

import javax.inject.Inject;
import java.io.StringWriter;

import static com.google.common.base.Preconditions.checkNotNull;

public class XStreamXmlConverter implements XmlConverter {
    private final XStream xstream;

    @Inject
    public XStreamXmlConverter(XStream xstream) {
        this.xstream = checkNotNull(xstream);
    }

    @Override
    public String toXml(Object data) {
        StringWriter sw = new StringWriter();
        xstream.marshal(data, new CompactWriter(sw));
        return sw.toString();
    }

    @Override
    public <T> T fromXml(Class<T> clazz, String data) {
        return (T) xstream.fromXML(data);
    }
}
