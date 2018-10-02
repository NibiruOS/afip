package ar.com.system.afip.android.wsaa.business;


import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Objects.requireNonNull;

public class SimpleXmlDateConverter
        implements Converter<Date> {
    // Ejemplo de fecha: 2018-10-05T02:23:08.000-03:00
    // El formato deberia ser yyyy-MM-dd'T'HH:mm:ss.SSSX pero X esta soportado
    // recien en android 7, por esto agrego los : recortando el string.
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    @Override
    public Date read(InputNode node) throws Exception {
        requireNonNull(node);

        String value = node.getValue();

        if (value != null) {
            int pos = value.length() - 3; // Recorto los :

            return DATE_FORMAT.parse(value.substring(0, pos)
                    + value.substring(pos + 1));
        } else {
            return null;
        }
    }

    @Override
    public void write(OutputNode node,
                      Date value) {
        requireNonNull(node);

        if (value != null) {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(value);
            // Al enviar el requerimiento, si los milisegundos no son 0, falla
            // el parseo del lado del servidor.
            // Sin embargo, en la respuesta del login, el header SI contiene
            // milisegundos!!!
            calendar.set(Calendar.MILLISECOND, 0);
            String srtValue = DATE_FORMAT.format(calendar.getTime());
            int pos = srtValue.length() - 2; // Recorto los dos ultimos ceros
            node.setValue(srtValue.substring(0, pos)
                    + ":"
                    + srtValue.substring(pos));
        }
    }
}
