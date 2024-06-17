package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SeatedChestFly extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seated_chest_fly);
        setTitle("시티드 체스트 플라이");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vSCF = (VideoView) findViewById(R.id.vSeatedChestFly);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vSCF);
        vSCF.setMediaController(mediaController);
        vSCF.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.seatedchestfly);
        vSCF.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vSCF.start();
            }
        });
    }

}
