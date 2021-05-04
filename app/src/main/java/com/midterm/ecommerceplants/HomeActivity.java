package com.midterm.ecommerceplants;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private PagerAdapter mViewPagerAdapter;
    private final BottomNavigationView.OnNavigationItemSelectedListener mNavigationItemSelectedListener = item -> {
        Fragment selectedFragment = null;
        switch (item.getItemId()) {
            case R.id.homeFragment:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.cartFragment:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.personFragment:
                mViewPager.setCurrentItem(2);
                break;
        }
        return true;
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomBar);
        bottomNavigationView.setOnNavigationItemSelectedListener(mNavigationItemSelectedListener);
//        NavigationUI.setupWithNavController(bottomNavigationView, navController);
        mViewPager = findViewById(R.id.viewpager);
        mViewPagerAdapter = new com.midterm.ecommerceplants.PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mViewPagerAdapter);
        mViewPager.setOffscreenPageLimit(3);
    }
}