package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SeatedRow extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seated_row);
        setTitle("시티드 로우");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vSeatedRow = (VideoView) findViewById(R.id.vSeatedRow);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vSeatedRow);
        vSeatedRow.setMediaController(mediaController);
        vSeatedRow.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.seatedrow);
        vSeatedRow.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vSeatedRow.start();
            }
        });
    }

}