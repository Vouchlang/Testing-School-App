package com.example.usea_app.home.account;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.usea_app.R;
import com.example.usea_app.SharePreferenceUtils;

import de.hdodenhof.circleimageview.CircleImageView;

public class EditInfo extends Fragment {

    EditText editUsername, editDateOfBirth,editPlaceFrom, editTitleJob, editPhoneNum;
    Button btnSave;
    String username, dateofbirth, placefrom, jobtitle, phonenum, setusername, setdateofbirth, setplacefrom, setjobtitle, setphonenum;
    CircleImageView btnProfile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edit_activity,container,false);

        btnProfile = view.findViewById(R.id.btnProfile);
        editUsername = view.findViewById(R.id.EditUsername);
        editDateOfBirth = view.findViewById(R.id.EditDateOfBirth);
        editPlaceFrom = view.findViewById(R.id.EditPlaceFrom);
        editTitleJob = view.findViewById(R.id.EditTitleJob);
        editPhoneNum = view.findViewById(R.id.EditPhoneNum);
        btnSave = view.findViewById(R.id.btnSave);

        Bundle bundle = getArguments();
        username = bundle.getString("txtUsername");
        dateofbirth = bundle.getString("txtDateOfBirth");
        placefrom = bundle.getString("txtPlaceFrom");
        jobtitle = bundle.getString("txtTitleJob");
        phonenum = bundle.getString("txtPhoneNum");

        editUsername.setText(username);
        editDateOfBirth.setText(dateofbirth);
        editPlaceFrom.setText(placefrom);
        editTitleJob.setText(jobtitle);
        editPhoneNum.setText(phonenum);
//        btnProfile.setImageResource(R.drawable.male);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setusername = editUsername.getText().toString();
                setdateofbirth = editDateOfBirth.getText().toString();
                setplacefrom = editPlaceFrom.getText().toString();
                setjobtitle = editTitleJob.getText().toString();
                setphonenum = editPhoneNum.getText().toString();

                SharePreferenceUtils.getInstance().saveString("Pre_Name", setusername);
                SharePreferenceUtils.getInstance().saveString("txtDateOfBirth", setdateofbirth);
                SharePreferenceUtils.getInstance().saveString("txtPlaceFrom", setplacefrom);
                SharePreferenceUtils.getInstance().saveString("txtTitleJob", setjobtitle);
                SharePreferenceUtils.getInstance().saveString("txtPhoneNum", setphonenum);

                Log.d("msg", "Running >>> " + setusername + SharePreferenceUtils.getInstance().getString("Pre_Name"));

                Bundle bundle = new Bundle();
                bundle.putString("txtUsername", setusername);
                bundle.putString("txtDateOfBirth", setdateofbirth);
                bundle.putString("txtPlaceFrom", setplacefrom);
                bundle.putString("txtTitleJob", setjobtitle);
                bundle.putString("txtPhoneNum", setphonenum);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//                GetInfo getInfo = new GetInfo();
//                getInfo.setArguments(bundle);
//
//                fragmentTransaction.replace(R.id.edit_activity, getInfo);
                Fragment_Account fragment_account = new Fragment_Account();
                fragment_account.setArguments(bundle);

                fragmentTransaction.replace(R.id.edit_activity, fragment_account);
                fragmentTransaction.commit();
            }
        });

        return view;

    }
}
