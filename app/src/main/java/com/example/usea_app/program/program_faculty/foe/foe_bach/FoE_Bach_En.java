package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_En extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_en);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_en_fm = findViewById(R.id.btnBach_en_fm);
        Button btnBach_en_so = findViewById(R.id.btnBach_en_so);
        Button btnBach_en_ju = findViewById(R.id.btnBach_en_ju);
        Button btnBach_en_se = findViewById(R.id.btnBach_en_se);

        btnBach_en_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_En.this, FoE_Bach_En_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_en_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_En.this, FoE_Bach_En_So.class);
                startActivity(intent);
            }
        });

        btnBach_en_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_En.this, FoE_Bach_En_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_en_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_En.this, FoE_Bach_En_Se.class);
                startActivity(intent);
            }
        });

    }


}