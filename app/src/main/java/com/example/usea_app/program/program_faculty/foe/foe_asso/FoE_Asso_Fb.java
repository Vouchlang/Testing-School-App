package com.example.usea_app.program.program_faculty.foe.foe_asso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.usea_app.R;

public class FoE_Asso_Fb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso_fb);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnAsso_fb_fm = findViewById(R.id.btnAsso_fb_fm);
        Button btnAsso_fb_so = findViewById(R.id.btnAsso_fb_so);
        Button btnAsso_fb_ju = findViewById(R.id.btnAsso_fb_ju);
        Button btnAsso_fb_se = findViewById(R.id.btnAsso_fb_se);

        btnAsso_fb_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Fb.this, FoE_Asso_Fb_Fm.class);
                startActivity(intent);
            }
        });

        btnAsso_fb_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Fb.this, FoE_Asso_Fb_So.class);
                startActivity(intent);
            }
        });

        btnAsso_fb_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Fb.this, FoE_Asso_Fb_Ju.class);
                startActivity(intent);
            }
        });

        btnAsso_fb_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Asso_Fb.this, FoE_Asso_Fb_Se.class);
                startActivity(intent);
            }
        });

    }


}