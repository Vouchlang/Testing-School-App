package com.example.usea_app.program.program_faculty.foe.foe_bach;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.usea_app.program.program_faculty.foe.fragment_foe_bach.Fragment_FoE_Bach_IndE_Se_Fs;
import com.example.usea_app.program.program_faculty.foe.fragment_foe_bach.Fragment_FoE_Bach_IndE_So_Ss;
import com.example.usea_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FoE_Bach_IndE_Se extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_bach_inde_se);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        BottomNavigationView bottom_nav_foe_bach_inde_se = findViewById(R.id.bottom_nav_foe_bach_inde_se);
        bottom_nav_foe_bach_inde_se.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.first_semester:
                            selectedFragment = new Fragment_FoE_Bach_IndE_Se_Fs();
                            break;
                        case R.id.second_semester:
                            selectedFragment = new Fragment_FoE_Bach_IndE_So_Ss();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_foe_bach_inde_se,
                            selectedFragment).commit();
                    return true;
                }
            };
}