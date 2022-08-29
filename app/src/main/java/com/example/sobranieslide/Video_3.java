package com.example.sobranieslide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Video_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video3);

        //make full screen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_003;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        //autostart
        videoView.start();
        //loop video
        videoView.setOnCompletionListener(mp -> videoView.start());

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> openVideo_4());
    }
    public void openVideo_4() {
        Intent intent = new Intent(this, Video_4.class);
        startActivity(intent);
    }
}