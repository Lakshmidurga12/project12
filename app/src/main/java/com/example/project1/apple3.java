package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class apple3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple3);

    }
    public void viewdetails(View v){
        String w ="https://www.amazon.in/Apple-MacBook-Chip-13-inch-256GB/dp/B08N5W4NNB/ref=asc_df_B08N5W4NNB/?tag=googleshopdes-21&linkCode=df0&hvadid=397082384639&hvpos=&hvnetw=g&hvrand=11891185649804445122&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9182031&hvtargid=pla-1136686879362&mcid=9ad65b98b6723b2c8aaca1185061d230&ext_vrnc=hi&gclid=CjwKCAiAp5qsBhAPEiwAP0qeJnH7YP7TyC0J9rP_qVFwdA6y09b1HzzVsgQvMeD_JVykLOWJzEszphoCEzUQAvD_BwE&th=1";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void youtube3(View v){
        String w ="https://youtu.be/WBfnpjeEvPA?si=bHoHqeypFiAQXhzW";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}