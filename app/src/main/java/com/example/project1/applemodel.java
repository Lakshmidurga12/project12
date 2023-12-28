package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class applemodel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applemodel);
    }

    public void apple1(View v) {

        Intent x = new Intent(applemodel.this, apple1.class);
        startActivity(x);

    }

    public void apple2(View v) {

        Intent x = new Intent(applemodel.this, apple2.class);
        startActivity(x);

    }
    public void apple3(View v) {

        Intent x = new Intent(applemodel.this, apple3.class);
        startActivity(x);

    }
    public void apple4(View v) {

        Intent x = new Intent(applemodel.this, apple4.class);
        startActivity(x);

    }

}