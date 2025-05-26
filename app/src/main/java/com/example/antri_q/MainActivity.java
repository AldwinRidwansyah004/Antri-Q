package com.example.yourapp; // Ganti dengan nama package kamu

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000; // waktu splash dalam milidetik (3 detik)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // pakai layout splash

        // Jalankan delay, lalu pindah ke halaman berikutnya
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish(); // agar tidak bisa kembali ke splash screen
        }, SPLASH_DURATION);
    }
}
