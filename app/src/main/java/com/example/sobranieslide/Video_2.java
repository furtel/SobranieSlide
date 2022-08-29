package com.example.sobranieslide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Video_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);

        //make full screen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_002;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        //autostart
        videoView.start();
        //loop video
        videoView.setOnCompletionListener(mp -> videoView.start());

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> openVideo_3());
    }
    public void openVideo_3() {
        Intent intent = new Intent(this, Video_3.class);
        startActivity(intent);
    }
}