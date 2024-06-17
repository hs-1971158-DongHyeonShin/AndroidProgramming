package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LatPulldown extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lat_pulldown);
        setTitle("랫 풀다운");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vLatPulldown = (VideoView) findViewById(R.id.vLatPulldown);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vLatPulldown);
        vLatPulldown.setMediaController(mediaController);
        vLatPulldown.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.latpulldown);
        vLatPulldown.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vLatPulldown.start();
            }
        });
    }

}
