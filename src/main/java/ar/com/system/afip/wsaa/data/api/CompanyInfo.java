package ar.com.system.afip.wsaa.data.api;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Nullable;

public class CompanyInfo {
    private final Serializable id;
    private final String name;
    private final boolean active;
    private final String unit;
    private final String cuit;
    private final String publicKey;
    private final String privateKey;
    private final String certificate;
    private final String grossIncome;
    private final Date activityStartDate;
    private final TaxCategory taxCategory;
    private final String address;
    private final String location;
    private final String alias;

    public CompanyInfo(Serializable id,
                       String name,
                       boolean active,
                       String unit,
                       String cuit,
                       @Nullable String publicKey,
                       @Nullable String privateKey,
                       @Nullable String certificate,
                       String grossIncome,
                       Date activityStartDate,
                       TaxCategory taxCategory,
                       @Nullable String address,
                       @Nullable String location,
                       String alias) {
        this.id = checkNotNull(id);
        this.name = checkNotNull(name);
        this.active = active;
        this.unit = checkNotNull(unit);
        this.cuit = checkNotNull(cuit);
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.certificate = certificate;
        this.grossIncome = checkNotNull(grossIncome);
        this.activityStartDate = checkNotNull(activityStartDate);
        this.taxCategory = checkNotNull(taxCategory);
        this.address = address;
        this.location = location;
        this.alias = checkNotNull(alias);
    }

    public String buildSource() {
        return String.format("C=ar, O=%s, OU=%s, SERIALNUMBER=CUIT %s, CN=srv1", name, unit, cuit);
    }

    public Serializable getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public String getUnit() {
        return unit;
    }

    public String getCuit() {
        return cuit;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getCertificate() {
        return certificate;
    }

    public String getGrossIncome() {
        return grossIncome;
    }

    public Date getActivityStartDate() {
        return activityStartDate;
    }

    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    public String getAlias() {
        return alias;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

}
