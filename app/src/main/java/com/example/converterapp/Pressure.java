package com.example.converterapp;

import java.util.LinkedList;

public class Pressure {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]pressArray;

    public Pressure(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> pressConv(){
        if(mUnit != null) {
            //double  Pa, psi, ksi, bar, atm, N/m^2, kg/m^2, ton/ft^2
            double[] pressArray = null;
            switch (mUnit) {
                case "Pa":
                    pressArray = new double[]{};
                    break;
                case "psi":
                    pressArray = new double[]{};
                    break;
                case "ksi":
                    pressArray = new double[]{};
                    break;
                case "bar":
                    pressArray = new double[]{};
                    break;
                case "atm":
                    pressArray = new double[]{};
                    break;
                case "N/m^2":
                    pressArray = new double[]{};
                    break;
                case "kg/m^2":
                    pressArray = new double[]{};
                    break;
                case "ton/ft^2":
                    pressArray = new double[]{};
                    break;
            }
            if (pressArray != null) {
                for (int i = 0; i < pressArray.length; i++) {
                    pressArray[i] *= mEntry;
                    mList.add(String.valueOf(pressArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
