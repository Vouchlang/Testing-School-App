package com.example.usea_app.program.program_faculty.foe.foe_asso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Asso_To extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso_to);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnAsso_to_fm = findViewById(R.id.btnAsso_to_fm);
        Button btnAsso_to_so = findViewById(R.id.btnAsso_to_so);
        Button btnAsso_to_ju = findViewById(R.id.btnAsso_to_ju);
        Button btnAsso_to_se = findViewById(R.id.btnAsso_to_se);

        btnAsso_to_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_To.this, FoE_Asso_To_Fm.class);
                startActivity(intent);
            }
        });

        btnAsso_to_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_To.this, FoE_Asso_To_So.class);
                startActivity(intent);
            }
        });

        btnAsso_to_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_To.this, FoE_Asso_To_Ju.class);
                startActivity(intent);
            }
        });

        btnAsso_to_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_To.this, FoE_Asso_To_Se.class);
                startActivity(intent);
            }
        });

    }


}