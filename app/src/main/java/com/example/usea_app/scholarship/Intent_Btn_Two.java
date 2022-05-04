package com.example.usea_app.scholarship;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.usea_app.R;

public class Intent_Btn_Two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_btn_two);

        getSupportActionBar().setTitle("          Scholarship");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView btnLM = findViewById(R.id.btnLM);
        TextView btnHTA = findViewById(R.id.btnHTA);
        TextView btnFBD = findViewById(R.id.btnFBD);

        btnLM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.scholarshiptab.com/scholarships/fully-funded-swansea-university-uk-2022-u-hire-phd-scholarships-in-chemical-engineering#skc-deadline-0"));
                startActivity(intent);
            }
        });
        btnHTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.scholarshiptab.com/scholarships/fully-funded-swansea-university-uk-2022-u-hire-phd-scholarships-in-chemical-engineering#apply-sec"));
                startActivity(intent);
            }
        });
        btnFBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.scholarshiptab.com/scholarships/fully-funded-swansea-university-uk-2022-u-hire-phd-scholarships-in-chemical-engineering#skc-benefit-0"));
                startActivity(intent);
            }
        });

    }
}