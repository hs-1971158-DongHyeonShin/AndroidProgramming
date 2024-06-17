package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Lunge extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunge);
        setTitle("런지");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vLunge = (VideoView) findViewById(R.id.vLunge);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vLunge);
        vLunge.setMediaController(mediaController);
        vLunge.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lunge);
        vLunge.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vLunge.start();
            }
        });
    }

}