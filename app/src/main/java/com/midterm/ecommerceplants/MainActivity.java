package com.midterm.ecommerceplants;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // tat ca deu phai de trong private, bien nam trong class them m phia truoc, bien cuc bo thi k can
    private Button mBtnSignup, mBtnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnSignin = findViewById(R.id.btn_signin);
        mBtnSignup = findViewById(R.id.btn_sigup);
        mBtnSignup.setOnClickListener(v -> {
            Intent signup = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(signup);
        });
        mBtnSignin.setOnClickListener(v -> {
            Intent signIn = new Intent(MainActivity.this, SignInActivity.class);
            startActivity(signIn);
        });
    }
}