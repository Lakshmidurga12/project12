package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void apple(View v){
        Intent x=new Intent(MainActivity.this, applemodel.class);
        startActivity(x);

    }

    public void hp(View v){
        Intent x=new Intent(MainActivity.this, hpmodel.class);
        startActivity(x);

    }
    public void dell(View v){
        Intent x=new Intent(MainActivity.this, dellmodel.class);
        startActivity(x);

    }
    public void lenovo(View v){
        Intent x=new Intent(MainActivity.this, lenovomodel.class);
        startActivity(x);

    }
}