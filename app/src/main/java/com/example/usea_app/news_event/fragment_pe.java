package com.example.usea_app.news_event;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.usea_app.R;

import java.util.ArrayList;
import java.util.List;

public class fragment_pe extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pe, container, false);

        ImageSlider slide_image = view.findViewById(R.id.slide_image);

        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.sale, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.store, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.students, ScaleTypes.FIT));

        slide_image.setImageList(slideModels, ScaleTypes.FIT);

        return view;
    }
}