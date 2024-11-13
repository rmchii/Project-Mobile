package com.example.outdoorware;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Masuk = findViewById(R.id.Masuk);
        Masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Corrected code to initialize the intent
                Intent intent = new Intent(MainActivity.this, BerandaActivity2.class);
                startActivity(intent);
            }
        });

    }
}
