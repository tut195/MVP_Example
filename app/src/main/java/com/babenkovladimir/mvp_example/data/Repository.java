package com.babenkovladimir.mvp_example.data;

import androidx.lifecycle.LiveData;

import com.babenkovladimir.mvp_example.data.db.UserDatabase;
import com.babenkovladimir.mvp_example.data.entity.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

public class Repository implements IRepository {

    private UserDatabase userDatabase = UserDatabase.getAppDatabase();
    private UserDao userDao = userDatabase.userDao();


    @Override
    public Completable inserUser(User user) {
        return Completable.fromAction(() -> { userDao.insertUser(user);});
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public LiveData<List<User>> getLiveListUsers() {
        return userDao.getLiveUsers();
    }

    @Override
    public Single<List<User>> getSingleListUser() {
        return userDao.getUserListSingle();
    }
}
