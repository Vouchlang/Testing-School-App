package com.example.usea_app.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.usea_app.R;

import java.util.ArrayList;
import java.util.List;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        getSupportActionBar().setTitle("             Library");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ScrollView scroll = findViewById(R.id.scroll);
        ImageButton btnPic = findViewById(R.id.btnPic);
        ImageButton btnAmC = findViewById(R.id.btnAmC);
        LinearLayout scroll_Pic = findViewById(R.id.scroll_Pic);
        LinearLayout scroll_Ac = findViewById(R.id.scroll_Ac);

        btnAmC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scroll.fullScroll(ScrollView.FOCUS_DOWN);
                scroll_Ac.isShown();
            }
        });

        btnPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scroll.fullScroll(ScrollView.FOCUS_UP);
                scroll_Pic.isShown();
            }
        });


        ImageSlider slide_image = findViewById(R.id.slide_image);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.library_one, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.library_two, ScaleTypes.FIT));
        slide_image.setImageList(slideModels, ScaleTypes.FIT);

    }
}