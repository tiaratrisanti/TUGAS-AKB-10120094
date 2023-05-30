package com.TiaraTrisantiRamadhani_10120094_UTS_AKB.adapter;

/*
 * NIM : 10120094
 *Nama : Tiara Trisanti Ramadhani
 *Kelas : IF3
 * */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class InfoFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    public InfoFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentList.size();
    }
}

//10120094 - Tiara - IF3