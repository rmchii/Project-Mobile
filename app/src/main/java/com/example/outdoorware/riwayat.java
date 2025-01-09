package com.example.outdoorware;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;

public class riwayat extends AppCompatActivity {

    private TextView profilPengguna, namaPengguna, phoneNumber, address, rentalSummaryTitle, itemName, itemPrice;
    private ImageView phoneIcon, addressIcon, itemIcon;
    private MaterialButton btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);

        // Inisialisasi Views
        profilPengguna = findViewById(R.id.profilPengguna);
        namaPengguna = findViewById(R.id.namaPengguna);
        phoneNumber = findViewById(R.id.phoneNumber);
        address = findViewById(R.id.address);
        rentalSummaryTitle = findViewById(R.id.rentalSummaryTitle);
        itemName = findViewById(R.id.item_name);
        itemPrice = findViewById(R.id.item_price);
        phoneIcon = findViewById(R.id.imageView3);
        addressIcon = findViewById(R.id.imageView4);
        btnKeluar = findViewById(R.id.btnKeluar);

        // Mengatur informasi yang ditampilkan
        profilPengguna.setText("Profil Pengguna");
        namaPengguna.setText("Suci Maolia");
        phoneNumber.setText("089988888888");
        address.setText("Jl. Cikarang Cibarusah, Sindangmulya Cibarusah");
        rentalSummaryTitle.setText("Riwayat Pesanan");

        // Menampilkan item pesanan
        itemName.setText("Trekking Pole");
        itemPrice.setText("Rp.15.000/day");

        // Listener untuk tombol keluar
        btnKeluar.setOnClickListener(view -> {
            // Implementasi untuk logout atau menutup aktivitas
            finish();
        });
    }
}
