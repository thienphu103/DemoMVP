package com.example.appdemocallback.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.appdemocallback.R;
import com.example.appdemocallback.presenter.LoginContract;
import com.example.appdemocallback.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.View, View.OnClickListener {
    LoginContract.Presenter mLoginPresenter;
    LoginPresenter loginContract;
    Button btnDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMappingViewId();
        initPresenter();
        initEvent();
        initView();
    }

    private void initPresenter() {
        loginContract=new LoginPresenter(this);

    }

    private void initView() {
        getSupportActionBar().setTitle("Demo");
    }

    private void initEvent() {
        btnDemo.setOnClickListener(this);
    }

    private void initMappingViewId() {
        btnDemo = findViewById(R.id.btn_demo);
    }

    @Override
    public void getResultLoginOk(String status) {
        Toast.makeText(this, status, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getResultLoginFailed(String status) {
        Toast.makeText(this, status, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_demo:
                mLoginPresenter.resultLogin("admin", "123456");
                break;
        }
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mLoginPresenter=presenter;
    }
}
