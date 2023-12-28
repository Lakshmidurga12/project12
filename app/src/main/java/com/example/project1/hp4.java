package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class hp4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp4);
    }
    public void Buttonhp4(View v){
        String w ="https://www.hp.com/in-en/shop/?optly_qa_cookie=optly_hp_test&gad_source=1&gclid=CjwKCAiAp5qsBhAPEiwAP0qeJsEO8eshPK7Z4qaC-fhQIXv-vC8jtcAUiSDvInh7wuRGmJK2BZlibhoC-dMQAvD_BwE&gclid=SEM&gclsrc=aw.ds";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttonhp4youtube(View v){
        String w ="https://youtu.be/KdB4v9ssdIY?si=0F0pPHp-033ppPuD";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}