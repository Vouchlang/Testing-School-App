package com.example.usea_app.program.program_faculty.foe.foe_asso;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.usea_app.program.program_faculty.foe.fragment_foe_asso.Fragment_FoE_Asso_To_Ju_Fs;
import com.example.usea_app.program.program_faculty.foe.fragment_foe_asso.Fragment_FoE_Asso_To_Ju_Ss;
import com.example.usea_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FoE_Asso_To_Ju extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foe_asso_to_ju);
        getSupportActionBar().setTitle("            Program");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        BottomNavigationView bottom_nav_foe_asso_to_ju = findViewById(R.id.bottom_nav_foe_asso_to_ju);
        bottom_nav_foe_asso_to_ju.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.first_semester:
                            selectedFragment = new Fragment_FoE_Asso_To_Ju_Fs();
                            break;
                        case R.id.second_semester:
                            selectedFragment = new Fragment_FoE_Asso_To_Ju_Ss();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_foe_asso_to_ju,
                            selectedFragment).commit();
                    return true;
                }
            };
}