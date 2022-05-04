package com.example.usea_app.sign_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.usea_app.MainActivity;
import com.example.usea_app.R;
import com.example.usea_app.home.HomeActivity;
import com.example.usea_app.sign_in.gmail.ConnGoogle;
import com.example.usea_app.sign_in.otp.SendOTPActivity;

public class sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        ImageButton btnBack = findViewById(R.id.btnBack);
        Button btnPhone = findViewById(R.id.btnPhone);
        Button btnGoogle = findViewById(R.id.btnGoogle);
//        Button btnFB = findViewById(R.id.btnFB);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in.this, SendOTPActivity.class);
                startActivity(intent);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in.this, ConnGoogle.class);
                startActivity(intent);
            }
        });

//        btnFB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(sign_in.this, HomeActivity.class);
//                startActivity(intent);
//            }
//        });


    }
}