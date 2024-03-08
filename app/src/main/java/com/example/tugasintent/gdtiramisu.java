package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class gdtiramisu extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gdtiramisu);

        // Referensi ke ImageView dan TextView di layout XML
        imageView = findViewById(R.id.gdd5);
        textView = findViewById(R.id.tvn12);

        // Menetapkan gambar ke ImageView
        imageView.setImageResource(R.drawable.ic_gdthiramisu);

        // Referensi ke tombol SHARE
        btnShare = findViewById(R.id.btnnsc2);

        // Menetapkan aksi klik pada tombol SHARE
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat Intent untuk berbagi teks
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody = textView.getText().toString();

                // Menetapkan teks yang akan dibagikan
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);

                // Menampilkan dialog untuk memilih aplikasi yang akan digunakan untuk berbagi
                startActivity(Intent.createChooser(intent, "Bagikan melalui"));
            }
        });
    }
}
