package ar.com.system.afip.android.wsaa.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import ar.com.system.afip.wsaa.data.api.CompanyInfo;
import ar.com.system.afip.wsaa.data.api.TaxCategory;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Date;

import static com.google.common.base.Preconditions.checkNotNull;

@Entity(tableName = "Company")
public class Company {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private boolean active;
    private String unit;
    private String cuit;
    private String publicKey;
    private String privateKey;
    private String certificate;
    private String grossIncome;
    private Date activityStartDate;
    private TaxCategory taxCategory;
    private String address;
    private String location;
    private String alias;

    public Company() {
    }

    public Company(int id,
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
        this.id = id;
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

    public static Company fromCompanyInfo(@Nonnull CompanyInfo companyInfo) {
        checkNotNull(companyInfo);
        return new Company((Integer) companyInfo.getId(),
                companyInfo.getName(),
                companyInfo.isActive(),
                companyInfo.getUnit(),
                companyInfo.getCuit(),
                companyInfo.getPublicKey(),
                companyInfo.getPrivateKey(),
                companyInfo.getCertificate(),
                companyInfo.getGrossIncome(),
                companyInfo.getActivityStartDate(),
                companyInfo.getTaxCategory(),
                companyInfo.getAddress(),
                companyInfo.getLocation(),
                companyInfo.getAlias());
    }

    public CompanyInfo toCompanyInfo() {
        return new CompanyInfo(id,
                name,
                active,
                unit,
                cuit,
                publicKey,
                privateKey,
                certificate,
                grossIncome,
                activityStartDate,
                taxCategory,
                address,
                location,
                alias);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(String grossIncome) {
        this.grossIncome = grossIncome;
    }

    public Date getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(Date activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
