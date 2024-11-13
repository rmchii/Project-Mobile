package com.example.outdoorware;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_detail);

        // Ambil data dari intent
        String itemName = getIntent().getStringExtra("ITEM_NAME");
        String price = getIntent().getStringExtra("ITEM_PRICE");

        // Temukan TextView di layout
        TextView itemNameText = findViewById(R.id.item_name);
        TextView priceText = findViewById(R.id.item_price);

        // Set text
        itemNameText.setText(itemName);
        priceText.setText(price);
    }
}