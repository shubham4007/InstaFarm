package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText password;
    Button Login;
    ImageView Otp;
    ImageView Gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.email_id);
        password = findViewById(R.id.password);
        Login = findViewById(R.id.signin);
        Otp = findViewById(R.id.otp);
        Gmail = findViewById(R.id.gmail);


        Otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Authentication.class));
            }
        });

    }
}
