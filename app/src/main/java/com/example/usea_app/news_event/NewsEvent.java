package com.example.usea_app.news_event;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.usea_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class NewsEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_event);

        getSupportActionBar().setTitle("          News Event");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        BottomNavigationView bottom_nav = findViewById(R.id.events);
        bottom_nav.setOnNavigationItemSelectedListener(navListener);

        ImageSlider slide_image = findViewById(R.id.slide_image);

        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.sale, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.store, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.students, ScaleTypes.FIT));

        slide_image.setImageList(slideModels, ScaleTypes.FIT);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.ue:
                            selectedFragment = new fragment_ue();
                            break;
                        case R.id.ce:
                            selectedFragment = new fragment_ce();
                            break;
                        case R.id.pe:
                            selectedFragment = new fragment_pe();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_news,
                            selectedFragment).commit();
                    return true;
                }
            };


}