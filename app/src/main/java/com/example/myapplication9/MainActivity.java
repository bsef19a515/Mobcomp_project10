package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email,pwd;
    TextView text;
    String email1,pwd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.editTextTextEmailAddress2);
        pwd=findViewById(R.id.editTextTextPassword2);
        text=findViewById(R.id.textView5);
        email1= String.valueOf(email.getText());
        pwd1= String.valueOf(pwd.getText());


    }

    public void dashboard(View view) {
        if(email1.equals("") && pwd1.equals("")){
            text.setText("Please enter valid email or password");
        }

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            String message = email.getText().toString();
            intent.putExtra("Email", message);
            startActivity(intent);


    }

    public void home(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
}