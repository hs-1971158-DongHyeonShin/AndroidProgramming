package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PreacherCurl extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preacher_curl);
        setTitle("프리처 컬");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vPreacherCurl = (VideoView) findViewById(R.id.vPreacherCurl);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vPreacherCurl);
        vPreacherCurl.setMediaController(mediaController);
        vPreacherCurl.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.preachercurl);
        vPreacherCurl.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vPreacherCurl.start();
            }
        });
    }

}
