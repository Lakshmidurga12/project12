package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lenovomodel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovomodel);
    }
    public void lenovo1(View v) {

        Intent x = new Intent(lenovomodel.this, lenovo1.class);
        startActivity(x);

    }

    public void lenovo2(View v) {

        Intent x = new Intent(lenovomodel.this, lenovo2.class);
        startActivity(x);

    }
    public void lenovo3(View v) {

        Intent x = new Intent(lenovomodel.this, lenovo3.class);
        startActivity(x);

    }
    public void lenovo4(View v) {

        Intent x = new Intent(lenovomodel.this, lenovo4.class);
        startActivity(x);

    }
}