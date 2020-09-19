package com.example.practical7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class ThirdFragment extends Fragment {

    RelativeLayout relativeLayout;
    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        relativeLayout = view.findViewById(R.id.relative_layout);
        relativeLayout.setBackground(getResources().getDrawable(R.drawable.sweep_gradients));
        return view;
    }
}