package com.example.sangariyaadarshsrsecschool;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class OnlineStudyPagerAdapter extends FragmentStatePagerAdapter {

    //vars
   private ArrayList<Fragment> fragmentsList = new ArrayList<>();
   private ArrayList<String> fragmentTitle = new ArrayList<>();

    public OnlineStudyPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

    }


    //methods
    @NonNull
    @Override
    public Fragment getItem(int position) {
            return fragmentsList.get(position);

    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }

    public void addFragment(Fragment fragment, String title)
    {
        fragmentsList.add(fragment);
        fragmentTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
