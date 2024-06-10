package com.example.tourmyindia.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tourmyindia.R;
import com.example.tourmyindia.databinding.FragmentHomeBinding;
import com.example.tourmyindia.homebuttons.ActivityEight;
import com.example.tourmyindia.homebuttons.ActivityFive;
import com.example.tourmyindia.homebuttons.ActivityFour;
import com.example.tourmyindia.homebuttons.ActivityOne;
import com.example.tourmyindia.homebuttons.ActivitySeven;
import com.example.tourmyindia.homebuttons.ActivitySix;
import com.example.tourmyindia.homebuttons.ActivityThree;
import com.example.tourmyindia.homebuttons.ActivityTwo;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final ImageButton btn = (ImageButton) root.findViewById(R.id.button1);
        final ImageButton btn1 = (ImageButton) root.findViewById(R.id.button2);
        final ImageButton btn2 = (ImageButton) root.findViewById(R.id.button3);
        final ImageButton btn3 = (ImageButton) root.findViewById(R.id.button4);
        final ImageButton btn4 = (ImageButton) root.findViewById(R.id.button5);
        final ImageButton btn5 = (ImageButton) root.findViewById(R.id.button6);
        final ImageButton btn6 = (ImageButton) root.findViewById(R.id.button7);
        final ImageButton btn7 = (ImageButton) root.findViewById(R.id.button8);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityOne.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityTwo.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityThree.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityFour.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityFive.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivitySix.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivitySeven.class);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityEight.class);
                startActivity(intent);
            }
        });

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
/*
        btn = (Button) getView().findViewById(R.id.button1);
                btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

        */
    }
}