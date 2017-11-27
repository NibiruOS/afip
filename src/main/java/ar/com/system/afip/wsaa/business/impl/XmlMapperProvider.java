package ar.com.system.afip.wsaa.business.impl;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.inject.Inject;
import javax.inject.Provider;

public class XmlMapperProvider implements Provider<XmlMapper> {
    @Inject
    public XmlMapperProvider() {
    }

    @Override
    public XmlMapper get() {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        return new XmlMapper(module);
    }
}
