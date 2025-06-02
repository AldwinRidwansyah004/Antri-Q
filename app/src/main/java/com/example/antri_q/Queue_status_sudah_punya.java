package com.example.antri_q;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Queue_status_sudah_punya extends AppCompatActivity {

    TextView tvQueueNumber;
    Button btnCancelQueue;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQueueNumber = findViewById(R.id.tvQueueNumber);
        btnCancelQueue = findViewById(R.id.btnCancelQueue);

        btnCancelQueue.setOnClickListener(v -> {
            Toast.makeText(Queue_status_sudah_punya.this, "Queue cancelled.", Toast.LENGTH_SHORT).show();
            tvQueueNumber.setText("--");
        });
    }
}
