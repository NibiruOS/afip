package ar.com.system.afip.wsfe.service.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.base.Function;

public class DateUtil {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyyMMdd");
        private static SimpleDateFormat dateTimeFormat = new SimpleDateFormat(
			"yyyyMMddHHmmss");

	public static Function<Date, String> TO_STRING = date -> dateFormat.format(date);
        public static Function<Date, String> DATETIME_TO_STRING = date -> dateTimeFormat.format(date);

	public static Function<String, Date> TO_DATE = stringDate -> {
            try {
                return dateFormat.parse(stringDate);
            } catch (ParseException e) {
                throw new IllegalArgumentException("Invalid date: "
                        + stringDate);
            }
        };
        public static Function<String, Date> TO_DATETIME = stringDate -> {
            try {
                return dateTimeFormat.parse(stringDate);
            } catch (ParseException e) {
                throw new IllegalArgumentException("Invalid date: "
                        + stringDate);
            }
        };

	private DateUtil() {
	}
}
