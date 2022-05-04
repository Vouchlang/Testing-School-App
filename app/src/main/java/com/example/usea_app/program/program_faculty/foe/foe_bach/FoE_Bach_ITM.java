package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_ITM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_itm);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_itm_fm = findViewById(R.id.btnBach_itm_fm);
        Button btnBach_itm_so = findViewById(R.id.btnBach_itm_so);
        Button btnBach_itm_ju = findViewById(R.id.btnBach_itm_ju);
        Button btnBach_itm_se = findViewById(R.id.btnBach_itm_se);

        btnBach_itm_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_ITM.this, FoE_Bach_ITM_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_itm_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_ITM.this, FoE_Bach_ITM_So.class);
                startActivity(intent);
            }
        });

        btnBach_itm_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_ITM.this, FoE_Bach_ITM_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_itm_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_ITM.this, FoE_Bach_ITM_Se.class);
                startActivity(intent);
            }
        });

    }


}