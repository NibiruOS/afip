package ar.com.system.afip.android.wsaa.data.converter;

import android.arch.persistence.room.TypeConverter;
import ar.com.system.afip.wsaa.business.api.Service;

public class ServiceConverter {
    @TypeConverter
    public static Service stringToService(String value) {
        return value == null ? null : Service.valueOf(value);
    }

    @TypeConverter
    public static String serviceToString(Service value) {
        return value == null ? null : value.name();
    }
}
