package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_IM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_im);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_im_fm = findViewById(R.id.btnMast_im_fm);
        Button btnMast_im_so = findViewById(R.id.btnMast_im_so);
        Button btnMast_im_ju = findViewById(R.id.btnMast_im_ju);
        Button btnMast_im_se = findViewById(R.id.btnMast_im_se);

        btnMast_im_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IM.this, FoE_Mast_IM_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_im_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IM.this, FoE_Mast_IM_So.class);
                startActivity(intent);
            }
        });

        btnMast_im_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IM.this, FoE_Mast_IM_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_im_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IM.this, FoE_Mast_IM_Se.class);
                startActivity(intent);
            }
        });

    }


}