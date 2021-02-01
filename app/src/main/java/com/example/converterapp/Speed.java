package com.example.converterapp;

import java.util.LinkedList;

public class Speed {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]speedArray;

    public Speed(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> speedConv(){
        if(mUnit != null) {
            //double  m/s, mph, km/h, ft/s, Mach, knot
            double[] speedArray = null;
            switch (mUnit) {
                case "m/s":
                    speedArray = new double[]{};
                    break;
                case "mph":
                    speedArray = new double[]{};
                    break;
                case "km/h":
                    speedArray = new double[]{};
                    break;
                case "ft/s":
                    speedArray = new double[]{};
                    break;
                case "Mach":
                    speedArray = new double[]{};
                    break;
                case "knot":
                    speedArray = new double[]{};
                    break;
            }
            if (speedArray != null) {
                for (int i = 0; i < speedArray.length; i++) {
                    speedArray[i] *= mEntry;
                    mList.add(String.valueOf(speedArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
