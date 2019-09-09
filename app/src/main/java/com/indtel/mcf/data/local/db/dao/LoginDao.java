package com.indtel.mcf.data.local.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import com.indtel.mcf.data.model.db.login.LoginDb;

import java.util.List;

/**
 * Author       : Arvindo Mondal
 * Created on   : 05-08-2019
 * Email        : arvindo@indtel.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.indtel.in
 */
@Dao
public interface LoginDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(LoginDb login);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<LoginDb> flagList);

    @Query("SELECT * FROM loginTb order by _id desc limit 1")
    List<LoginDb> loadAllFlag();
}
