package com.dpm.uiuxaplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
    }

    public void akun (View pd_akun) {
        Intent ac_akun = new Intent(MainActivity.this, akun_activiy.class);
        startActivity(ac_akun);
    }
}