package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LegPress extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leg_press);
        setTitle("레그 프레스");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vLegPress = (VideoView) findViewById(R.id.vLegPress);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vLegPress);
        vLegPress.setMediaController(mediaController);
        vLegPress.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.legpress);
        vLegPress.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vLegPress.start();
            }
        });
    }

}

