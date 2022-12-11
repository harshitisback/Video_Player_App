package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView , videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // id's
        videoView = findViewById(R.id.videoview);
        videoView2  = findViewById(R.id.videoView2);

        // from local storage
        videoView.setVideoPath(
                "android.resource://"+
                getPackageName()+"/"+R.raw.donate_clip);

        MediaController mc = new MediaController(this); // media controller it having controll
        // over medio like buttons forward play pause and others
        mc.setAnchorView(videoView); // setting media controller with videoView
        videoView.setMediaController(mc);

        // from url internet
        Uri uri = Uri.parse("https://biteable.com/static-assets/homepage/HubpageVideo_Short_16x9_01.mp4");
        videoView2.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        mc2.setMediaPlayer(videoView2);
        videoView2.setMediaController(mc2);
        videoView2.start();





    }
}