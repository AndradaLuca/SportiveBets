package com.example.marius.sportivebets.login;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.marius.sportivebets.MainActivity;
import com.example.marius.sportivebets.R;
import com.example.marius.sportivebets.database.entity.User;
import com.example.marius.sportivebets.databinding.ActivityLoginBinding;
import com.example.marius.sportivebets.forgotPassword.ForgotPasswordActivity;
import com.example.marius.sportivebets.register.RegisterActivity;

import es.dmoral.toasty.Toasty;

import static android.widget.Toast.LENGTH_SHORT;

public class LoginActivity extends AppCompatActivity implements ILoginActivity {

    private ActivityLoginBinding loginBinding;
    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        loginBinding.setILoginActivity(this);
        initViewModel();

    }

    private void initViewModel(){
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        loginViewModel.getLoginSuccess().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                //Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                //intent.putExtra("username",user.getName());
                // startActivity(intent);

            }
        });
        loginViewModel.getLoginFaild().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toasty.error(LoginActivity.this,s, LENGTH_SHORT).show();
            }
        });
        loginViewModel.getFindUserSucces().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(@Nullable Boolean aBoolean) {
                if (aBoolean) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                    startActivity(intent);

                }

            }
        });
    }

    @Override
    public void showRegisterActivity() {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    public void login() {
        loginViewModel.onLoginClick(loginBinding.loginUsernameEditText.getText().toString(),loginBinding.loginPasswordEditText.getText().toString(),loginBinding.loginSwitch.isChecked());
    }

    @Override
    public void forgotPassword() {
        Toast.makeText(this, "ForgotPassword Pressed", LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
}
