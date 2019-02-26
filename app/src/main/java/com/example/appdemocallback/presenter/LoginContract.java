package com.example.appdemocallback.presenter;

import com.example.appdemocallback.BasePresenter;
import com.example.appdemocallback.BaseView;

public interface LoginContract {

    interface Presenter extends BasePresenter{
        void resultLogin(String username,String password);
    }
    interface View extends BaseView<Presenter>{
        void getResultLoginOk(String status);
        void getResultLoginFailed(String status);
    }

}
