package com.example.restaurante.PageViwer;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.restaurante.ProductFragments.Desserts;
import com.example.restaurante.ProductFragments.Drinks;
import com.example.restaurante.ProductFragments.Food;

public class pagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public  pagerAdapter(FragmentManager fm,int numOfTabs) {

        super(fm);

        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new Food();

            case 1:
                return new Drinks();
            case 2:
                return new Desserts();

            default:
                return null;
    }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
