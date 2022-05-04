package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class FoE_Bach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnFoE_Bach_Ma = findViewById(R.id.btnFoE_Bach_Ma);
        Button btnFoE_Bach_Mar = findViewById(R.id.btnFoE_Bach_Mar);
        Button btnFoE_Bach_Acc = findViewById(R.id.btnFoE_Bach_Acc);
        Button btnFoE_Bach_Fb = findViewById(R.id.btnFoE_Bach_Fb);
        Button btnFoE_Bach_IndE = findViewById(R.id.btnFoE_Bach_IndE);
        Button btnFoE_Bach_IntE = findViewById(R.id.btnFoE_Bach_IntE);
        Button btnFoE_Bach_En = findViewById(R.id.btnFoE_Bach_En);
        Button btnFoE_Bach_IntB = findViewById(R.id.btnFoE_Bach_IntB);
        Button btnFoE_Bach_ITM = findViewById(R.id.btnFoE_Bach_ITM);
        Button btnFoE_Bach_CHM = findViewById(R.id.btnFoE_Bach_CHM);
        Button btnFoE_Bach_THM = findViewById(R.id.btnFoE_Bach_THM);
        Button btnFoE_Bach_EcT = findViewById(R.id.btnFoE_Bach_EcT);
        Button btnFoE_Bach_EvM = findViewById(R.id.btnFoE_Bach_EvM);

        btnFoE_Bach_Ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_Ma.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_Mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_Mar.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_Acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_Acc.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_Fb.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_IndE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_IndE.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_IntE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_IntE.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_En.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_En.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_IntB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_IntB.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_ITM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_ITM.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_CHM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_CHM.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_THM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_THM.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_EcT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_EcT.class);
                startActivity(intent);
            }
        });
        btnFoE_Bach_EvM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoE_Bach.this, FoE_Bach_EvM.class);
                startActivity(intent);
            }
        });

    }
}