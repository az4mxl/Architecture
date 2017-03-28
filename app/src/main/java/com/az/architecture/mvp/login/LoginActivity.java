package com.az.architecture.mvp.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.az.architecture.R;
import com.az.architecture.mvp.model.ModelImpl;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

    private EditText etAccount, etPwd;
    private Button btnLogin;

    private LoginContract.Presenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mPresenter = new LoginPresenter(new ModelImpl(), this);

        initView();
    }

    @Override
    public void initView() {
        etAccount = (EditText) findViewById(R.id.et_account);
        etPwd = (EditText) findViewById(R.id.et_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String acc = etAccount.getText().toString().trim();
                String pwd = etPwd.toString();
                boolean isOval = mPresenter.oval(acc, pwd);
                if (isOval) {
                    mPresenter.login(acc, pwd);
                }
            }
        });
    }

    @Override
    public void showProgress() {
        Toast.makeText(this, "登陆开始", Toast.LENGTH_LONG).show();
    }

    @Override
    public void hideProgress() {
        Toast.makeText(this, "登陆结束", Toast.LENGTH_LONG).show();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.mPresenter = presenter;
    }
}
