package com.example.usea_app.program.program_faculty.foe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.usea_app.program.program_faculty.foe.foe_asso.FoE_Asso;
import com.example.usea_app.program.program_faculty.foe.foe_bach.FoE_Bach;
import com.example.usea_app.R;
import com.example.usea_app.program.program_faculty.foe.foe_mast.FoE_Mast;

public class Program_FoE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_foe);

//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.foe_toolbar);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        Button btnAsso_foe = findViewById(R.id.btnAsso_foe);
        Button btnBach_foe = findViewById(R.id.btnBach_foe);
        Button btnMast_foe = findViewById(R.id.btnMast_foe);

        btnAsso_foe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program_FoE.this, FoE_Asso.class);
                startActivity(intent);
            }
        });

        btnBach_foe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program_FoE.this, FoE_Bach.class);
                startActivity(intent);
            }
        });

        btnMast_foe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program_FoE.this, FoE_Mast.class);
                startActivity(intent);
            }
        });
    }

}