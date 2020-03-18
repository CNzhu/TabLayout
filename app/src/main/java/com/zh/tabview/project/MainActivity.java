package com.zh.tabview.project;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zh.tabview.project.views.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);
        String[] titles = new String[] {"第一个", "第二个", "第三个"};
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(TestFragment.instance(1));
        fragments.add(TestFragment.instance(2));
        fragments.add(TestFragment.instance(3));
        TabLayoutPagerAdapter adapter = new TabLayoutPagerAdapter(getSupportFragmentManager(),
                fragments, titles);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setIndictBottomOffset(45);
        tabLayout.setIndictHorizonOffset(80);
    }
}
