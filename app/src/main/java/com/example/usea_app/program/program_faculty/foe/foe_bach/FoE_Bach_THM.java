package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_THM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_thm);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_thm_fm = findViewById(R.id.btnBach_thm_fm);
        Button btnBach_thm_so = findViewById(R.id.btnBach_thm_so);
        Button btnBach_thm_ju = findViewById(R.id.btnBach_thm_ju);
        Button btnBach_thm_se = findViewById(R.id.btnBach_thm_se);

        btnBach_thm_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_THM.this, FoE_Bach_THM_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_thm_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_THM.this, FoE_Bach_THM_So.class);
                startActivity(intent);
            }
        });

        btnBach_thm_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_THM.this, FoE_Bach_THM_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_thm_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_THM.this, FoE_Bach_THM_Se.class);
                startActivity(intent);
            }
        });

    }


}