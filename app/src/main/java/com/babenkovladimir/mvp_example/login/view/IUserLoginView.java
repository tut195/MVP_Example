package com.babenkovladimir.mvp_example.login.view;

import com.babenkovladimir.mvp_example.data.entity.User;

import java.util.List;

public interface IUserLoginView {

    void showSuccessPoppup();
    void navigateMainScreen();

    void showUsers(List<User> users);
}
