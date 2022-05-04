package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_Man extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_man);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_man_fm = findViewById(R.id.btnMast_man_fm);
        Button btnMast_man_so = findViewById(R.id.btnMast_man_so);
        Button btnMast_man_ju = findViewById(R.id.btnMast_man_ju);
        Button btnMast_man_se = findViewById(R.id.btnMast_man_se);

        btnMast_man_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Man.this, FoE_Mast_Man_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_man_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Man.this, FoE_Mast_Man_So.class);
                startActivity(intent);
            }
        });

        btnMast_man_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Man.this, FoE_Mast_Man_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_man_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Man.this, FoE_Mast_Man_Se.class);
                startActivity(intent);
            }
        });

    }


}