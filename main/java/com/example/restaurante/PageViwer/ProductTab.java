package com.example.restaurante.PageViwer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.restaurante.R;
import com.example.restaurante.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ProductTab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_tab);

        TabLayout productstablayout = findViewById(R.id.productstablayout);
        TabItem tabfood = findViewById(R.id.foods);
        TabItem tabdrinks = findViewById(R.id.drinks);
        TabItem tabdesserts = findViewById(R.id.desserts);

       final  ViewPager viewPager = findViewById(R.id.viwpager);

        PagerAdapter pagerAdapter = new
                pagerAdapter(getSupportFragmentManager(),
                     productstablayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);


        productstablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
