package com.indtel.mcf.data.local.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.indtel.mcf.data.local.db.dao.FlagDao;
import com.indtel.mcf.data.local.db.dao.LoginDao;
import com.indtel.mcf.data.local.db.utils.DateConverter;
import com.indtel.mcf.data.model.db.flag.Flag;
import com.indtel.mcf.data.model.db.login.LoginDb;

/**
 * Author       : Arvindo Mondal
 * Created on   : 09-05-2019
 * Email        : arvindo@aiprog.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.aiprog.in
 */
@Database(entities = {Flag.class, LoginDb.class},
        version = 1, exportSchema = false)
@TypeConverters({DateConverter.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract FlagDao flagDao();

    public abstract LoginDao loginDao();
}
