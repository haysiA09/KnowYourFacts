package com.example.a16022877.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {
    View v;
    TextView tv;


    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_3,container,false);
        Button btnChangeColor=(Button)v.findViewById(R.id.buttonColor);

        tv = (TextView) v.findViewById(R.id.tv);
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                v.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));

            }});
        return v;
    }

}
