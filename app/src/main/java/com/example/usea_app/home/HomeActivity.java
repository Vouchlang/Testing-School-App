package com.example.usea_app.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.usea_app.R;
import com.example.usea_app.career.Career_Home;
import com.example.usea_app.home.account.Fragment_Account;
import com.example.usea_app.home.home.Fragment_Home;
import com.example.usea_app.home.more.Fragment_More;
import com.example.usea_app.library.Library;
import com.example.usea_app.news_event.NewsEvent;
import com.example.usea_app.program.Program;
import com.example.usea_app.registration.Registration;
import com.example.usea_app.scholarship.Scholarship;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    boolean isPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home_toolbar_text);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.usea_fifty);

//        ImageButton btnNoti = findViewById(R.id.noti_off);
//        btnNoti.setBackgroundResource(R.drawable.ic_notification);
//        btnNoti.setOnClickListener(new View.OnClickListener() {
//            @Override<?xml version="1.0" encoding="utf-8"?>
//            public void onClick(View view) {
//                if(isPressed){
//                    view.setBackgroundResource(R.drawable.noti_active);
//                }else{
//                    view.setBackgroundResource(R.drawable.ic_notification);
//                }
//                isPressed = !isPressed;
//            }
//        });
        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
//        SharePreferenceUtils.getInstance().clearString("FIRST_TIME");

        ImageSlider slide_image = findViewById(R.id.slide_image);

        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.sale, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.store, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.students, ScaleTypes.FIT));

        slide_image.setImageList(slideModels, ScaleTypes.FIT);


        BottomNavigationView bottom_nav = findViewById(R.id.bottom_nav);
        bottom_nav.setOnNavigationItemSelectedListener(navListener);


        ImageButton news = findViewById(R.id.news);
        ImageButton register = findViewById(R.id.register);
        ImageButton program = findViewById(R.id.program);
        ImageButton career = findViewById(R.id.career);
        ImageButton scholarship = findViewById(R.id.scholarship);
        ImageButton library = findViewById(R.id.library);

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, NewsEvent.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Registration.class);
                startActivity(intent);
            }
        });
        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Program.class);
                startActivity(intent);
            }
        });
        career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Career_Home.class);
                startActivity(intent);
            }
        });
        scholarship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Scholarship.class);
                startActivity(intent);
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Library.class);
                startActivity(intent);
            }
        });

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.home:
                            selectedFragment = new Fragment_Home();
                            break;
                        case R.id.acc:
                            selectedFragment = new Fragment_Account();
                            break;
                        case R.id.more:
                            selectedFragment = new Fragment_More();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                            selectedFragment).commit();
                    return true;
                }
            };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.noti_off:
                boolean isClicked;
                if(isClicked = true){
                    Toast.makeText(this, "Notification is On", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Notification Off", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                Toast.makeText(this, "??", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}