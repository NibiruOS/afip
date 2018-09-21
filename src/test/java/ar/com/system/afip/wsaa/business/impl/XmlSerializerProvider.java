package ar.com.system.afip.wsaa.business.impl;

import org.xmlpull.mxp1_serializer.MXSerializer;
import org.xmlpull.v1.XmlSerializer;

import javax.inject.Provider;

public class XmlSerializerProvider implements Provider<XmlSerializer> {
    @Override
    public XmlSerializer get() {
        return new MXSerializer();
    }
}
