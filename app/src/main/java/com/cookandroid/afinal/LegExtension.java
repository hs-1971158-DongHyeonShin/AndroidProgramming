package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LegExtension extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leg_extension);
        setTitle("레그 익스텐션");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vLE = (VideoView) findViewById(R.id.vLegExtension);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vLE);
        vLE.setMediaController(mediaController);
        vLE.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.legextension);
        vLE.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vLE.start();
            }
        });
    }

}