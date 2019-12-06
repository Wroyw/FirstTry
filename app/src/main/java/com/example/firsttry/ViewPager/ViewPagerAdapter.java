package com.example.firsttry.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.firsttry.Fragment.FirstFragment;
import com.example.firsttry.Fragment.ForthFragment;
import com.example.firsttry.Fragment.SecondFragment;
import com.example.firsttry.Fragment.ThirdFragment;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public CharSequence getPageTitle(int a){
        return a+1+"";
    }




    @NonNull
    @Override
    public Fragment getItem(int i) {
        if (0==i){
            Fragment firstFragment =new FirstFragment();
            return firstFragment;
        }else if (1==i){
            Fragment secondFragment = new SecondFragment();
            return secondFragment;
        }else if (2==i){
            Fragment thirdFragment = new ThirdFragment();
            return thirdFragment;
        }else if (3==i){
            Fragment forthFragment = new ForthFragment();
            return forthFragment;
                }
        return null;

    }

    @Override
    public int getCount() {
        return 4;
    }
}
