package com.dpm.uiuxaplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register_activiy extends AppCompatActivity {
    Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activiy);

        btn_daftar = findViewById(R.id.button_daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                Intent daftar = new Intent(getApplicationContext(), login_activiy.class);
                startActivity(daftar);
            }
        });
    }

    public void daftar(View view) {
        Intent lg_daftar = new Intent(register_activiy.this, login_activiy.class);
        startActivity(lg_daftar);
    }
}