package com.example.usea_app.home.account;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.usea_app.R;

public class GetInfo extends Fragment {
    TextView txtUsername, txtDateOfBirth, txtPlaceFrom, txtTitleJob, txtPhoneNum;
    String Username, DateOfBirth, PlaceFrom, TitleJob, PhoneNum, setUsername, setDateOfBirth, setPlaceFrom, setTitleJob, setPhoneNum;
    Button btnEdit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_get_info, container, false);

        txtUsername = view.findViewById(R.id.txtUsername);
        txtDateOfBirth = view.findViewById(R.id.txtDateOfBirth);
        txtPlaceFrom = view.findViewById(R.id.txtPlaceFrom);
        txtTitleJob = view.findViewById(R.id.txtTitleJob);
        txtPhoneNum = view.findViewById(R.id.txtPhoneNum);
        btnEdit = view.findViewById(R.id.btnEdit);

        Bundle bundle = getArguments();
        setUsername = bundle.getString("txtUsername");
        setDateOfBirth = bundle.getString("txtDateOfBirth");
        setPlaceFrom = bundle.getString("txtPlaceFrom");
        setTitleJob = bundle.getString("txtTitleJob");
        setPhoneNum = bundle.getString("txtPhoneNum");

        txtUsername.setText(setUsername);
        txtDateOfBirth.setText(setDateOfBirth);
        txtPlaceFrom.setText(setPlaceFrom);
        txtTitleJob.setText(setTitleJob);
        txtPhoneNum.setText(setPhoneNum);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Username = txtUsername.getText().toString();
                DateOfBirth = txtDateOfBirth.getText().toString();
                PlaceFrom = txtPlaceFrom.getText().toString();
                TitleJob = txtTitleJob.getText().toString();
                PhoneNum = txtPhoneNum.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("txtUsername", Username);
                bundle.putString("txtDateOfBirth", DateOfBirth);
                bundle.putString("txtPlaceFrom", PlaceFrom);
                bundle.putString("txtTitleJob", TitleJob);
                bundle.putString("txtPhoneNum", PhoneNum);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                EditInfo editInfo = new EditInfo();
                editInfo.setArguments(bundle);

                fragmentTransaction.replace(R.id.get_info, editInfo);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}