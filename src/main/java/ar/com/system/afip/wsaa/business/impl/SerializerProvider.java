package ar.com.system.afip.wsaa.business.impl;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Registry;
import org.simpleframework.xml.convert.RegistryStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;

import javax.inject.Provider;
import java.util.Date;

public class SerializerProvider implements Provider<Serializer> {
    @Override
    public Serializer get() {
        try {
            Registry registry = new Registry();
            registry.bind(Date.class, SimpleXmlDateConverter.class);
            Strategy strategy = new RegistryStrategy(registry);
            return new Persister(strategy);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
