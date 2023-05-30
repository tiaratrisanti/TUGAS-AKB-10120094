package com.TiaraTrisantiRamadhani_10120094_UTS_AKB.view.fragment;
/*
 * NIM : 10120094
 *Nama : Tiara Trisanti Ramadhani
 *Kelas : IF3
 * */
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.view.activity.MainActivity;
import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.R;

public class ProfileFragment extends Fragment {

    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar().hide();
    }
}

//10120094 - Tiara - IF3