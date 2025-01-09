package com.example.outdoorware;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pickup extends AppCompatActivity {

    private EditText pickUpDate, returnDate, firstName, lastName, phoneNumber;
    private Button reserveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup); // Pastikan ini mengarah ke XML layout yang sudah dibuat

        // Inisialisasi View
        pickUpDate = findViewById(R.id.pick_up_date);
        returnDate = findViewById(R.id.return_date);
        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        phoneNumber = findViewById(R.id.phone_number);
        reserveButton = findViewById(R.id.reserve_button);

        // Event untuk tombol reserve
        reserveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleReservation();
            }
        });
    }

    private void handleReservation() {
        // Mengambil input dari pengguna
        String pickUp = pickUpDate.getText().toString().trim();
        String returnD = returnDate.getText().toString().trim();
        String fName = firstName.getText().toString().trim();
        String lName = lastName.getText().toString().trim();
        String phone = phoneNumber.getText().toString().trim();

        // Validasi input
        if (pickUp.isEmpty() || returnD.isEmpty() || fName.isEmpty() || lName.isEmpty() || phone.isEmpty()) {
            Toast.makeText(this, "Semua kolom harus diisi!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Proses reservasi (untuk sekarang hanya tampilkan pesan)
        String message = "Reservasi berhasil untuk:\n" +
                "Nama: " + fName + " " + lName + "\n" +
                "Pick Up: " + pickUp + "\n" +
                "Return: " + returnD + "\n" +
                "Telepon: " + phone;

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
