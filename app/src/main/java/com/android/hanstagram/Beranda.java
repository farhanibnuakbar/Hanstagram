package com.android.hanstagram;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Beranda extends AppCompatActivity {

    private TextView textFarhan;
    private TextView textTekomd21;
    private TextView textRayhan;
    private TextView textYasin;
    private TextView textFadly;
    private TextView textIka;
    private ImageView imgStory1;
    private ImageView imgStory2;
    private ImageView imgStory3;
    private ImageView imgStory4;
    private ImageView imgStory5;
    private ImageView imgStory6;
    private ImageView imgStory7;
    private static final long DELAY_TIME_MS = 5000; // Waktu tunda dalam milidetik (di sini 5 detik)
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        imgStory1 = findViewById(R.id.imgStory1);
        imgStory2 = findViewById(R.id.imgStory2);
        imgStory3 = findViewById(R.id.imgStory3);
        imgStory4 = findViewById(R.id.imgStory4);
        imgStory5 = findViewById(R.id.imgStory5);
        imgStory6 = findViewById(R.id.imgStory6);
        imgStory7 = findViewById(R.id.imgStory7);

        imgStory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Story
                Intent intent = new Intent(Beranda.this, Story1.class);
                startActivity(intent);
                finish(); // Menutup halaman Beranda sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });

        imgStory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Story
                Intent intent = new Intent(Beranda.this, Story2.class);
                startActivity(intent);
                finish(); // Menutup halaman Beranda sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });

        imgStory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Story
                Intent intent = new Intent(Beranda.this, Story3.class);
                startActivity(intent);
                finish(); // Menutup halaman Beranda sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });

        imgStory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Story
                Intent intent = new Intent(Beranda.this, Story4.class);
                startActivity(intent);
                finish(); // Menutup halaman Beranda sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });

        imgStory5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Story
                Intent intent = new Intent(Beranda.this, Story5.class);
                startActivity(intent);
                finish(); // Menutup halaman Beranda sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });

        imgStory6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Story
                Intent intent = new Intent(Beranda.this, Story6.class);
                startActivity(intent);
                finish(); // Menutup halaman Beranda sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });

        imgStory7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Story
                Intent intent = new Intent(Beranda.this, Story7.class);
                startActivity(intent);
                finish(); // Menutup halaman Beranda sehingga tidak dapat kembali ke halaman ini melalui tombol back
            }
        });


        textFarhan = findViewById(R.id.txtfarhan);
        textFarhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika TextView ditekan
                Intent intent = new Intent(Beranda.this, FriendProfile.class);
                startActivity(intent);
            }
        });

        textTekomd21 = findViewById(R.id.txttekomd21);
        textTekomd21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika TextView ditekan
                Intent intent = new Intent(Beranda.this, FriendProfile1.class);
                startActivity(intent);
            }
        });

        textRayhan = findViewById(R.id.txtrayhan);
        textRayhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika TextView ditekan
                Intent intent = new Intent(Beranda.this, FriendProfil2.class);
                startActivity(intent);
            }
        });

        textYasin = findViewById(R.id.txtyasin);
        textYasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika TextView ditekan
                Intent intent = new Intent(Beranda.this, FriendProfil3.class);
                startActivity(intent);
            }
        });

        textFadly = findViewById(R.id.txtfadly);
        textFadly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika TextView ditekan
                Intent intent = new Intent(Beranda.this, FriendProfil4.class);
                startActivity(intent);
            }
        });

        textIka = findViewById(R.id.txtIka);
        textIka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika TextView ditekan
                Intent intent = new Intent(Beranda.this, FriendProfil5.class);
                startActivity(intent);
            }
        });

    }
}
