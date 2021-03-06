package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson09PagerAdapter extends FragmentStatePagerAdapter {
    public Lesson09PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson09A();
        }

        if(i==1){
            fragment = new Lesson09B();
        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String current_title = new String();

        if(position==0){

            current_title = "Form words with prefixes and suffixes";
        }

        if(position==1){

            current_title = "Activities";
        }

        return current_title;
    }
}
