package com.example.usea_app.home.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.usea_app.R;
import com.example.usea_app.career.Career_Home;
import com.example.usea_app.library.Library;
import com.example.usea_app.news_event.NewsEvent;
import com.example.usea_app.program.Program;
import com.example.usea_app.registration.Registration;
import com.example.usea_app.scholarship.Scholarship;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        ImageButton news = view.findViewById(R.id.news);
        ImageButton register = view.findViewById(R.id.register);
        ImageButton program = view.findViewById(R.id.program);
        ImageButton career = view.findViewById(R.id.career);
        ImageButton scholarship = view.findViewById(R.id.scholarship);
        ImageButton library = view.findViewById(R.id.library);
        ImageSlider slide_image = view.findViewById(R.id.slide_image);

        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.sale, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.store, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.students, ScaleTypes.FIT));

        slide_image.setImageList(slideModels, ScaleTypes.FIT);

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewsEvent.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Registration.class);
                startActivity(intent);
            }
        });
        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Program.class);
                startActivity(intent);
            }
        });
        career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Career_Home.class);
                startActivity(intent);
            }
        });
        scholarship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Scholarship.class);
                startActivity(intent);
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Library.class);
                startActivity(intent);
            }
        });


        return view;
    }


}
