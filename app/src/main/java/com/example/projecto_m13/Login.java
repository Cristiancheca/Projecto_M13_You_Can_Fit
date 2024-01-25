package com.example.projecto_m13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(1000); // hacemos que el splash screen tarde 1 segundo en cargar
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setTheme(R.style.Base_Theme_Projecto_M13); // Asignacion de splashScreen antes en de entrar al login
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}