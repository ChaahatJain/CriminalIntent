package com.bignerdranch.android.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by chaahatjain on 17/11/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
