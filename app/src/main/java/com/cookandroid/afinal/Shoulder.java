package com.cookandroid.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulder);
        setTitle("어깨 운동");

        Button militaryPress = (Button) findViewById(R.id.militaryPress);
        Button lateralRaise = (Button) findViewById(R.id.lateralRaise);
        Button frontRaise = (Button) findViewById(R.id.frontRaise);
        Button rearDeltRow = (Button) findViewById(R.id.rearDeltRow);
        Button shoulderPress = (Button) findViewById(R.id.shoulderPress);
        Button exit = (Button) findViewById(R.id.exit);

        militaryPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MilitaryPress.class);
                startActivity(intent);
            }
        });

        lateralRaise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LateralRaise.class);
                startActivity(intent);
            }
        });

        frontRaise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrontRaise.class);
                startActivity(intent);
            }
        });

        rearDeltRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RearDeltRow.class);
                startActivity(intent);
            }
        });

        shoulderPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShoulderPress.class);
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
