package com.android.hanstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chat extends AppCompatActivity {

    private ImageView imgleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        imgleft = findViewById(R.id.exit);
        imgleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika ImageView ditekan
                Intent intent = new Intent(Chat.this, FriendProfile.class);
                startActivity(intent);
            }
        });
    }
}