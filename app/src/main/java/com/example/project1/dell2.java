package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class dell2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell2);
    }
    public void Buttondell2(View v){
        String w ="https://www.dell.com/en-in/shop/desktops-all-in-ones/inspiron-24-all-in-one/spd/inspiron-24-5420-aio/id5420tp1j1001orw3";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttondell2youtube(View v){
        String w ="https://youtu.be/YHGlEwBDLeM?si=U57k2a3ArjM075Jp";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}