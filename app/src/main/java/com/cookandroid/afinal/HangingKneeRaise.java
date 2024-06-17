package com.cookandroid.afinal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class HangingKneeRaise extends AppCompatActivity {

    private Button exit;
    private VideoView vHanging;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hanging_knee_raise);
        setTitle("행잉 니 레이즈");

        exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        vHanging = (VideoView) findViewById(R.id.vHangingKneeRaise);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vHanging);
        vHanging.setMediaController(mediaController);
        vHanging.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hangingkneeraise);
        vHanging.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                vHanging.start();
            }
        });
    }
}
