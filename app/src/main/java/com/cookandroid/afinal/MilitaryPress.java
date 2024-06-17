package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MilitaryPress extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.military_press);
        setTitle("밀리터리 프레스");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vMP = (VideoView) findViewById(R.id.vMilitaryPress);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vMP);
        vMP.setMediaController(mediaController);
        vMP.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.militarypress);
        vMP.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vMP.start();
            }
        });
    }

}
