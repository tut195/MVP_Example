package com.babenkovladimir.mvp_example.login.presenter.impl;

import androidx.lifecycle.LiveData;

import com.babenkovladimir.mvp_example.data.IRepository;
import com.babenkovladimir.mvp_example.data.Repository;
import com.babenkovladimir.mvp_example.login.presenter.IUserLoginPresenter;
import com.babenkovladimir.mvp_example.login.view.IUserLoginView;
import com.babenkovladimir.mvp_example.data.entity.User;

import java.util.List;

public class UserLoginPresenterImpl implements IUserLoginPresenter {

    private User mUser;
    private IUserLoginView mView;
    private IRepository repository = new Repository();

    public UserLoginPresenterImpl() {
        mUser = new User();
    }

    @Override
    public void attachView(IUserLoginView view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;

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

        repository.inserUser(mUser);

        if(mView!=null){
            mView.navigateMainScreen();
            //mView.showSuccessPoppup();
        }
    }


}
