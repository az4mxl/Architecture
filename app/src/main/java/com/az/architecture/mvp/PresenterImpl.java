package com.az.architecture.mvp;

/**
 * Created by maxinliang on 2017/3/17.
 */

public class PresenterImpl implements IPresenter {

    private MainActivity view;
    private IModel model;

    public PresenterImpl(MainActivity view){
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

}
