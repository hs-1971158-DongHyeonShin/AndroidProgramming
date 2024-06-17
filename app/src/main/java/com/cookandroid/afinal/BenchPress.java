package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class BenchPress extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bench_press);
        setTitle("벤치 프레스");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vBenchPress = (VideoView) findViewById(R.id.vBenchPress);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vBenchPress);
        vBenchPress.setMediaController(mediaController);
        vBenchPress.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.benchpress);
        vBenchPress.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vBenchPress.start();
            }
        });
    }

}