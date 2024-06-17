package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Plank extends AppCompatActivity {

    private VideoView vPlank;
    private Button exit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plank);
        setTitle("플랭크");

        exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        vPlank = (VideoView) findViewById(R.id.vPlank);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vPlank);
        vPlank.setMediaController(mediaController);
        vPlank.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.plank);
        vPlank.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vPlank.start();
            }
        });
    }
}
