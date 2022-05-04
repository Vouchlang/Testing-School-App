package com.example.usea_app.program.program_faculty.foe.foe_asso;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.usea_app.program.program_faculty.foe.fragment_foe_asso.Fragment_FoE_Asso_Ma_So_Fs;
import com.example.usea_app.program.program_faculty.foe.fragment_foe_asso.Fragment_FoE_Asso_Ma_So_Ss;
import com.example.usea_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FoE_Asso_Ma_So extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso_ma_so);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        BottomNavigationView bottom_nav_foe_asso_ma_so = findViewById(R.id.bottom_nav_foe_asso_ma_so);
        bottom_nav_foe_asso_ma_so.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.first_semester:
                            selectedFragment = new Fragment_FoE_Asso_Ma_So_Fs();
                            break;
                        case R.id.second_semester:
                            selectedFragment = new Fragment_FoE_Asso_Ma_So_Ss();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_foe_asso_ma_so,
                            selectedFragment).commit();
                    return true;
                }
            };
}