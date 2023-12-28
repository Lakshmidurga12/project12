package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class dell3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell3);
    }
    public void Buttondell3(View v){
        String w ="https://www.dell.com/en-in/work/shop/business-laptop-notebook-computers/sf/latitude-laptops";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttondell3youtube(View v){
        String w ="https://youtu.be/WVCnrvzM8vE?si=IeX3taWyDhVt8Aop";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}