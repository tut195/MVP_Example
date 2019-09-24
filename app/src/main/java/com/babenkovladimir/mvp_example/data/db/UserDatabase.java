package com.babenkovladimir.mvp_example.data.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.babenkovladimir.mvp_example.MyDatabaseApplication;
import com.babenkovladimir.mvp_example.data.UserDao;
import com.babenkovladimir.mvp_example.data.entity.User;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {

    private static UserDatabase INSTANCE;

    public static UserDatabase getAppDatabase() {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(MyDatabaseApplication.getAppContext(), UserDatabase.class, "skillup.db")
                            // allow queries on the main thread.
                            // Don't do this on a real app! See PersistenceBasicSample for an example.
                            //.allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public abstract UserDao userDao();


}
