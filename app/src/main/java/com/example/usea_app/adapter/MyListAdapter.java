package com.example.usea_app.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

//import com.example.moreapp.R;
import com.example.usea_app.R;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] ques;
    private final String[] ans;
    public MyListAdapter(Activity context, String[] question, String[] answer){
        super(context, R.layout.list_item, question);

        this.context = context;
        this.ques = question;
        this.ans = answer;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);
        TextView listQues = (TextView) rowView.findViewById(R.id.listQues);
        //TextView listAns = (TextView) rowView.findViewById(R.id.listAns);
        listQues.setText(ques[position]);
        //listAns.setText(ans[position]);
        return rowView;
    };
}
