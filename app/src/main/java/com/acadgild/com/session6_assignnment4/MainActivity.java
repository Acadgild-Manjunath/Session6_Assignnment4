package com.acadgild.com.session6_assignnment4;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener
         {

    private ViewPager viewPager;
    private TabsPagerAdapter adp;
    private ActionBar actionBar;

    private String[] tabs = {"Image Tab","Video Tab"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager1);
        actionBar = getSupportActionBar();
        adp = new TabsPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adp);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for(String tabName: tabs)
        {
            actionBar.addTab(actionBar.newTab().setText(tabName).setTabListener(this));
        }

        viewPager.setOnPageChangeListener(this);
    }


    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ftr)
    {

    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ftr)
    {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }





    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position)
    {
        actionBar.setSelectedNavigationItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
