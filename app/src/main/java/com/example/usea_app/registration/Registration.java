package com.example.usea_app.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.usea_app.R;

public class Registration extends AppCompatActivity {

    TextView txt_ass, txt_bach, txt_master;
    LinearLayout ass_layout, bach_layout, master_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getSupportActionBar().setTitle("          Registration");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        txt_ass=findViewById(R.id.txt_ass);
        txt_bach=findViewById(R.id.txt_bach);
        txt_master=findViewById(R.id.txt_master);
        ass_layout=findViewById(R.id.ass_layout);
        bach_layout=findViewById(R.id.bach_layout);
        master_layout=findViewById(R.id.master_layout);

        ass_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        bach_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        master_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }
    public void expand_ass(View view) {
        int view_ass = (txt_ass.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(ass_layout, new AutoTransition());
        txt_ass.setVisibility(view_ass);
    }

    public void expand_bach(View view) {
        int view_bach = (txt_bach.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(bach_layout, new AutoTransition());
        txt_bach.setVisibility(view_bach);
    }

    public void expand_master(View view) {
        int view_master = (txt_master.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(master_layout, new AutoTransition());
        txt_master.setVisibility(view_master);
    }
}