package com.example.outdoorware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BerandaActivity2 extends AppCompatActivity {

    // Deklarasi tombol
    private Button rentButton1, rentButton2, rentButton3, nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        // Hubungkan tombol dengan ID di XML
        rentButton1 = findViewById(R.id.rent_button1);
        rentButton2 = findViewById(R.id.rent_button2);
        rentButton3 = findViewById(R.id.rent_button3);
        nextButton = findViewById(R.id.nextButton);

        // Event untuk rentButton1
        rentButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("Tenda kapasitas 4 orang", "Rp.40.000/day");
            }
        });

        // Event untuk rentButton2
        rentButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("Fly sheet", "Rp.15.000/day");
            }
        });

        // Event untuk rentButton3
        rentButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("Sepatu Outdoor", "Rp.50.000/day");
            }
        });

        // Event untuk tombol nextButton
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke Beranda2Activity
                Intent intent = new Intent(BerandaActivity2.this, beranda2.class);
                startActivity(intent);
            }
        });
    }

    // Fungsi untuk membuka Pesanan Activity dan mengirim data
    private void openPesanan(String itemName, String price) {
        // Menampilkan pesan toast dengan info item yang dipilih
        Toast.makeText(this, "Pesanan: " + itemName + " - " + price, Toast.LENGTH_SHORT).show();

        // Mengirim data ke Pesanan Activity untuk melanjutkan pemesanan
        Intent intent = new Intent(this, Pesanan.class);
        intent.putExtra("ITEM_NAME", itemName);
        intent.putExtra("ITEM_PRICE", price);
        startActivity(intent);
    }
}
