package com.example.reproduciraudioyvideo_semana5;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = (VideoView)findViewById(R.id.videoView);

        String path = "android.resource://"+ getPackageName() + "/" +
                R.raw.mike;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}