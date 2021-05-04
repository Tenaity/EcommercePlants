package com.midterm.ecommerceplants;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new PlantFragment();
                break;
            case 1:
                frag = new CartFragment();
                break;
            case 2:
                frag = new PersonFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
}