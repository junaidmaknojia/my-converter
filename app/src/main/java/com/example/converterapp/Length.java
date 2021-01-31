package com.example.converterapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Length {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]lengthArray;

    public Length(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> lengthConv(){
        if(mUnit != null) {
            //double m, yd, ft, in, lightyear, league, nleague, nmile, mile, fathom;
            double[] lengthArray = null; //m, yd, ft, in, lightyear, league, nleague, nmile, mile, fathom
            Log.i("Length", "inside lengthConv and entry is " + mEntry);
            switch (mUnit) {
                case "m":
                    lengthArray = new double[]{1, 1.09361, 3.2803, 39.36996, 1.057008707E-16,
                            0.00025, 0.000179986, 0.000540, 0.0006213689, 0.546807};
                    break;
                case "yd":
                    lengthArray = new double[]{0.9144, 1, 3, 36, 9.6652e-17, 0.000189394, 0.000164579,
                            0.000493737, 0.000568182, 0.5};
                    break;
                case "ft":
                    lengthArray = new double[]{0.3048, 0.33333, 1, 12, 3.2217e-17, 0.000063131,
                            0.00005486, 0.000164579, 0.000189394, 0.166667};
                    break;
                case "in":
                    lengthArray = new double[]{0.0254, 0.027777777, 0.0833333, 1, 2.6848e-18, 0.000005261,
                            0.0000045716, 0.000013715, 0.000015783, 0.0138889};
                    break;
                case "light-year":
                    lengthArray = new double[]{9.461333376e+15, 10.34704e+15, 31.04112e+15,
                            372.49344e+15, 1, 1.959537872e+12, 1.702795261e+12, 5108711326133.9091797,
                            5.879e+12, 5.173190328e+15};
                    break;
                case "league":
                    lengthArray = new double[]{4828.032, 5280, 15840, 190080, 5.103233851e-13, 1,
                            0.868976242, 2.606928726, 2.999994, 2640};
                    break;
                case "nautical league":
                    lengthArray = new double[]{5556.00266688, 6076.1184021, 18228.35520629994062,
                            218740.26247559930198, 5.872696634e-13, 1.150779448, 1, 3.0000014400001200343,
                            3.45234, 3038.057742782};
                    break;
                case "nautical mile":
                    lengthArray = new double[]{1852, 2025.37, 6076.12, 72913.4, 1.9576e-13,
                            0.383593149, 0.3333333, 1, 1.15078, 1012.69};
                    break;
                case "mile":
                    lengthArray = new double[]{1609.34, 1760, 5280, 63360, 1.7011e-13, 0.333334,
                            0.289659, 0.868976, 1, 880};
                    break;
                case "fathom":
                    lengthArray = new double[]{1.8288, 1.9999936, 5.9999808, 71.9997696,
                            1.957565545e-13, 0.000378788, 0.000329158, 0.000987469842246, 0.00113636, 1};
                    break;
            }
            if (lengthArray != null) {
                //stringArr = findViewById()
                for (int i = 0; i < lengthArray.length; i++) {
                    lengthArray[i] *= mEntry;
                    mList.add(String.valueOf(lengthArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
