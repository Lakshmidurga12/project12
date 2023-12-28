package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class lenovo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovo4);
    }
    public void Buttonlenovo4(View v){
        String w ="https://shop.gadgetsnow.com/laptops/lenovo-ideapad-gaming-3-81y4017uin-laptop-intel-core-i5-10th-gen-nvidia-geforce-1650-ti-8gb-512gb-ssd-windows-10/10041/p_G280259?gclid=CjwKCAiAp5qsBhAPEiwAP0qeJlug2QR2OrkT2phHb-lJDNlekP--qQBQkcVHnvdz7w8hDK-AAX-8uBoC5-sQAvD_BwE";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttonlenovo4youtube(View v){
        String w ="https://youtu.be/Jp8V-IRWT3U?si=T7RuaxwfeAEYCOZE";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}