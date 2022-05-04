package com.example.usea_app.career;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.usea_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Career_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_home);

        getSupportActionBar().setTitle("            Career");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        BottomNavigationView bottom_nav_career = findViewById(R.id.bottom_nav_career);
        bottom_nav_career.setOnNavigationItemSelectedListener(navListener);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.university:
                            selectedFragment = new Fragment_career_university();
                            break;
                        case R.id.oi:
                            selectedFragment = new Fragment_other_institute();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_career,
                            selectedFragment).commit();
                    return true;
                }
            };
}