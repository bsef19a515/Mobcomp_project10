package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void nxt(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(intent);
    }
    public void link(View view) {
        Uri webpage = Uri.parse("https://www.w3schools.com/cs/index.php");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void link2(View view) {
        Uri webpage = Uri.parse("https://www.w3schools.com/python/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}