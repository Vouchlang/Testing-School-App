package com.example.usea_app.scholarship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.usea_app.R;
import com.example.usea_app.home.HomeActivity;

import java.util.ArrayList;
import java.util.List;

public class Scholarship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);

        getSupportActionBar().setTitle("          Scholarship");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageSlider slide_image = findViewById(R.id.slide_image);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.scholarship_one, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.scholarship_two, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.scholarship_three, ScaleTypes.FIT));
        slide_image.setImageList(slideModels, ScaleTypes.FIT);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scholarship.this, Intent_Btn_One.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scholarship.this, Intent_Btn_Two.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scholarship.this, Intent_Btn_Three.class);
                startActivity(intent);
            }
        });

    }
}