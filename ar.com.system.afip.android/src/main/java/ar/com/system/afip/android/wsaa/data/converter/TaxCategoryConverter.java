package ar.com.system.afip.android.wsaa.data.converter;

import android.arch.persistence.room.TypeConverter;
import ar.com.system.afip.wsaa.data.api.TaxCategory;

public class TaxCategoryConverter {
    @TypeConverter
    public static TaxCategory stringToTaxCategory(String value) {
        return value == null ? null : TaxCategory.valueOf(value);
    }

    @TypeConverter
    public static String taxCategoryToString(TaxCategory value) {
        return value == null ? null : value.name();
    }
}
