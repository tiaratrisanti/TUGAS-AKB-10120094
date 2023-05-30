package com.TiaraTrisantiRamadhani_10120094_UTS_AKB.view.activity;

/*
 * NIM : 10120094
 *Nama : Tiara Trisanti Ramadhani
 *Kelas : IF3
 * */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L);
    }
}

//10120094 - Tiara - IF3