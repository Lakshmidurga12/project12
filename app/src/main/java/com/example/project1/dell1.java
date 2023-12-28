package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class dell1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell1);
    }
    public void Buttondell(View v){
        String w ="https://www.dell.com/en-in/shop/laptops-2-in-1-pcs/sr/laptops/xps-laptops";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttondellyoutube(View v){
        String w ="https://youtu.be/7WrHNF9KKso?si=5sNVlN1oC08YEtV8";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}