package com.example.sobranieslide;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make full screen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> openVideo_2());
    }
    public void openVideo_2() {
        Intent intent = new Intent(this, Video_2.class);
        startActivity(intent);
    }
}