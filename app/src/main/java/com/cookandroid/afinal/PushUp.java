package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PushUp extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.push_up);
        setTitle("푸쉬 업");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vPushUp = (VideoView) findViewById(R.id.vPushUp);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vPushUp);
        vPushUp.setMediaController(mediaController);
        vPushUp.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.pushup);
        vPushUp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vPushUp.start();
            }
        });
    }
}

