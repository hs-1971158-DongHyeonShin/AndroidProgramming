package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LegRaise extends AppCompatActivity {

    private Button exit;
    private VideoView vLegRaise;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leg_raise);
        setTitle("레그 레이즈");

        exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        vLegRaise = (VideoView) findViewById(R.id.vLegRaise);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vLegRaise);
        vLegRaise.setMediaController(mediaController);
        vLegRaise.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.legraise);
        vLegRaise.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vLegRaise.start();
            }
        });
    }
}
