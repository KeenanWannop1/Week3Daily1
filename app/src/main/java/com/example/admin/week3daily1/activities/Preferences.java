package com.example.admin.week3daily1.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.week3daily1.R;
import com.example.admin.week3daily1.fragments.MyPreferenceFragment;

public class Preferences extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        MyPreferenceFragment myPreferenceFragment = new MyPreferenceFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.llPreferences, myPreferenceFragment)
                .commit();
    }
}
