package com.example.usea_app.program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.usea_app.program.program_faculty.Program_Faculty;
import com.example.usea_app.R;

public class Program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btnACCA = findViewById(R.id.btnACCA);
        Button btnFac = findViewById(R.id.btnFac);

        btnACCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Program.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Program.this, Program_Faculty.class);
                startActivity(intent);
            }
        });
    }
}