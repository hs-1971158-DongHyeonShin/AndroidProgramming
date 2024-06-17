package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ChestDip extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chest_dip);
        setTitle("체스트 딥");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vCD = (VideoView) findViewById(R.id.vChestDip);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vCD);
        vCD.setMediaController(mediaController);
        vCD.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.chestdip);
        vCD.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vCD.start();
            }
        });
    }

}
