package com.cookandroid.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("운동 선택");

        Button chest = (Button) findViewById(R.id.chest);
        Button leg = (Button) findViewById(R.id.leg);
        Button back = (Button) findViewById(R.id.back);
        Button shoulder = (Button) findViewById(R.id.shoulder);
        Button arm = (Button) findViewById(R.id.arm);
        Button abs = (Button) findViewById(R.id.abs);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chest.class);
                startActivity(intent);
            }
        });

        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Leg.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Back.class);
                startActivity(intent);
            }
        });

        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Shoulder.class);
                startActivity(intent);
            }
        });

        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Arm.class);
                startActivity(intent);
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Abs.class);
                startActivity(intent);
            }
        });
    }
}