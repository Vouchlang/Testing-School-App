package com.example.usea_app.program.program_faculty.foe.foe_asso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Asso_Ac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso_ac);

        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnAsso_ac_fm = findViewById(R.id.btnAsso_ac_fm);
        Button btnAsso_ac_so = findViewById(R.id.btnAsso_ac_so);
        Button btnAsso_ac_ju = findViewById(R.id.btnAsso_ac_ju);
        Button btnAsso_ac_se = findViewById(R.id.btnAsso_ac_se);

        btnAsso_ac_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ac.this, FoE_Asso_Ac_Fm.class);
                startActivity(intent);
            }
        });

        btnAsso_ac_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ac.this, FoE_Asso_Ac_So.class);
                startActivity(intent);
            }
        });

        btnAsso_ac_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ac.this, FoE_Asso_Ac_Ju.class);
                startActivity(intent);
            }
        });

        btnAsso_ac_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Ac.this, FoE_Asso_Ac_Se.class);
                startActivity(intent);
            }
        });

    }


}