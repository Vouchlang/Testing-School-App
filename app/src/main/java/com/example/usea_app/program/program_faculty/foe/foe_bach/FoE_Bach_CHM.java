package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_CHM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_chm);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_chm_fm = findViewById(R.id.btnBach_chm_fm);
        Button btnBach_chm_so = findViewById(R.id.btnBach_chm_so);
        Button btnBach_chm_ju = findViewById(R.id.btnBach_chm_ju);
        Button btnBach_chm_se = findViewById(R.id.btnBach_chm_se);

        btnBach_chm_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_CHM.this, FoE_Bach_CHM_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_chm_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_CHM.this, FoE_Bach_CHM_So.class);
                startActivity(intent);
            }
        });

        btnBach_chm_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_CHM.this, FoE_Bach_CHM_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_chm_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_CHM.this, FoE_Bach_CHM_Se.class);
                startActivity(intent);
            }
        });

    }


}