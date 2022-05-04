package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_IntB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_intb);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_intb_fm = findViewById(R.id.btnBach_intb_fm);
        Button btnBach_intb_so = findViewById(R.id.btnBach_intb_so);
        Button btnBach_intb_ju = findViewById(R.id.btnBach_intb_ju);
        Button btnBach_intb_se = findViewById(R.id.btnBach_intb_se);

        btnBach_intb_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntB.this, FoE_Bach_IntB_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_intb_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntB.this, FoE_Bach_IntB_So.class);
                startActivity(intent);
            }
        });

        btnBach_intb_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntB.this, FoE_Bach_IntB_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_intb_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_IntB.this, FoE_Bach_IntB_Se.class);
                startActivity(intent);
            }
        });

    }


}