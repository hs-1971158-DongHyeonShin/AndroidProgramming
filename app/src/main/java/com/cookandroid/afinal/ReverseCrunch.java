package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ReverseCrunch extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reverse_crunch);
        setTitle("리버스 크런치");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vReverseCrunch = (VideoView) findViewById(R.id.vReverseCrunch);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vReverseCrunch);
        vReverseCrunch.setMediaController(mediaController);
        vReverseCrunch.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.reversecrunch);
        vReverseCrunch.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vReverseCrunch.start();
            }
        });
    }

}
