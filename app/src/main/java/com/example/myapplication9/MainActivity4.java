package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void nxt(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(intent);
    }
    public void link(View view) {
        Uri webpage = Uri.parse("https://www.w3schools.com/java/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void link2(View view) {
        Uri webpage = Uri.parse("https://www.w3schools.com/js/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}