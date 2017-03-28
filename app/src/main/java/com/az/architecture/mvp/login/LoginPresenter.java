package com.az.architecture.mvp.login;

import com.az.architecture.mvp.model.IModel;
import com.az.architecture.mvp.model.ModelImpl;

/**
 * Created by maxinliang on 2017/3/17.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginActivity view;
    private IModel model;

    public LoginPresenter(LoginActivity view){
        this.view = view;
        model = new ModelImpl();
    }

    @Override
    public boolean oval(String acc, String pwd) {
        return model.oval(acc, pwd);
    }

    @Override
    public void login(String acc, String pwd) {
        view.showProgress();
        model.login(acc, pwd);
        view.hideProgress();
    }

    @Override
    public void start() {

    }
}
