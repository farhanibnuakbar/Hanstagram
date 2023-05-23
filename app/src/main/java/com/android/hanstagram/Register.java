package com.android.hanstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private Button btnRegister;
    private ImageView imgLeft;
    private TextView txtMasuk;
    private EditText txtusername;
    private EditText txtpassword;
    private EditText txtpassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtusername = findViewById(R.id.username);
        txtpassword = findViewById(R.id.password);
        txtpassword2 = findViewById(R.id.password2);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        imgLeft = findViewById(R.id.imgleft);
        imgLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika ImageView ditekan
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
            }
        });

        txtMasuk = findViewById(R.id.txtMasuk);
        txtMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika ImageView ditekan
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });
    }

    private void login() {
        String username = txtusername.getText().toString().trim();
        String password = txtpassword.getText().toString().trim();
        String password2 = txtpassword2.getText().toString().trim();

        if (username.isEmpty()) {
            Toast.makeText(this, "Masukkan username", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Masukkan password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password2.isEmpty()) {
            Toast.makeText(this, "Masukkan ulang password", Toast.LENGTH_SHORT).show();
            return;
        }

        // Jika kode ini dijalankan, berarti username dan password telah diisi.
        if (password.equals(password2)) {
            // Username dan password valid, pindah ke halaman layout berikutnya
            Intent intent = new Intent(Register.this, Beranda.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "password anda salah!", Toast.LENGTH_SHORT).show();
        }
    }
}