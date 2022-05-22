package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text=findViewById(R.id.textView2);
        Intent intent = getIntent();
        text.setText(intent.getStringExtra("Email"));

    }

    public void nxt(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

    public void link(View view) {
        Uri webpage = Uri.parse("https://www.w3schools.com/html/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void link2(View view) {
        Uri webpage = Uri.parse("https://www.w3schools.com/CPP/default.asp");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}