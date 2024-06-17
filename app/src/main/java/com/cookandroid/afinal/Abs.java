package com.cookandroid.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abs);
        setTitle("복근 운동");

        Button plank = (Button) findViewById(R.id.plank);
        Button haningKneeRaise = (Button) findViewById(R.id.haningKneeRaise);
        Button legRaise = (Button) findViewById(R.id.legRaise);
        Button exit = (Button) findViewById(R.id.exit);
        Button russinaTwist = (Button) findViewById(R.id.russianTwist);
        Button reverseCrunch = (Button) findViewById(R.id.reverseCrunch);

        plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Plank.class);
                startActivity(intent);
            }
        });

        haningKneeRaise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HangingKneeRaise.class);
                startActivity(intent);
            }
        });

        legRaise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LegRaise.class);
                startActivity(intent);
            }
        });

        russinaTwist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RussianTwist.class);
                startActivity(intent);
            }
        });

        reverseCrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReverseCrunch.class);
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
