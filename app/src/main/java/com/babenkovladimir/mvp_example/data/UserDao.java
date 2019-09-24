package com.babenkovladimir.mvp_example.data;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.babenkovladimir.mvp_example.data.entity.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface UserDao {

    @Insert
    public void insertUser(User user);

    @Insert
    public void insertUserS(List<User> users);

    @Query("SELECT * FROM user")
    public List<User> getUsers();

    @Query("SELECT * FROM user")
    public LiveData<List<User>> getLiveUsers();

    @Query("SELECT * FROM user")
    public Single<List<User>> getUserListSingle();


}

