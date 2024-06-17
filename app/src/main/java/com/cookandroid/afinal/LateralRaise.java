package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LateralRaise extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lateral_raise);
        setTitle("래터럴 레이즈");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vLR = (VideoView) findViewById(R.id.vLateralRaise);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vLR);
        vLR.setMediaController(mediaController);
        vLR.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lateralraise);
        vLR.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vLR.start();
            }
        });
    }

}