package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PullUp extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pull_up);
        setTitle("풀 업");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vPullUp = (VideoView) findViewById(R.id.vPullUp);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vPullUp);
        vPullUp.setMediaController(mediaController);
        vPullUp.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.pullup);
        vPullUp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vPullUp.start();
            }
        });
    }

}