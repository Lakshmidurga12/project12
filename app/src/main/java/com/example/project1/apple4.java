package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class apple4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple4);
    }

    public void viewdetails2(View v) {
        String w = "https://www.apple.com/in/macbook-pro/specs/";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }

    public void youtube4(View v) {
        String w = "https://youtu.be/pSdKnNj7ozk?si=1zaBjcFMy1vIOyVQ";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);
    }
}