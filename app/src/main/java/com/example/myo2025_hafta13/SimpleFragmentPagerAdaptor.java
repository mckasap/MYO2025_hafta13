package com.example.myo2025_hafta13;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SimpleFragmentPagerAdaptor extends FragmentStateAdapter {
    public SimpleFragmentPagerAdaptor(FragmentManager fm, Lifecycle lc) {
        super(fm,lc);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position=position%4;
        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new fragment3();
            case 3:
                return new Fragment4();
            default:
                return new Fragment1();
        }
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
