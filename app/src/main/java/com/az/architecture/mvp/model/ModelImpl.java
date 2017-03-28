package com.az.architecture.mvp.model;

import android.text.TextUtils;

/**
 * Created by maxinliang on 2017/3/17.
 */
public class ModelImpl implements IModel {

    @Override
    public boolean oval(String acc, String pwd) {
        if (TextUtils.isEmpty(acc) || TextUtils.isEmpty(pwd)) {
            return false;
        }
        return true;
    }

    @Override
    public void login(String acc, String pwd) {

    }
}
