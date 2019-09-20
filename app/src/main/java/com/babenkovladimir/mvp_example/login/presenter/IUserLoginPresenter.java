package com.babenkovladimir.mvp_example.login.presenter;

import com.babenkovladimir.mvp_example.login.view.IUserLoginView;

public interface IUserLoginPresenter {

    void attachView(IUserLoginView view);
    void detachView();

    void changePassword(String password);
    void changeLogin(String login);

    void onLoginButtonClick();


}
