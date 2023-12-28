package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hpmodel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hpmodel);
    }
    public void hp1(View v) {

        Intent x = new Intent(hpmodel.this, hp1.class);
        startActivity(x);

    }

    public void hp2(View v) {

        Intent x = new Intent(hpmodel.this, hp2.class);
        startActivity(x);

    }
    public void hp3(View v) {

        Intent x = new Intent(hpmodel.this, hp3.class);
        startActivity(x);

    }
    public void hp4(View v) {

        Intent x = new Intent(hpmodel.this, hp4.class);
        startActivity(x);

    }
}