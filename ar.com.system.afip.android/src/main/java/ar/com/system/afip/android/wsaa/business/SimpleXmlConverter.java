package ar.com.system.afip.android.wsaa.business;

import ar.com.system.afip.wsaa.business.api.XmlConverter;
import org.simpleframework.xml.Serializer;

import javax.inject.Inject;
import java.io.StringWriter;

import static com.google.common.base.Preconditions.checkNotNull;

public class SimpleXmlConverter implements XmlConverter {
    private final Serializer serializer;

    @Inject
    public SimpleXmlConverter(Serializer serializer) {
        this.serializer = checkNotNull(serializer);
    }

    @Override
    public String toXml(Object data) {
        try {
            StringWriter sw = new StringWriter();
            serializer.write(data, sw);
            return sw.toString();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T fromXml(Class<T> clazz, String data) {
        try {
            return serializer.read(clazz, data);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
