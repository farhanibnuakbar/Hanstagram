package com.android.hanstagram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button btnLogin;
    EditText txtusername;
    EditText txtpassword;
    ImageView imageView;
    TextView txtDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtusername = findViewById(R.id.username);
        txtpassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        imageView = findViewById(R.id.imgleft);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika ImageView ditekan
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });

        txtDaftar = findViewById(R.id.txtDaftar);
        txtDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil intent atau lakukan tindakan lainnya
                // ketika ImageView ditekan
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });
    }

    private void login() {
        String username = txtusername.getText().toString().trim();
        String password = txtpassword.getText().toString().trim();

        if (username.isEmpty()) {
            Toast.makeText(this, "Masukkan username", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Masukkan password", Toast.LENGTH_SHORT).show();
            return;
        }

        // Jika kode ini dijalankan, berarti username dan password telah diisi.
        if (username.equals("Elin") && password.equals("elin123")) {
            // Username dan password valid, pindah ke halaman layout berikutnya
            Intent intent = new Intent(Login.this, Beranda.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
