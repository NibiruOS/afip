package ar.com.system.afip.android.wsaa.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.support.annotation.NonNull;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.service.api.Credentials;

import static android.arch.persistence.room.ForeignKey.CASCADE;
import static com.google.common.base.Preconditions.checkNotNull;

@Entity(tableName = "ServiceCredentials",
        primaryKeys = {"companyId", "service"},
        indices = @Index(value = "companyId"),
        foreignKeys = @ForeignKey(entity = Company.class,
                parentColumns = "id",
                childColumns = "companyId",
                onDelete = CASCADE))
public class ServiceCredentials {

    @NonNull
    private int companyId;
    @NonNull
    private Service service;
    private String token;
    private String sign;

    public ServiceCredentials() {
    }

    public ServiceCredentials(int companyId,
                              @NonNull Service service,
                              @NonNull String token,
                              @NonNull String sign) {
        this.companyId = companyId;
        this.service = checkNotNull(service);
        this.token = checkNotNull(token);
        this.sign = checkNotNull(sign);
    }

    public static ServiceCredentials fromCredentials(int companyId,
                                                     @NonNull Service service,
                                                     @NonNull Credentials credentials) {
        checkNotNull(service);
        checkNotNull(credentials);

        return new ServiceCredentials(companyId,
                service,
                credentials.getToken(),
                credentials.getSign());
    }

    public Credentials toCredentials() {
        return new Credentials(token, sign);
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
