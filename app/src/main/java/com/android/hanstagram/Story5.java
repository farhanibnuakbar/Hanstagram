package com.android.hanstagram;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Story5 extends AppCompatActivity {

    private static final long DELAY_TIME_MS = 5000; // Waktu tunda dalam milidetik (di sini 5 detik)

    private Handler handler;
    ImageView imgsh5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story5);

        imgsh5 = findViewById(R.id.sh5);
        imgsh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika ImageView ditekan
                Intent intent = new Intent(Story5.this, Story6.class);
                startActivity(intent);
                finish(); // Menutup halaman Story2 sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });

        // Menunda pengalihan kembali ke halaman Beranda setelah waktu tertentu
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Kode yang akan dieksekusi setelah waktu tertentu
                kembaliKeBeranda();
            }
        }, DELAY_TIME_MS);
    }

    // Metode untuk kembali ke halaman Beranda
    private void kembaliKeBeranda() {
        Intent intent = new Intent(Story5.this, Story6.class);
        startActivity(intent);
        finish(); // Menutup halaman Story sehingga tidak dapat kembali ke halaman ini melalui tombol back
    }

    // Memastikan untuk menghapus tugas handler ketika aktivitas dihancurkan
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}