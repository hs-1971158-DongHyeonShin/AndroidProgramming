package com.cookandroid.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Leg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leg);
        setTitle("다리 운동");

        Button legPress = (Button) findViewById(R.id.legPress);
        Button lyingLegCurl = (Button) findViewById(R.id.lyingLegCurl);
        Button legExtension = (Button) findViewById(R.id.legExtension);
        Button lunge = (Button) findViewById(R.id.lunge);
        Button fullSquat = (Button) findViewById(R.id.fullSquat);
        Button exit = (Button) findViewById(R.id.exit);

        legPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LegPress.class);
                startActivity(intent);
            }
        });

        lyingLegCurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LyingLegCurl.class);
                startActivity(intent);
            }
        });

        legExtension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LegExtension.class);
                startActivity(intent);
            }
        });

        lunge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lunge.class);
                startActivity(intent);
            }
        });

        fullSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FullSquat.class);
                startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
