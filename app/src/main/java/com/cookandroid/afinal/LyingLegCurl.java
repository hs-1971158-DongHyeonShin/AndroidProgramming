package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LyingLegCurl extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lying_leg_curl);
        setTitle("라잉 레그 컬");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vLLC = (VideoView) findViewById(R.id.vLyingLegCurl);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vLLC);
        vLLC.setMediaController(mediaController);
        vLLC.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lyinglegcurl);
        vLLC.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vLLC.start();
            }
        });
    }

}
