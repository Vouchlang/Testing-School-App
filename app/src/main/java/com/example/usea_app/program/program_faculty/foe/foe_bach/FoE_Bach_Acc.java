package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach_Acc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_acc);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnBach_acc_fm = findViewById(R.id.btnBach_acc_fm);
        Button btnBach_acc_so = findViewById(R.id.btnBach_acc_so);
        Button btnBach_acc_ju = findViewById(R.id.btnBach_acc_ju);
        Button btnBach_acc_se = findViewById(R.id.btnBach_acc_se);

        btnBach_acc_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Acc.this, FoE_Bach_Acc_Fm.class);
                startActivity(intent);
            }
        });

        btnBach_acc_so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Acc.this, FoE_Bach_Acc_So.class);
                startActivity(intent);
            }
        });

        btnBach_acc_ju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Acc.this, FoE_Bach_Acc_Ju.class);
                startActivity(intent);
            }
        });

        btnBach_acc_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach_Acc.this, FoE_Bach_Acc_Se.class);
                startActivity(intent);
            }
        });

    }


}