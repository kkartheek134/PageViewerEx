package com.example.kartheek.pageviewerex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Kartheek on 10/16/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;
    public PagerAdapter(FragmentManager fm,int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        //Fragment fragment=null;
        switch (position)
        {
            case 0:
             FragmentOne tab1=new FragmentOne();
                return tab1;
            case 1:
                FragmentTwo tab2=new FragmentTwo();
                return tab2;
            case 2:
                FragmentThree tab3=new FragmentThree();
                return tab3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
