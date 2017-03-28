package com.az.architecture.mvp.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.az.architecture.R;

public class LoginActivity extends AppCompatActivity {

    private EditText etAccount, etPwd;
    private Button btnLogin;

    private IPresenter iPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        etAccount = (EditText) findViewById(R.id.et_account);
        etPwd = (EditText) findViewById(R.id.et_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String acc = etAccount.getText().toString().trim();
                String pwd = etPwd.toString();
                boolean isOval = iPresenter.oval(acc, pwd);
                if (isOval) {
                    iPresenter.login(acc, pwd);
                }
            }
        });
    }

    public void showProgress() {
        Toast.makeText(this, "登陆开始", Toast.LENGTH_LONG).show();
    }

    public void hideProgress() {
        Toast.makeText(this, "登陆结束", Toast.LENGTH_LONG).show();
    }

}
