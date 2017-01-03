package com.acadgild.com.session6_assignnment4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Valyoo on 1/3/2017.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index)
    {
        switch(index)
        {
            case 0: return new ImageFragment();

            case 1: return new VideoFragment();
        }
        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }


}
