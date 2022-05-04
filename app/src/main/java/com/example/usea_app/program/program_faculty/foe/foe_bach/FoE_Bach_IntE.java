package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_IntE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_inte);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_inte_fm = findViewById(R.id.btnBach_inte_fm);
        Button btnBach_inte_so = findViewById(R.id.btnBach_inte_so);
        Button btnBach_inte_ju = findViewById(R.id.btnBach_inte_ju);
        Button btnBach_inte_se = findViewById(R.id.btnBach_inte_se);

        btnBach_inte_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntE.this, FoE_Bach_IntE_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_inte_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntE.this, FoE_Bach_IntE_So.class);
                startActivity(intent);
            }
        });

        btnBach_inte_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntE.this, FoE_Bach_IntE_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_inte_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntE.this, FoE_Bach_IntE_Se.class);
                startActivity(intent);
            }
        });

    }


}