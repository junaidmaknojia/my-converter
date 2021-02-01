package com.example.converterapp;

import android.util.Log;

import java.util.LinkedList;

public class Weight {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]weightArray;

    public Weight(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> weightConv(){
        if(mUnit != null) {
            //double  kg, lbs, oz, ton, slug, carat
            double[] weightArray = null; //kg, lbs, oz, ton, slug, carat
            switch (mUnit) {
                case "kg":
                    weightArray = new double[]{};
                    break;
                case "lbs":
                    weightArray = new double[]{};
                    break;
                case "oz":
                    weightArray = new double[]{};
                    break;
                case "ton":
                    weightArray = new double[]{};
                    break;
                case "slug":
                    weightArray = new double[]{};
                    break;
                case "carat":
                    weightArray = new double[]{};
                    break;
            }
            if (weightArray != null) {
                for (int i = 0; i < weightArray.length; i++) {
                    weightArray[i] *= mEntry;
                    mList.add(String.valueOf(weightArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
