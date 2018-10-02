package ar.com.system.afip.wsfe.service.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.base.Function;

public class DateUtil {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyyMMdd");

	public static Function<Date, String> TO_STRING = date -> dateFormat.format(date);

	public static Function<String, Date> TO_DATE = stringDate -> {
        try {
            return dateFormat.parse(stringDate);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date: "
                    + stringDate);
        }
    };

	private DateUtil() {
	}
}
