package com.aslam.mymusic;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.exoplayer2.ui.StyledPlayerControlView;

public class MainActivity extends AppCompatActivity {

    private StyledPlayerControlView styledPlayerControlView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        styledPlayerControlView = findViewById(R.id.exo_play);


    }
}