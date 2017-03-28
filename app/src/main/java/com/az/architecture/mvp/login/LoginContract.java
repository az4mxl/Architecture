package com.az.architecture.mvp.login;

import com.az.architecture.mvp.BasePresenter;
import com.az.architecture.mvp.BaseView;

/**
 * Created by maxinliang on 2017/3/28.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        void initView();

        void showProgress();

        void hideProgress();
    }

    interface Presenter extends BasePresenter {
        boolean oval(String acc, String pwd);

        void login(String acc, String pwd);
    }
}
