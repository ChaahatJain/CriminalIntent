package com.bignerdranch.android.crimeintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chaahatjain on 17/11/17.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
           sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }
    public List<Crime>
}
