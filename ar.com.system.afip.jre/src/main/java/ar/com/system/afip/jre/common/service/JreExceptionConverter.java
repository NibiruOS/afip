package ar.com.system.afip.jre.common.service;

import ar.com.system.afip.common.service.ExceptionConverter;
import ar.com.system.afip.common.service.SoapException;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;
import java.util.concurrent.Callable;

public class JreExceptionConverter
        implements ExceptionConverter {
    @Inject
    public JreExceptionConverter() {
    }

    @Nullable
    @Override
    public <T> T convert(Callable<T> callback) {
        try {
            return callback.call();
        } catch (SOAPFaultException e) {
            SOAPFault fault = e.getFault();
            throw new SoapException(fault.getFaultCode(),
                    fault.getFaultString());
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
