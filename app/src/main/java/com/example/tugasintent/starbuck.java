package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class starbuck extends AppCompatActivity {
    Button btnn1, btnn2, btnn3, btnn4, btnn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starbuck);
        btnn1 = findViewById(R.id.btnn1);
        btnn2 = findViewById(R.id.btnn2);
        btnn3 = findViewById(R.id.btnn3);
        btnn4 = findViewById(R.id.btnn4);
        btnn5 = findViewById(R.id.btnn5);
        Klik();
    }
    void Klik(){
        btnn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentstr1 = new Intent(starbuck.this, strnitro.class);
                startActivity(intentstr1);
            }
        });
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentstr2 = new Intent(starbuck.this, strexpreso.class);
                startActivity(intentstr2);
            }
        });
        btnn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentstr3 = new Intent(starbuck.this, strmocha.class);
                startActivity(intentstr3);
            }
        });
        btnn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentstr4 = new Intent(starbuck.this, strlatte.class);
                startActivity(intentstr4);
            }
        });
        btnn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentstr5 = new Intent(starbuck.this, strenergi.class);
                startActivity(intentstr5);
            }
        });
    }

}