package com.example.tourmyindia.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import com.example.tourmyindia.ChangePasswordActivity;
import com.example.tourmyindia.R;
import com.example.tourmyindia.databinding.FragmentSlideshowBinding;
import com.google.firebase.auth.FirebaseAuth;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set onClick listeners for change password and logout actions
        root.findViewById(R.id.card_change_password).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePassword();
            }
        });

        root.findViewById(R.id.card_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void changePassword() {
        Intent intent = new Intent(getActivity(), ChangePasswordActivity.class);
        startActivity(intent);
    }

    public void logout() {
        FirebaseAuth.getInstance().signOut();
        ActivityCompat.finishAffinity(getActivity()); // This will close the app
    }

}
