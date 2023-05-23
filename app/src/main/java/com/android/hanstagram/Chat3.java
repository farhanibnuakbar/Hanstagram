package com.android.hanstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chat3 extends AppCompatActivity {

    private ImageView imgleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat3);

        imgleft = findViewById(R.id.exit);
        imgleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika ImageView ditekan
                Intent intent = new Intent(Chat3.this, FriendProfil2.class);
                startActivity(intent);
            }
        });
    }
}