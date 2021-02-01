package com.example.converterapp;

import java.util.LinkedList;

public class Energy {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]Array;

    public Energy(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> energyConv(){
        if(mUnit != null) {
            //double  J, calorie, hp, kW-h, Btu

            double[] energyArray = null;
            switch (mUnit) {
                case "J":
                    energyArray = new double[]{};
                    break;
                case "calorie":
                    energyArray = new double[]{};
                    break;
                case "hp":
                    energyArray = new double[]{};
                    break;
                case "kW-h":
                    energyArray = new double[]{};
                    break;
                case "Btu":
                    energyArray = new double[]{};
                    break;
            }
            if (energyArray != null) {
                for (int i = 0; i < energyArray.length; i++) {
                    energyArray[i] *= mEntry;
                    mList.add(String.valueOf(energyArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
