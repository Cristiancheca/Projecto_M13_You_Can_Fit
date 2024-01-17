package com.example.projecto_m13;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class primera_actividad extends AppCompatActivity {

    private VideoView Video_entrenamiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Video_entrenamiento = findViewById(R.id.Video_entrenamiento);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;

        Uri uri = Uri.parse(videoPath);

        Video_entrenamiento.setVideoURI(uri);

        Video_entrenamiento.start();
    }
}