package com.example.converterapp;

import java.util.LinkedList;

public class Currency {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]currArray;

    public Currency(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> currConv(){
        if(mUnit != null) {
            //double
            double[] currArray = null;
            switch (mUnit) {
                case "":
                    currArray = new double[]{};
                    break;
            }
            if (currArray != null) {
                for (int i = 0; i < currArray.length; i++) {
                    currArray[i] *= mEntry;
                    mList.add(String.valueOf(currArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
