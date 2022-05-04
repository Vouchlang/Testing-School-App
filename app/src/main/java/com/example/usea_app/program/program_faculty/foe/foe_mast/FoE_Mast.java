package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;
import com.example.usea_app.program.program_faculty.foe.foe_asso.FoE_Asso_Ac;
import com.example.usea_app.program.program_faculty.foe.foe_asso.FoE_Asso_Fb;
import com.example.usea_app.program.program_faculty.foe.foe_asso.FoE_Asso_Ma;
import com.example.usea_app.program.program_faculty.foe.foe_asso.FoE_Asso_Mar;
import com.example.usea_app.program.program_faculty.foe.foe_asso.FoE_Asso_To;

public class FoE_Mast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnFoE_Mast_IE = findViewById(R.id.btnFoE_Mast_IE);
        Button btnFoE_Mast_FB = findViewById(R.id.btnFoE_Mast_FB);
        Button btnFoE_Mast_Man = findViewById(R.id.btnFoE_Mast_Man);
        Button btnFoE_Mast_Acc = findViewById(R.id.btnFoE_Mast_Acc);
        Button btnFoE_Mast_TH = findViewById(R.id.btnFoE_Mast_TH);
        Button btnFoE_Mast_Aud = findViewById(R.id.btnFoE_Mast_Aud);
        Button btnFoE_Mast_IB = findViewById(R.id.btnFoE_Mast_IB);
        Button btnFoE_Mast_IM = findViewById(R.id.btnFoE_Mast_IM);
        Button btnFoE_Mast_ITM = findViewById(R.id.btnFoE_Mast_ITM);


        btnFoE_Mast_IE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_IE.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_FB.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_Man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_Man.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_Acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_Acc.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_TH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_TH.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_Aud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_Aud.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_IB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_IB.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_IM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_IM.class);
                startActivity(intent);
            }
        });
        btnFoE_Mast_ITM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast.this, FoE_Mast_ITM.class);
                startActivity(intent);
            }
        });

    }
}




