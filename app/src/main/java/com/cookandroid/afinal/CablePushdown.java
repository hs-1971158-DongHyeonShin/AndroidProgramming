package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class CablePushdown extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cable_pushdown);
        setTitle("케이블 푸쉬다운");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vCablePushdown = (VideoView) findViewById(R.id.vCablePushdown);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vCablePushdown);
        vCablePushdown.setMediaController(mediaController);
        vCablePushdown.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cablepushdown);
        vCablePushdown.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vCablePushdown.start();
            }
        });
    }

}

