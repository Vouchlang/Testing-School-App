package com.example.usea_app;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Space;

public class SplashScreen extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        //Set Animation
        ImageView img = findViewById(R.id.logo);
        Animation top = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.top_logo);
        img.setAnimation(top);

        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);

        String isFirstTime = sharedPreferences.getString("firstTime", "N");
        Log.d("msg", "message >> " + isFirstTime);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                if (SharePreferenceUtils.getInstance().getString("FIRST_TIME").equalsIgnoreCase("Y")){
//                    Intent intent = new Intent(SplashScreen.this, HomeActivity.class);
//                    startActivity(intent);
//                    finish();
//
//                }else{
//                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
//            }
//        }, 2000);

//        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
//        SharedPreferences prefs = getSharedPreferences("login", MODE_PRIVATE);
//        final boolean isLogged = prefs.getBoolean("isLogged", false);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.commit();

                        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                }
            }
        };
        timerThread.start();
    }
}
