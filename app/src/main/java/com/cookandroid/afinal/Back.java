package com.cookandroid.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back);
        setTitle("등 운동");

        Button deadLift = (Button) findViewById(R.id.deadLift);
        Button latPulldown = (Button) findViewById(R.id.latPullDown);
        Button seatedRow = (Button) findViewById(R.id.seatedRow);
        Button bentOverRow = (Button) findViewById(R.id.bentOverRow);
        Button pullUp = (Button) findViewById(R.id.pullUp);
        Button exit = (Button) findViewById(R.id.exit);

        deadLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DeadLift.class);
                startActivity(intent);
            }
        });

        latPulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LatPulldown.class);
                startActivity(intent);
            }
        });

        seatedRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SeatedRow.class);
                startActivity(intent);
            }
        });

        bentOverRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BentOverRow.class);
                startActivity(intent);
            }
        });

        pullUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PullUp.class);
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
