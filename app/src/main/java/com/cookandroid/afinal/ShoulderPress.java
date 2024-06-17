package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ShoulderPress extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulder_press);
        setTitle("숄더 프레스");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vSP = (VideoView) findViewById(R.id.vShoulderPress);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vSP);
        vSP.setMediaController(mediaController);
        vSP.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.shoulderpress);
        vSP.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vSP.start();
            }
        });
    }

}
