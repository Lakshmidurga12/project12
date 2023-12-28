package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class hp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp1);
    }
    public void Buttonhp(View v){
        String w ="https://www.amazon.in/HP-Pavilion-14inches-Micro-Edge-14-Ec1003au/dp/B09V1GMW72/ref=asc_df_B09V1GMW72/?tag=googleshopdes-21&linkCode=df0&hvadid=586347496700&hvpos=&hvnetw=g&hvrand=7065277131967641320&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9182031&hvtargid=pla-1680917793324&mcid=508e273213a2332894f2e48d6156429f&gclid=CjwKCAiAp5qsBhAPEiwAP0qeJp92JgXVz3NF2eYdb5lizp6kpiPSBJuuQaeUHY4gBh0wfekzRVKqjxoCwe4QAvD_BwE&th=1";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttonhpyoutube(View v){
        String w ="https://youtu.be/5mXvHH1rW7s?si=JwiwBbJWvMWF5sYV";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }

}