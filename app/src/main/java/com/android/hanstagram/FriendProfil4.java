package com.android.hanstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FriendProfil4 extends AppCompatActivity {

    private ImageView imgleft;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_profil4);

        imgleft = findViewById(R.id.left2);
        imgleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perintah untuk membuat ketika gambar diklik akan kembali kehalaman berikutnya
                Intent intent = new Intent(FriendProfil4.this, Beranda.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.btn_message);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perintah untuk membuat ketika button diklik akan kehalaman berikutnya
                Intent intent = new Intent(FriendProfil4.this, Chat5.class);
                startActivity(intent);
            }
        });
    }
}