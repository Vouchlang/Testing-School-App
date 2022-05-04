package com.example.usea_app.home.more;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import com.example.usea_app.R;
import com.example.usea_app.home.more.ActivityFaq;
import com.example.usea_app.home.more.OurVision;
//import com.example.usea_app.more.ActivityFaq;
//import com.example.usea_app.more.OurVision;

import java.util.Locale;

public class Fragment_More extends Fragment {

    //declare variable
    SwitchCompat switchCompat;
    TextView txt_Change_Language, txt_Change_Theme_Mode, txt_Dark_mode, txt_Social_Media, txt_App_Faq, txt_Faq, txt_About_Us,
            txt_Our_Vision, txt_location, txt_location_txt;
    ImageButton Btn_fb, Btn_ig, Btn_yt, Btn_tele, Btn_web;
    ImageView img_location;
    RadioGroup rg;
    RadioButton txt_en, txt_kh;

    //Link to URL
    private void gotUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    //    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more,container,false);

        //assign txt variable
        txt_Change_Language = view.findViewById(R.id.txt_change_language);
//        txt_Dark_mode = view.findViewById(R.id.txt_dark_mode);
//        txt_Change_Theme_Mode = view.findViewById(R.id.txt_change_theme_mode);
        txt_Social_Media = view.findViewById(R.id.txt_social_media);
        txt_App_Faq = view.findViewById(R.id.txt_app_faq);
        txt_Faq = view.findViewById(R.id.txt_faq);
        txt_About_Us = view.findViewById(R.id.txt_about_us);
        //txt_Our_Vision = findViewById(R.id.btn_our_vision);

        //assign btn variable
        img_location = view.findViewById(R.id.img_location);
        txt_location = view.findViewById(R.id.txt_location);
        txt_location_txt = view.findViewById(R.id.txt_location_txt);
        txt_Our_Vision = view.findViewById(R.id.btn_our_vision);

        //Assign ImageButton Variable
        Btn_fb = view.findViewById(R.id.btn_fb);
        Btn_ig = view.findViewById(R.id.btn_ig);
        Btn_yt = view.findViewById(R.id.btn_yt);
        Btn_tele = view.findViewById(R.id.btn_tele);
        Btn_web = view.findViewById(R.id.btn_web);

        //assign switch variable
//        switchCompat = view.findViewById(R.id.switchCompat);

        //assign switch language
        rg = view.findViewById(R.id.rg);
        txt_en = view.findViewById(R.id.txt_en);
        txt_kh = view.findViewById(R.id.txt_kh);

//        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
//            getActivity().setTheme(R.style.Theme_Dark);
//        }else {
//            getActivity().setTheme(R.style.Theme_Light);
//        }

        //Dark Mode Off
//        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonsView, boolean isChecked) {
//                if(isChecked){
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                }else{
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//                }
//            }
//        });
        txt_Faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "FAQ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ActivityFaq.class);
                startActivity(intent);
            }
        });

        //About US
        txt_Our_Vision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OurVision.class);
                startActivity(intent);
            }
        });

        //Social Media
        //Click FB Image
        Btn_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl("https://facebook.com/usea.edu.kh");
            }
        });
        //Click IG Image
        Btn_ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl("https://www.instagram.com/university_of_south_east_asia/");
            }
        });
        //Click Telegram Image
        Btn_tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl("https://facebook.com/usea.edu.kh");
            }
        });
        //Click Youtube Image
        Btn_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl("https://www.youtube.com/channel/UCj_1fYGP6NXxYWcRkqbvN6A");
            }
        });
        //Click Youtube Image
        Btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl("https://usea.edu.kh/en/index.php");
            }
        });
        //Click Location Text
        txt_location_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl("https://www.google.com/maps/dir/13.3551786,103.8564198/13.3503099,103.8641453/@13.3527153,103.8556504,16z/data=!3m1!4b1!4m4!4m3!1m1!4e1!1m0");
            }
        });
        //Click on Location Image
        img_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl("https://www.google.com/maps/dir/13.3551786,103.8564198/13.3503099,103.8641453/@13.3527153,103.8556504,16z/data=!3m1!4b1!4m4!4m3!1m1!4e1!1m0");
            }
        });

        //Change Language App
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.txt_kh:
                        String language = "km";
                        setLocale(language);
                        break;
                    case R.id.txt_en:
                        setLocale("en");
                        break;
                }
            }
        });

        return view;
    }


    //Change Language
    private void setLocale(String language){
        //get recourses object
        Resources resources = getResources();

        //object from device Metrics
        DisplayMetrics metrics = resources.getDisplayMetrics();

        //all config
        Configuration configuration = resources.getConfiguration();
        configuration.locale = new Locale(language);
        resources.updateConfiguration(configuration, metrics );
        onConfigurationChanged(configuration);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        txt_Change_Language.setText(R.string.km_text);
        txt_en.setText(R.string.english);
        txt_kh.setText(R.string.khmer);
//        txt_Change_Theme_Mode.setText(R.string.change_theme_mode);
//        txt_Dark_mode.setText(R.string.dark_mode);
        txt_Social_Media.setText(R.string.social_media);
        txt_Faq.setText(R.string.frequently_ask_question);
        txt_App_Faq.setText(R.string.application_faq);
        txt_About_Us.setText(R.string.about_us);
        txt_Our_Vision.setText(R.string.our_vision);
        txt_location.setText(R.string.location);
        txt_location_txt.setText(R.string.location_text);

    }
}