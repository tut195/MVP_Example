package com.babenkovladimir.mvp_example.data;

import androidx.lifecycle.LiveData;

import com.babenkovladimir.mvp_example.data.entity.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

public interface IRepository {

    Completable inserUser(User user);

    List<User> getUsers();

    LiveData<List<User>> getLiveListUsers();

    Single<List<User>> getSingleListUser();

}
