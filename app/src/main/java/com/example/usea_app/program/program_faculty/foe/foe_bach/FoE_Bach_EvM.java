package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_EvM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_evm);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_evm_fm = findViewById(R.id.btnBach_evm_fm);
        Button btnBach_evm_so = findViewById(R.id.btnBach_evm_so);
        Button btnBach_evm_ju = findViewById(R.id.btnBach_evm_ju);
        Button btnBach_evm_se = findViewById(R.id.btnBach_evm_se);

        btnBach_evm_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EvM.this, FoE_Bach_EvM_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_evm_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EvM.this, FoE_Bach_EvM_So.class);
                startActivity(intent);
            }
        });

        btnBach_evm_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EvM.this, FoE_Bach_EvM_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_evm_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_EvM.this, FoE_Bach_EvM_Se.class);
                startActivity(intent);
            }
        });

    }


}