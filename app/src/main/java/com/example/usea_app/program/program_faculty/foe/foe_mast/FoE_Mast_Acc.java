package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_Acc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_acc);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_acc_fm = findViewById(R.id.btnMast_acc_fm);
        Button btnMast_acc_so = findViewById(R.id.btnMast_acc_so);
        Button btnMast_acc_ju = findViewById(R.id.btnMast_acc_ju);
        Button btnMast_acc_se = findViewById(R.id.btnMast_acc_se);

        btnMast_acc_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Acc.this, FoE_Mast_Acc_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_acc_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Acc.this, FoE_Mast_Acc_So.class);
                startActivity(intent);
            }
        });

        btnMast_acc_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Acc.this, FoE_Mast_Acc_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_acc_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_Acc.this, FoE_Mast_Acc_Se.class);
                startActivity(intent);
            }
        });

    }


}