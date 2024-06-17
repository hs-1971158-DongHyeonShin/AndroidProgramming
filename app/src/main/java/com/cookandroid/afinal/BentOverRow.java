package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class BentOverRow extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bent_over_row);
        setTitle("벤트 오버 로우");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vBentOverRow = (VideoView) findViewById(R.id.vBentOverRow);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vBentOverRow);
        vBentOverRow.setMediaController(mediaController);
        vBentOverRow.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.bentoverrow);
        vBentOverRow.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vBentOverRow.start();
            }
        });
    }

}
