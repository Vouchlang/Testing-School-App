package com.example.usea_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.usea_app.sign_in.sign_in;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGuest = findViewById(R.id.btnGuest);
        Button btnStudent = findViewById(R.id.btnStudent);

        btnGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SharePreferenceUtils.getInstance().saveString("FIRST_TIME", "Y");
                Intent intent = new Intent(MainActivity.this, sign_in.class);
                startActivity(intent);
            }
        });

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SharePreferenceUtils.getInstance().saveString("FIRST_TIME", "Y");
                Intent intent = new Intent(MainActivity.this, sign_in.class);
                startActivity(intent);
            }
        });

    }






}