package com.example.belajarkomponen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Event_Handlers extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event__handlers);

        Button btnAnonymous = findViewById(R.id.btnAnonymous);

        Button btnInterface1 = findViewById(R.id.btnInterface1);
        Button btnInterface2 = findViewById(R.id.btnInterface2);

        btnAnonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Event_Handlers.this, "Anda menggunakan method Anonymous Inner Class", Toast.LENGTH_SHORT).show();
            }
        });

        btnInterface1.setOnClickListener(this);
        btnInterface2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String label = ((Button)v).getText().toString();
        Toast.makeText(this, "Anda Memakan " + label + "_ Menggunakan Implementasi Interface Listener",Toast.LENGTH_SHORT).show();
    }

//    Menggunakan Registration Layout File
    public void pencet(View view) {
        String label = ((Button)view).getText().toString();
        Toast.makeText(this, "Anda menekan button" + label + "menggunakan Method Pencet dari Registration Layout file",
                Toast.LENGTH_SHORT).show();
    }

    public void tekan(View view) {
        String label = ((Button)view).getText().toString();
        Toast.makeText(this, "Anda menekan button " + label + " _ menggunakan Method Tekan dari Registration Layout file",
                Toast.LENGTH_SHORT).show();
    }
}