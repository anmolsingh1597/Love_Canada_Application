package com.lambton.love_canada_application.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.lambton.love_canada_application.FragmentViewActivity;
import com.lambton.love_canada_application.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {
    private Button fragmentBtn;
    private TextView titleText;

    public RedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_red, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        FragmentViewActivity fragObject = (FragmentViewActivity) getActivity();
            fragObject.toastString = "Activity: From Fragment";

        titleText = view.findViewById(R.id.titleId);
        fragmentBtn = view.findViewById(R.id.fragmentButton);
        fragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Fragment", Toast.LENGTH_SHORT).show();
            }
        });
        titleText.setText("I am Red Title");

    }
}
