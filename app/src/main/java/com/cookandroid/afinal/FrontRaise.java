package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FrontRaise extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_raise);
        setTitle("프런트 레이즈");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vFR = (VideoView) findViewById(R.id.vFrontRaise);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vFR);
        vFR.setMediaController(mediaController);
        vFR.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.frontraise);
        vFR.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vFR.start();
            }
        });
    }

}
