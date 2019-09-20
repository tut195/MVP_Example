package com.babenkovladimir.mvp_example.login.presenter.impl;

import com.babenkovladimir.mvp_example.login.presenter.IUserLoginPresenter;
import com.babenkovladimir.mvp_example.login.view.IUserLoginView;
import com.babenkovladimir.mvp_example.model.User;

public class UserLoginPresenterImpl implements IUserLoginPresenter {

    private User mUser;
    private IUserLoginView mView;

    public UserLoginPresenterImpl() {
        mUser = new User();
    }

    @Override
    public void attachView(IUserLoginView view) {
        mView = view;
    }

    @Override
    public void detachView() {

    }

    @Override
    public void changePassword(String password) {
        mUser.setPassword(password);
    }

    @Override
    public void changeLogin(String login) {
        mUser.setLogin(login);
    }

    @Override
    public void onLoginButtonClick() {
        // Validate user
        if(true){
         //
        }

        if(mView!=null){
            mView.navigateMainScreen();
            //mView.showSuccessPoppup();
        }
    }
}
