package com.example.usea_app.program.program_faculty.foe.foe_asso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.usea_app.R;

public class FoE_Asso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso);

        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnFoE_Asso_Fb = findViewById(R.id.btnFoE_Asso_Fb);
        Button btnFoE_Asso_Man = findViewById(R.id.btnFoE_Asso_Man);
        Button btnFoE_Asso_Acc = findViewById(R.id.btnFoE_Asso_Acc);
        Button btnFoE_Asso_Th = findViewById(R.id.btnFoE_Asso_Th);
        Button btnFoE_Asso_Mar = findViewById(R.id.btnFoE_Asso_Mar);

        btnFoE_Asso_Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso.this, FoE_Asso_Fb.class);
                startActivity(intent);
            }
        });
        btnFoE_Asso_Man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso.this, FoE_Asso_Ma.class);
                startActivity(intent);
            }
        });
        btnFoE_Asso_Acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso.this, FoE_Asso_Ac.class);
                startActivity(intent);
            }
        });
        btnFoE_Asso_Th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso.this, FoE_Asso_To.class);
                startActivity(intent);
            }
        });
        btnFoE_Asso_Mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso.this, FoE_Asso_Mar.class);
                startActivity(intent);
            }
        });

    }
}