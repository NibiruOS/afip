package ar.com.system.afip.android.wsaa.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import ar.com.system.afip.android.wsaa.data.model.Company;

@Dao
public interface RoomCompanyDao {
    // FIXME: el nombre del argumento se convierte a arg0 al compilar
    @Query("SELECT * FROM company WHERE id = :arg0")
    Company findById(int arg0);

    @Query("SELECT * FROM company WHERE active = 1")
    Company findActiveCompany();

    @Insert
    void insert(Company company);

    @Update
    void update(Company company);
}
