package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SeatedChestPress extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seated_chest_press);
        setTitle("시티드 체스트 프레스");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vSCP = (VideoView) findViewById(R.id.vSeatedChestPress);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vSCP);
        vSCP.setMediaController(mediaController);
        vSCP.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.seatedchestpress);
        vSCP.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vSCP.start();
            }
        });
    }

}