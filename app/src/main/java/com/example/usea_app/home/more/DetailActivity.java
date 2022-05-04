package com.example.usea_app.home.more;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usea_app.R;

public class DetailActivity extends AppCompatActivity {
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_detail_activity, container, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail_activity);

        String question = getIntent().getStringExtra("question");
        String answer = getIntent().getStringExtra("answer");
        getSupportActionBar().setTitle("                     FAQ");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView ques = findViewById(R.id.ques);
        TextView ans = findViewById(R.id.answer);

        ques.setText(question);
        ans.setText(answer);

//        return view;
    }
}