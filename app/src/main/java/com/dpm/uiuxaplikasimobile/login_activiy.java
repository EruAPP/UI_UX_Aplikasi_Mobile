package com.dpm.uiuxaplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_activiy extends AppCompatActivity {
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activiy);

        btn_login = findViewById(R.id.button_login);
        btn_login.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Intent login = new Intent(getApplicationContext(), MainActivity.class);
               startActivity(login);
           }

        });

    }
}