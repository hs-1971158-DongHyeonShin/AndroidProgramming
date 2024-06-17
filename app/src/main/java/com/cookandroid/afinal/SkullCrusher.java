package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SkullCrusher extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skull_crusher);
        setTitle("스컬 크러셔");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vSkullCrusher = (VideoView) findViewById(R.id.vSkullCrusher);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vSkullCrusher);
        vSkullCrusher.setMediaController(mediaController);
        vSkullCrusher.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.skullcrusher);
        vSkullCrusher.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vSkullCrusher.start();
            }
        });
    }

}

