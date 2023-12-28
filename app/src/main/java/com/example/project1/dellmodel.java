package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dellmodel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dellmodel);
    }
    public void dell1(View v) {

        Intent x = new Intent(dellmodel.this, dell1.class);
        startActivity(x);

    }

    public void dell2(View v) {

        Intent x = new Intent(dellmodel.this, dell2.class);
        startActivity(x);

    }
    public void dell3(View v) {

        Intent x = new Intent(dellmodel.this, dell3.class);
        startActivity(x);

    }
    public void dell4(View v) {

        Intent x = new Intent(dellmodel.this, dell4.class);
        startActivity(x);

    }
}