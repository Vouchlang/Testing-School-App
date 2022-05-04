package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Mast_ITM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_itm);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnMast_itm_fm = findViewById(R.id.btnMast_itm_fm);
        Button btnMast_itm_so = findViewById(R.id.btnMast_itm_so);
        Button btnMast_itm_ju = findViewById(R.id.btnMast_itm_ju);
        Button btnMast_itm_se = findViewById(R.id.btnMast_itm_se);

        btnMast_itm_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_ITM.this, FoE_Mast_ITM_Fm.class);
                startActivity(intent);
            }
        });

        btnMast_itm_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_ITM.this, FoE_Mast_ITM_So.class);
                startActivity(intent);
            }
        });

        btnMast_itm_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_ITM.this, FoE_Mast_ITM_Ju.class);
                startActivity(intent);
            }
        });

        btnMast_itm_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Mast_ITM.this, FoE_Mast_ITM_Se.class);
                startActivity(intent);
            }
        });

    }


}