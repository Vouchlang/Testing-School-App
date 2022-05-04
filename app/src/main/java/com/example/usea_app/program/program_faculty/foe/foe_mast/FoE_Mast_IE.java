package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_IE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_ie);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_ie_fm = findViewById(R.id.btnMast_ie_fm);
        Button btnMast_ie_so = findViewById(R.id.btnMast_ie_so);
        Button btnMast_ie_ju = findViewById(R.id.btnMast_ie_ju);
        Button btnMast_ie_se = findViewById(R.id.btnMast_ie_se);

        btnMast_ie_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IE.this, FoE_Mast_IE_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_ie_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IE.this, FoE_Mast_IE_So.class);
                startActivity(intent);
            }
        });

        btnMast_ie_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IE.this, FoE_Mast_IE_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_ie_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_IE.this, FoE_Mast_IE_Se.class);
                startActivity(intent);
            }
        });

    }


}