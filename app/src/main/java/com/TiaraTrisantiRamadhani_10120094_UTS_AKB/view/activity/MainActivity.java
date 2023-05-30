package com.TiaraTrisantiRamadhani_10120094_UTS_AKB.view.activity;

/*
 * NIM : 10120094
 *Nama : Tiara Trisanti Ramadhani
 *Kelas : IF3
 * */

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.R;
import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.view.fragment.NoteFragment;
import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.view.fragment.ProfileFragment;
import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.view.fragment.InfoFragment;

public class MainActivity extends AppCompatActivity {
    
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        //menampilkan halaman yang pertama muncul
        getFragmentPage(new InfoFragment());

        //insialisasi bottom nav
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case
                            R.id.info:
                        fragment = new InfoFragment();
                        break;
                    case
                            R.id.note:
                        fragment = new NoteFragment();
                        break;
                    case
                            R.id.profile:
                        fragment = new ProfileFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}

//10120094 - Tiara - IF3