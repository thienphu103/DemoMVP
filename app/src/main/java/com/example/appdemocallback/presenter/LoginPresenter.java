package com.example.appdemocallback.presenter;

public class LoginPresenter implements LoginContract.Presenter {
    LoginContract.View loginView;

    public LoginPresenter(LoginContract.View loginView) {
        this.loginView = loginView;
        loginView.setPresenter(this);
    }

    @Override
    public void resultLogin(String username, String password) {
        if (username.equals("admin") && password.equals("123456")) {
              loginView.getResultLoginOk("Successful");
        } else {
             loginView.getResultLoginFailed("Failed");
        }
    }
}
