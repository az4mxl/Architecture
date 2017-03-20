package com.az.architecture.mvp;

/**
 * Created by maxinliang on 2017/3/17.
 */

public interface IPresenter {
    boolean oval(String acc, String pwd);
    void login(String acc, String pwd);
}
