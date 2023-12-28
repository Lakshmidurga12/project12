package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class lenovo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovo2);
    }
    public void Buttonlenovo2(View v){
        String w ="https://www.amazon.in/Lenovo-Ideapad-Chromebook-Tablet-25-65/dp/B08LZNH5SF/ref=asc_df_B08LZNH5SF/?tag=googleshopdes-21&linkCode=df0&hvadid=396987508275&hvpos=&hvnetw=g&hvrand=11634586701521246884&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9182031&hvtargid=pla-1006864073956&psc=1&mcid=58b81b8d01073163a5aad44aa421b014&ext_vrnc=hi&gclid=CjwKCAiAp5qsBhAPEiwAP0qeJltTYAcwVD6Zp31MeUOHEC7_frCxSWbew_A9tSQEqTWTkmSxiYMMjhoCtmMQAvD_BwE";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttonlenovo2youtube(View v){
        String w ="https://youtu.be/KcVaTVWocl8?si=cKIC5j5xWW09JiDQ";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}