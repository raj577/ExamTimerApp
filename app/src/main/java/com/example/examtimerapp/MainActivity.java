package com.example.examtimerapp;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
MediaPlayer m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final TextView mnumber = findViewById(R.id.mnumber);
       final TextView done = findViewById(R.id.done);
        m1 = MediaPlayer.create(this, R.raw.four);
        new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilFinished) {
                mnumber.setText("seconds remaining" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mnumber.setText("Time Left 0");
                done.setText("Done !!");
                m1.start();
            }
        }.start();
    }
}
