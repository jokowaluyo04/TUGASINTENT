package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class goodday extends AppCompatActivity {

    Button bttnnn1, bttnnn2, bttnnn3, bttnnn4, bttnn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodday);
        bttnnn1 = findViewById(R.id.bttnnn1);
        bttnnn2 = findViewById(R.id.bttnnn2);
        bttnnn3 = findViewById(R.id.bttnnn3);
        bttnnn4 = findViewById(R.id.bttnnn4);
        bttnn5 = findViewById(R.id.bttnn5);
        Klik();
    }
    void Klik(){
        bttnnn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgd1 = new Intent(goodday.this, gdtiramisu.class);
                startActivity(intentgd1);
            }
        });
        bttnnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgd2 = new Intent(goodday.this, gdmhocachino.class);
                startActivity(intentgd2);
            }
        });
        bttnnn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgd3 = new Intent(goodday.this, gdgreantea.class);
                startActivity(intentgd3);
            }
        });
        bttnnn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgd4 = new Intent(goodday.this, gdcookies.class);
                startActivity(intentgd4);

            }
        });
        bttnn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgd5 = new Intent(goodday.this, gdmhocachino.class);
                startActivity(intentgd5);
            }
        });
    }
}