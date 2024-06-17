package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class RussianTwist extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.russian_twist);
        setTitle("러시안 트위스트");

        Button exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        VideoView vRussianTwist = (VideoView) findViewById(R.id.vRussianTwist);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vRussianTwist);
        vRussianTwist.setMediaController(mediaController);
        vRussianTwist.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.russiantwist);
        vRussianTwist.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vRussianTwist.start();
            }
        });
    }

}
