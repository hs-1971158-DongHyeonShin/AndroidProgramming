package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DumbbellCurl extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dumbbell_curl);
        setTitle("덤벨 컬");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vDumbbellCurl = (VideoView) findViewById(R.id.vDumbbellCurl);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vDumbbellCurl);
        vDumbbellCurl.setMediaController(mediaController);
        vDumbbellCurl.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.dumbbellcurl);
        vDumbbellCurl.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vDumbbellCurl.start();
            }
        });
    }

}
