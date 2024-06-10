package com.example.tourmyindia.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tourmyindia.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<List<State>> stateList;

    public GalleryViewModel() {
        stateList = new MutableLiveData<>();
        loadStates();
    }

    private void loadStates() {
        List<State> states = new ArrayList<>();
        states.add(new State("Andhra Pradesh", R.drawable.darj));
        states.add(new State("Arunachal Pradesh", R.drawable.tw));
        states.add(new State("Assam", R.drawable.kgr));
        states.add(new State("Bihar", R.drawable.camping));
        states.add(new State("Chhattisgarh", R.drawable.paragliding));
        states.add(new State("Goa", R.drawable.goa));
        states.add(new State("Gujarat", R.drawable.somnath));
        states.add(new State("Haryana", R.drawable.museum));
        states.add(new State("Himachal Pradesh", R.drawable.himachal));
        states.add(new State("J & K", R.drawable.gul));
        states.add(new State("Jharkhand", R.drawable.srk));
        states.add(new State("Karnataka", R.drawable.myr));
        states.add(new State("Kerala", R.drawable.bd));
        states.add(new State("Madhya Pradesh", R.drawable.mahakal));
        states.add(new State("Maharashtra", R.drawable.ajt));
        states.add(new State("Manipur", R.drawable.mani));
        states.add(new State("Meghalaya", R.drawable.jog));
        states.add(new State("Mizoram", R.drawable.sb));
        states.add(new State("Nagaland", R.drawable.wild));
        states.add(new State("New Delhi", R.drawable.rft));
        states.add(new State("Odisha", R.drawable.jagannath));
        states.add(new State("Punjab", R.drawable.goldent));
        states.add(new State("Rajasthan", R.drawable.paragliding));
        states.add(new State("Sikkim", R.drawable.wild));
        states.add(new State("Tamil Nadu", R.drawable.chn));
        states.add(new State("Telangana", R.drawable.ch));
        states.add(new State("Tripura", R.drawable.ath));
        states.add(new State("Uttar Pradesh", R.drawable.taj));
        states.add(new State("Uttarakhand", R.drawable.temple));
        states.add(new State("West Bengal", R.drawable.sb));
        stateList.setValue(states);
    }

    public LiveData<List<State>> getStateList() {
        return stateList;
    }
}
