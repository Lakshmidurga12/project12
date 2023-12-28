package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class apple1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple1);

    }
public void Buttonapple(View v){
    String w ="https://www.apple.com/in/shop/buy-mac/macbook-air/15-inch-space-grey-apple-m2-chip-with-8-core-cpu-and-10-core-gpu-256gb?afid=p238%7CsDC3IrGdN-dc_mtid_187079nc38483_pcrid_467299283002_pgrid_116476338184_pntwk_g_pchan_online_pexid__&cid=aos-IN-kwgo-pla-mac--slid---product-MQKP3HN/A-IN";   //this section only uses for the Subject link
    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
    startActivity(i);

}
    public void Buttonappleyoutube(View v){
        String w ="https://youtu.be/0okuAwqTHs0?si=CsadCZMOPZfMaxHW";   //this section only uses for the Subject link
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);

    }
}