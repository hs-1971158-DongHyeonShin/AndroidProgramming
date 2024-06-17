package com.cookandroid.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chest);
        setTitle("가슴 운동");

        Button benchPress = (Button) findViewById(R.id.benchPress);
        Button seatedChestPress = (Button) findViewById(R.id.seatedChestPress);
        Button seatedChestFly = (Button) findViewById(R.id.seatedChestFly);
        Button chestDip = (Button) findViewById(R.id.chestDip);
        Button pushUp = (Button) findViewById(R.id.pushUp);
        Button exit = (Button) findViewById(R.id.exit);

        benchPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BenchPress.class);
                startActivity(intent);
            }
        });

        seatedChestPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SeatedChestPress.class);
                startActivity(intent);
            }
        });

        seatedChestFly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SeatedChestFly.class);
                startActivity(intent);
            }
        });

        chestDip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChestDip.class);
                startActivity(intent);
            }
        });

        pushUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PushUp.class);
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
