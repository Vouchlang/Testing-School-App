package com.example.usea_app.program.program_faculty.foe.foe_asso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Asso_Mar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso_mar);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnAsso_mar_fm = findViewById(R.id.btnAsso_mar_fm);
        Button btnAsso_mar_so = findViewById(R.id.btnAsso_mar_so);
        Button btnAsso_mar_ju = findViewById(R.id.btnAsso_mar_ju);
        Button btnAsso_mar_se = findViewById(R.id.btnAsso_mar_se);

        btnAsso_mar_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Mar.this, FoE_Asso_Mar_Fm.class);
                startActivity(intent);
            }
        });

        btnAsso_mar_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Mar.this, FoE_Asso_Mar_So.class);
                startActivity(intent);
            }
        });

        btnAsso_mar_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Mar.this, FoE_Asso_Mar_Ju.class);
                startActivity(intent);
            }
        });

        btnAsso_mar_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Mar.this, FoE_Asso_Mar_Se.class);
                startActivity(intent);
            }
        });

    }


}