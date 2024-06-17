package com.cookandroid.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Arm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arm);
        setTitle("팔 운동");

        Button barbellCurl = (Button) findViewById(R.id.barbellCurl);
        Button dumbbellCurl = (Button) findViewById(R.id.dumbbellCurl);
        Button skullCrusher = (Button) findViewById(R.id.skullCrusher);
        Button cablePushdown = (Button) findViewById(R.id.cablePushdown);
        Button preacherCurl = (Button) findViewById(R.id.preacherCurl);
        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        barbellCurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BarbellCurl.class);
                startActivity(intent);
            }
        });

        dumbbellCurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DumbbellCurl.class);
                startActivity(intent);
            }
        });

        skullCrusher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SkullCrusher.class);
                startActivity(intent);
            }
        });

        cablePushdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CablePushdown.class);
                startActivity(intent);
            }
        });

        preacherCurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PreacherCurl.class);
                startActivity(intent);
            }
        });
    }
}
