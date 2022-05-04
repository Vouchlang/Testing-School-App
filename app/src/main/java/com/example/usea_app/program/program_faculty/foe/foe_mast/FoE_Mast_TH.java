package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_TH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_th);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_th_fm = findViewById(R.id.btnMast_th_fm);
        Button btnMast_th_so = findViewById(R.id.btnMast_th_so);
        Button btnMast_th_ju = findViewById(R.id.btnMast_th_ju);
        Button btnMast_th_se = findViewById(R.id.btnMast_th_se);

        btnMast_th_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_TH.this, FoE_Mast_TH_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_th_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_TH.this, FoE_Mast_TH_So.class);
                startActivity(intent);
            }
        });

        btnMast_th_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_TH.this, FoE_Mast_TH_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_th_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_TH.this, FoE_Mast_TH_Se.class);
                startActivity(intent);
            }
        });

    }


}