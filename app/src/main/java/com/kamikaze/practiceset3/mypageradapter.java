package com.kamikaze.practiceset3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class mypageradapter extends FragmentPagerAdapter {
    private int numoftabs;

    public mypageradapter(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new monster_info();
            case 1:
                return new pokemon_info();
            case 2:
                return new onepiece_info();
            default:
                return new monster_info();

        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position) {
            case 0:
                title = "Monster";
                break;
            case 1:
                title = "Pokemon";
                break;
            case 2:
                title = "One Piece";
break;
        }
        return title;
    }
}
