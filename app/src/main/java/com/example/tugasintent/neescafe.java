package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class neescafe extends AppCompatActivity {
    Button btnnn1, btnnn2, btnnn3, btnnn4, btnnn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neescafe);
        btnnn1 = findViewById(R.id.btnnn1);
        btnnn2 = findViewById(R.id.btnnn2);
        btnnn3 = findViewById(R.id.btnnn3);
        btnnn4 = findViewById(R.id.btnnn4);
        btnnn5 = findViewById(R.id.btnn5);
        Klik();
    }
    void Klik(){
        btnnn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnsf1 = new Intent(neescafe.this, nscchapuchino.class);
                startActivity(intentnsf1);
            }
        });
        btnnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnsf2 = new Intent(neescafe.this, nsccaramel.class);
                startActivity(intentnsf2);
            }
        });
        btnnn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnsf3 = new Intent(neescafe.this, nscmhoca.class);
                startActivity(intentnsf3);
            }
        });
        btnnn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnsf4 = new Intent(neescafe.this, nscoriginal.class);
                startActivity(intentnsf4);
            }
        });
        btnnn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnsf5 = new Intent(neescafe.this, nsclatte.class);
                startActivity(intentnsf5);
            }
        });
    }
}