package com.example.converterapp;

import java.util.LinkedList;

public class Temperature {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]tempArray;

    public Temperature(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> tempConv(){
        if(mUnit != null) {
            //double
            double[] tempArray = null;
            switch (mUnit) {
                case "K":
                    tempArray = new double[]{};
                    break;
                case "F":
                    tempArray = new double[]{};
                    break;
                case "C":
                    tempArray = new double[]{};
                    break;
                case "Rankine":
                    tempArray = new double[]{};
                    break;
            }
            if (tempArray != null) {
                for (int i = 0; i < tempArray.length; i++) {
                    tempArray[i] *= mEntry;
                    mList.add(String.valueOf(tempArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
