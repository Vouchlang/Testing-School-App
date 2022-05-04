package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_Fb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_fb);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_fb_fm = findViewById(R.id.btnBach_fb_fm);
        Button btnBach_fb_so = findViewById(R.id.btnBach_fb_so);
        Button btnBach_fb_ju = findViewById(R.id.btnBach_fb_ju);
        Button btnBach_fb_se = findViewById(R.id.btnBach_fb_se);

        btnBach_fb_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Fb.this, FoE_Bach_Fb_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_fb_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Fb.this, FoE_Bach_Fb_So.class);
                startActivity(intent);
            }
        });

        btnBach_fb_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Fb.this, FoE_Bach_Fb_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_fb_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Fb.this, FoE_Bach_Fb_Se.class);
                startActivity(intent);
            }
        });

    }


}