package ar.com.system.afip.wsaa.business.impl;


import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Objects.requireNonNull;

public class SimpleXmlDateConverter
        implements Converter<Date> {
    private final DatatypeFactory datatypeFactory;

    public SimpleXmlDateConverter() {
        try {
            this.datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Date read(InputNode node) throws Exception {
        requireNonNull(node);

        String value = node.getValue();

        return datatypeFactory.newXMLGregorianCalendar(value)
                .toGregorianCalendar()
                .getTime();
    }

    @Override
    public void write(OutputNode node,
                      Date value) {
        requireNonNull(node);
        requireNonNull(value);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime((Date) value);
        XMLGregorianCalendar xmlCalendar = datatypeFactory
                .newXMLGregorianCalendar(calendar);
        // Al enviar el requerimiento, si los milisegundos no son 0, falla
        // el parseo del lado del servidor.
        // Sin embargo, en la respuesta del login, el header SI contiene
        // milisegundos!!!
        xmlCalendar.setMillisecond(0);
        node.setValue(xmlCalendar.toXMLFormat());
    }
}
