package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_EcT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_ect);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_ect_fm = findViewById(R.id.btnBach_ect_fm);
        Button btnBach_ect_so = findViewById(R.id.btnBach_ect_so);
        Button btnBach_ect_ju = findViewById(R.id.btnBach_ect_ju);
        Button btnBach_ect_se = findViewById(R.id.btnBach_ect_se);

        btnBach_ect_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EcT.this, FoE_Bach_EcT_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_ect_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EcT.this, FoE_Bach_EcT_So.class);
                startActivity(intent);
            }
        });

        btnBach_ect_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EcT.this, FoE_Bach_EcT_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_ect_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EcT.this, FoE_Bach_EcT_Se.class);
                startActivity(intent);
            }
        });

    }


}