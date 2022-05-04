package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_Ma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_ma);

        getSupportActionBar().setTitle("            Management");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_ma_fm = findViewById(R.id.btnBach_ma_fm);
        Button btnBach_ma_so = findViewById(R.id.btnBach_ma_so);
        Button btnBach_ma_ju = findViewById(R.id.btnBach_ma_ju);
        Button btnBach_ma_se = findViewById(R.id.btnBach_ma_se);

        btnBach_ma_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Ma.this, FoE_Bach_Ma_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_ma_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Ma.this, FoE_Bach_Ma_So.class);
                startActivity(intent);
            }
        });

        btnBach_ma_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Ma.this, FoE_Bach_Ma_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_ma_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Ma.this, FoE_Bach_Ma_Se.class);
                startActivity(intent);
            }
        });

    }


}