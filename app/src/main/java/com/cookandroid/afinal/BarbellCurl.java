package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class BarbellCurl extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barbell_curl);
        setTitle("바벨 컬");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vBarbellCurl = (VideoView) findViewById(R.id.vBarbellCurl);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vBarbellCurl);
        vBarbellCurl.setMediaController(mediaController);
        vBarbellCurl.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.barbellcurl);
        vBarbellCurl.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vBarbellCurl.start();
            }
        });
    }

}

