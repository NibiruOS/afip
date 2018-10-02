package ar.com.system.afip.wsaa.business.api;

public interface XmlConverter {
    String toXml(Object data);

    <T> T fromXml(Class<T> clazz, String data);
}
