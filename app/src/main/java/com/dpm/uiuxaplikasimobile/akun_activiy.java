package com.dpm.uiuxaplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akun_activiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akun_activiy);
    }

    public void login (View view) {
        Intent btn_login = new Intent(akun_activiy.this, login_activiy.class);
        startActivity(btn_login);
    }
}