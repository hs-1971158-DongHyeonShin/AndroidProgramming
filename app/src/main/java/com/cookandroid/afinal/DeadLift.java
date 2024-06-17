package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DeadLift extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dead_lift);
        setTitle("데드 리프트");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vDeadLift = (VideoView) findViewById(R.id.vDeadLift);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vDeadLift);
        vDeadLift.setMediaController(mediaController);
        vDeadLift.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.deadlift);
        vDeadLift.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vDeadLift.start();
            }
        });
    }

}
