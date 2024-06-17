package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class RearDeltRow extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rear_delt_row);
        setTitle("리어 델트 로우");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vRDR = (VideoView) findViewById(R.id.vRearDeltRow);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vRDR);
        vRDR.setMediaController(mediaController);
        vRDR.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.reardeltrow);
        vRDR.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vRDR.start();
            }
        });
    }

}
