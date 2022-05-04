package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_Aud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_aud);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_aud_fm = findViewById(R.id.btnMast_aud_fm);
        Button btnMast_aud_so = findViewById(R.id.btnMast_aud_so);
        Button btnMast_aud_ju = findViewById(R.id.btnMast_aud_ju);
        Button btnMast_aud_se = findViewById(R.id.btnMast_aud_se);

        btnMast_aud_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Aud.this, FoE_Mast_Aud_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_aud_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Aud.this, FoE_Mast_Aud_So.class);
                startActivity(intent);
            }
        });

        btnMast_aud_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Aud.this, FoE_Mast_Aud_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_aud_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Aud.this, FoE_Mast_Aud_Se.class);
                startActivity(intent);
            }
        });

    }


}