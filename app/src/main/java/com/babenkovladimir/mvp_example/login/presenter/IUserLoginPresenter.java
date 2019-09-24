package com.babenkovladimir.mvp_example.login.presenter;

import androidx.lifecycle.LiveData;

import com.babenkovladimir.mvp_example.data.entity.User;
import com.babenkovladimir.mvp_example.login.view.IUserLoginView;

import java.util.List;

public interface IUserLoginPresenter {

    void attachView(IUserLoginView view);
    void detachView();

    void changePassword(String password);
    void changeLogin(String login);

    void onLoginButtonClick();




}
