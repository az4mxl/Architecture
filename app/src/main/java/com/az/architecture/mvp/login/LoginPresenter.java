package com.az.architecture.mvp.login;

import com.az.architecture.mvp.model.IModel;
import com.az.architecture.mvp.model.ModelImpl;

/**
 * Created by maxinliang on 2017/3/17.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View mView;
    private IModel mModel;

    public LoginPresenter(IModel model, LoginContract.View view){
        this.mView = view;
        this.mModel = model;
        this.mView.setPresenter(this);
    }

    @Override
    public boolean oval(String acc, String pwd) {
        return mModel.oval(acc, pwd);
    }

    @Override
    public void login(String acc, String pwd) {
        mView.showProgress();
        mModel.login(acc, pwd);
        mView.hideProgress();
    }

    @Override
    public void start() {

    }
}
