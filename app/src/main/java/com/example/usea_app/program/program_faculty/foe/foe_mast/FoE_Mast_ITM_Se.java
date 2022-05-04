package com.example.usea_app.program.program_faculty.foe.foe_mast;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.usea_app.R;
import com.example.usea_app.program.program_faculty.foe.fragment_foe_mast.Fragment_FoE_Mast_ITM_Se_Fs;
import com.example.usea_app.program.program_faculty.foe.fragment_foe_mast.Fragment_FoE_Mast_ITM_So_Ss;
import com.example.usea_app.program.program_faculty.foe.fragment_foe_mast.Fragment_FoE_Mast_Man_Se_Fs;
import com.example.usea_app.program.program_faculty.foe.fragment_foe_mast.Fragment_FoE_Mast_Man_So_Ss;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FoE_Mast_ITM_Se extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_mast_itm_se);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        BottomNavigationView bottom_nav_foe_mast_itm_se = findViewById(R.id.bottom_nav_foe_mast_itm_se);
        bottom_nav_foe_mast_itm_se.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.first_semester:
                            selectedFragment = new Fragment_FoE_Mast_ITM_Se_Fs();
                            break;
                        case R.id.second_semester:
                            selectedFragment = new Fragment_FoE_Mast_ITM_So_Ss();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_foe_mast_itm_se,
                            selectedFragment).commit();
                    return true;
                }
            };
}