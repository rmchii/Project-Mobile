package com.example.outdoorware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class beranda2 extends AppCompatActivity {

    // Deklarasi tombol
    private Button rentButton4, rentButton5, rentButton6, rentButton7, rentButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda2); // Pastikan nama file layout sesuai

        // Hubungkan tombol dengan ID di XML
        rentButton4 = findViewById(R.id.rent_button4);
        rentButton5 = findViewById(R.id.rent_button5);
        rentButton6 = findViewById(R.id.rent_button6);
        rentButton7 = findViewById(R.id.rent_button7);
        rentButton8 = findViewById(R.id.rent_button8);

        // Event untuk rentButton4
        rentButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("Sepatu Running", "Rp.40.000/day");
            }
        });

        // Event untuk rentButton5
        rentButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("Carrier", "Rp.40.000/day");
            }
        });

        // Event untuk rentButton6
        rentButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("Trekking Pole", "Rp.15.000/day");
            }
        });

        // Event untuk rentButton7
        rentButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("Hydropack", "Rp.15.000/day");
            }
        });

        // Event untuk rentButton8
        rentButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPesanan("1 set alat masak", "Rp.30.000/day");
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
