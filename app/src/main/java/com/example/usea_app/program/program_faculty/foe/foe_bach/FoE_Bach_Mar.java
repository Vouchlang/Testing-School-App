package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_Mar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_mar);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_mar_fm = findViewById(R.id.btnBach_mar_fm);
        Button btnBach_mar_so = findViewById(R.id.btnBach_mar_so);
        Button btnBach_mar_ju = findViewById(R.id.btnBach_mar_ju);
        Button btnBach_mar_se = findViewById(R.id.btnBach_mar_se);

        btnBach_mar_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Mar.this, FoE_Bach_Mar_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_mar_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Mar.this, FoE_Bach_Mar_So.class);
                startActivity(intent);
            }
        });

        btnBach_mar_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Mar.this, FoE_Bach_Mar_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_mar_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Mar.this, FoE_Bach_Mar_Se.class);
                startActivity(intent);
            }
        });

    }


}