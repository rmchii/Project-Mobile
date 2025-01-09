package com.example.outdoorware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Pesanan extends AppCompatActivity {

    private TextView itemNameTextView, itemPriceTextView;
    private Button konfirmasiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesanan); // Pastikan nama file layout sesuai

        // Hubungkan TextView dengan ID di XML
        itemNameTextView = findViewById(R.id.item_name);
        itemPriceTextView = findViewById(R.id.item_price);
        konfirmasiButton = findViewById(R.id.confirmationButton);

        // Terima data dari Intent
        Intent intent = getIntent();
        String itemName = intent.getStringExtra("ITEM_NAME");
        String itemPrice = intent.getStringExtra("ITEM_PRICE");

        // Tampilkan data di TextView
        itemNameTextView.setText(itemName);
        itemPriceTextView.setText(itemPrice);

        // Set listener untuk tombol konfirmasi
        konfirmasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan ketika tombol konfirmasi ditekan
                Toast.makeText(Pesanan.this, "Pesanan telah dikonfirmasi!", Toast.LENGTH_SHORT).show();

                // Aksi lain (contohnya kembali ke halaman utama atau menampilkan halaman lain)
                Intent konfirmasiIntent = new Intent(Pesanan.this, riwayat.class); // Ganti dengan Activity yang sesuai
                startActivity(konfirmasiIntent);
            }
        });
    }
}
