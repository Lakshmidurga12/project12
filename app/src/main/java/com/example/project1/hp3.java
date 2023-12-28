package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class hp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp3);
    }
    public void Buttonhp3(View v){
        String w ="https://www.hp.com/in-en/shop/laptops-tablets/personal-laptops/envy-laptops.html?gad_source=1&gclid=CjwKCAiAp5qsBhAPEiwAP0qeJqTBnQE5Y1HBUwERI3V3sM7gf0HZIoFGtv_hdwJCtp_Hh8BjCgLqqhoCtnQQAvD_BwE&gclsrc=aw.ds&jumpid=ps_a2d980e229&plp-sort-stock=dispatch-within-2-days&processortype=intel-core-i5+intel-core-i7";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttonhp3youtube(View v){
        String w ="https://youtu.be/eq0ki6pHUW8?si=WI10B3xBS5BesYki";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}