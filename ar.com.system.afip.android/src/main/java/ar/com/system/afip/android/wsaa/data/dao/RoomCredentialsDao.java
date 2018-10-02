package ar.com.system.afip.android.wsaa.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import ar.com.system.afip.android.wsaa.data.model.ServiceCredentials;
import ar.com.system.afip.wsaa.business.api.Service;

@Dao
public interface RoomCredentialsDao {
    @Query("select cr.* from ServiceCredentials cr inner join Company co on cr.companyId = co.id where cr.service = :arg0 and co.active = 1")
    ServiceCredentials findByService(Service arg0);

    @Insert
    void insert(ServiceCredentials credentials);

    @Update
    void update(ServiceCredentials credentials);

    @Query("delete from ServiceCredentials where service = :arg0 and companyId = :arg1")
    void deleteByService(Service arg0, int arg1);
}
