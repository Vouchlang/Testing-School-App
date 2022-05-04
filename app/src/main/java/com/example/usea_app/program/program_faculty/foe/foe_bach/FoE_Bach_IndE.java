package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_IndE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_inde);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_inde_fm = findViewById(R.id.btnBach_inde_fm);
        Button btnBach_inde_so = findViewById(R.id.btnBach_inde_so);
        Button btnBach_inde_ju = findViewById(R.id.btnBach_inde_ju);
        Button btnBach_inde_se = findViewById(R.id.btnBach_inde_se);

        btnBach_inde_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IndE.this, FoE_Bach_IndE_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_inde_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IndE.this, FoE_Bach_IndE_So.class);
                startActivity(intent);
            }
        });

        btnBach_inde_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IndE.this, FoE_Bach_IndE_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_inde_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IndE.this, FoE_Bach_IndE_Se.class);
                startActivity(intent);
            }
        });

    }


}