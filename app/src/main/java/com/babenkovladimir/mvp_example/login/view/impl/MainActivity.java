package com.babenkovladimir.mvp_example.login.view.impl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.babenkovladimir.mvp_example.R;
import com.babenkovladimir.mvp_example.login.presenter.IUserLoginPresenter;
import com.babenkovladimir.mvp_example.login.presenter.impl.UserLoginPresenterImpl;
import com.babenkovladimir.mvp_example.login.view.IUserLoginView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IUserLoginView {

    // Variables

    @BindView(R.id.etUserLogin)
    EditText mUserLogin;

    @BindView(R.id.etPassword)
    EditText mPassword;

    @BindView(R.id.btLogin)
    Button mLoginBt;

    private IUserLoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mPresenter = new UserLoginPresenterImpl();
        mPresenter.attachView(this);

        setupListeners();

    }

    private void setupListeners() {
        mUserLogin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mPresenter.changeLogin(editable.toString());
            }
        });

        mPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mPresenter.changePassword(editable.toString());
            }
        });

        mLoginBt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mPresenter.onLoginButtonClick();
            }
        });
    }

    @Override
    public void showSuccessPoppup() {

    }

    @Override
    public void navigateMainScreen() {
       // startActivity(new Intent(this, MainScreenActivity.class));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
