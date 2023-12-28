package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class hp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp2);

    }
    public void Buttonhp2(View v){
        String w ="https://www.hp.com/in-en/shop/laptops-tablets/personal-laptops/victus-laptops.html?processorfamily=11th-generation-intel%C2%AE-core%E2%84%A2-i5-processor+11th-generation-intel%C2%AE-core%E2%84%A2-i7-processor+12th-generation-intel%C2%AE-core%E2%84%A2-i5-processor+12th-generation-intel%C2%AE-core%E2%84%A2-i7-processor+13th-generation-intel%C2%AE-core%E2%84%A2-i5-processor+13th-generation-intel%C2%AE-core%E2%84%A2-i7-processor&gad_source=1&gclid=CjwKCAiAp5qsBhAPEiwAP0qeJhqDInq_gp74kkKMnpwoagg1ljG84cte14SBC3L_Zu4VyFZ3N4YodRoCqwQQAvD_BwE&gclsrc=aw.ds";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
    public void Buttonhp2youtube(View v){
        String w ="https://youtu.be/PQt5NtTEEWI?si=T_dnP5KywewO83xO";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}