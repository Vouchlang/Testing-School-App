package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_IB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_ib);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_ib_fm = findViewById(R.id.btnMast_ib_fm);
        Button btnMast_ib_so = findViewById(R.id.btnMast_ib_so);
        Button btnMast_ib_ju = findViewById(R.id.btnMast_ib_ju);
        Button btnMast_ib_se = findViewById(R.id.btnMast_ib_se);

        btnMast_ib_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IB.this, FoE_Mast_IB_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_ib_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IB.this, FoE_Mast_IB_So.class);
                startActivity(intent);
            }
        });

        btnMast_ib_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IB.this, FoE_Mast_IB_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_ib_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IB.this, FoE_Mast_IB_Se.class);
                startActivity(intent);
            }
        });

    }


}