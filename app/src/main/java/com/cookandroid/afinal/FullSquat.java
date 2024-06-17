package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FullSquat extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_squat);
        setTitle("풀 스쿼트");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vFS = (VideoView) findViewById(R.id.vFullSquat);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vFS);
        vFS.setMediaController(mediaController);
        vFS.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.fullsquat);
        vFS.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vFS.start();
            }
        });
    }

}
