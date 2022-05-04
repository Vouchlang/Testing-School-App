package com.example.usea_app.program.program_faculty.foe.foe_asso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Asso_Ma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso_ma);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnAsso_ma_fm = findViewById(R.id.btnAsso_ma_fm);
        Button btnAsso_ma_so = findViewById(R.id.btnAsso_ma_so);
        Button btnAsso_ma_ju = findViewById(R.id.btnAsso_ma_ju);
        Button btnAsso_ma_se = findViewById(R.id.btnAsso_ma_se);

        btnAsso_ma_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ma.this, FoE_Asso_Ma_Fm.class);
                startActivity(intent);
            }
        });

        btnAsso_ma_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ma.this, FoE_Asso_Ma_So.class);
                startActivity(intent);
            }
        });

        btnAsso_ma_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ma.this, FoE_Asso_Ma_Ju.class);
                startActivity(intent);
            }
        });

        btnAsso_ma_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ma.this, FoE_Asso_Ma_Se.class);
                startActivity(intent);
            }
        });

    }


}