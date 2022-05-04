package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_FB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_fb);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_fb_fm = findViewById(R.id.btnMast_fb_fm);
        Button btnMast_fb_so = findViewById(R.id.btnMast_fb_so);
        Button btnMast_fb_ju = findViewById(R.id.btnMast_fb_ju);
        Button btnMast_fb_se = findViewById(R.id.btnMast_fb_se);

        btnMast_fb_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_FB.this, FoE_Mast_FB_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_fb_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_FB.this, FoE_Mast_FB_So.class);
                startActivity(intent);
            }
        });

        btnMast_fb_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_FB.this, FoE_Mast_FB_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_fb_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_FB.this, FoE_Mast_FB_Se.class);
                startActivity(intent);
            }
        });

    }


}