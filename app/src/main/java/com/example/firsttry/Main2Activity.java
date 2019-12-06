package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.firsttry.ViewPager.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        final TabLayout tabLayout = findViewById(R.id.tab_layout);

        for (int i = 0; i <=4 ; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(""+i));
        }

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int j = tabLayout.getSelectedTabPosition()+1;
                    Toast.makeText(Main2Activity.this, "这是第"+j+"个Fragment",
                              Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                return;
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                return;
            }
        });






    }
}
