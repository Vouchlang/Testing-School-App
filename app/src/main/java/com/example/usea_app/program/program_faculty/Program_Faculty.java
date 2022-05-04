package com.example.usea_app.program.program_faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.usea_app.R;
import com.example.usea_app.program.program_faculty.foa.Program_FoA;
import com.example.usea_app.program.program_faculty.foe.Program_FoE;
import com.example.usea_app.program.program_faculty.fosc.Program_FoSc;
import com.example.usea_app.program.program_faculty.foso.Program_FoSo;

public class Program_Faculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_faculty);

        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        Button btnFoE = findViewById(R.id.btnFoE);
        Button btnFoA = findViewById(R.id.btnFoA);
        Button btnFoSc = findViewById(R.id.btnFoSc);
        Button btnFoSo = findViewById(R.id.btnFoSo);

        btnFoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program_Faculty.this, Program_FoE.class);
                startActivity(intent);
            }
        });
        btnFoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program_Faculty.this, Program_FoA.class);
                startActivity(intent);
            }
        });
        btnFoSc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program_Faculty.this, Program_FoSc.class);
                startActivity(intent);
            }
        });
        btnFoSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program_Faculty.this, Program_FoSo.class);
                startActivity(intent);
            }
        });

    }
}