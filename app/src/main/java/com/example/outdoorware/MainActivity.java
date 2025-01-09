package com.example.outdoorware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button masukButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan nama file XML Anda adalah activity_main.xml

        // Inisialisasi tombol
        masukButton = findViewById(R.id.Masuk);

        // Set onClickListener pada tombol
        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman berikutnya (BerandaActivity2)
                Intent intent = new Intent(MainActivity.this, BerandaActivity2.class);
                startActivity(intent);
            }
        });
    }
}
