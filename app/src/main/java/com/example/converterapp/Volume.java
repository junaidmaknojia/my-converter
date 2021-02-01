package com.example.converterapp;

import java.util.LinkedList;

public class Volume {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]volArray;

    public Volume(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> volConv(){
        if(mUnit != null) {
            //double  m^3, cm^3, in^3, mm^3, L, mL, gallon, pint
            //           cup, quart, tbsp, tsp, fl oz, oz
            double[] volArray = null;
            switch (mUnit) {
                case "m^3":
                    volArray = new double[]{};
                    break;
                case "cm^3":
                    volArray = new double[]{};
                    break;
                case "in^3":
                    volArray = new double[]{};
                    break;
                case "mm^3":
                    volArray = new double[]{};
                    break;
                case "L":
                    volArray = new double[]{};
                    break;
                case "mL":
                    volArray = new double[]{};
                    break;
                case "gallon":
                    volArray = new double[]{};
                    break;
                case "pint":
                    volArray = new double[]{};
                    break;
                case "cup":
                    volArray = new double[]{};
                    break;
                case "quarts":
                    volArray = new double[]{};
                    break;
                case "tbsp":
                    volArray = new double[]{};
                    break;
                case "tsp":
                    volArray = new double[]{};
                    break;
                case "fl oz":
                    volArray = new double[]{};
                    break;
                case "oz":
                    volArray = new double[]{};
                    break;
            }
            if (volArray != null) {
                for (int i = 0; i < volArray.length; i++) {
                    volArray[i] *= mEntry;
                    mList.add(String.valueOf(volArray[i]));
                }
                return mList;
            }
        }
        return null;
    }
}
