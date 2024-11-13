package com.example.outdoorware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BerandaActivity2 extends AppCompatActivity {

    private Button rentButton1, rentButton2, rentButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        rentButton1 = findViewById(R.id.rent_button1);
        rentButton2 = findViewById(R.id.rent_button2);
        rentButton3 = findViewById(R.id.rent_button3);

        rentButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRentDetail("Tenda kapasitas 4 orang", "Rp.40.000/day");
            }
        });

        rentButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRentDetail("Fly shet", "Rp.15.000/day");
            }
        });

        rentButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRentDetail("Sepatu Outdoor", "Rp.50.000/day");
            }
        });
    }

    private void openRentDetail(String itemName, String price) {

        String message = "Selected: " + itemName + " - " + price;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        // Uncomment kode di bawah ini jika sudah membuat RentDetailActivity
        /*
        Intent intent = new Intent(this, RentDetailActivity.class);
        intent.putExtra("ITEM_NAME", itemName);
        intent.putExtra("ITEM_PRICE", price);
        startActivity(intent);
        */
    }
}