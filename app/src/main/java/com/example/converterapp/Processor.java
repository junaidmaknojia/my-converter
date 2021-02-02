package com.example.converterapp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Processor {
    // take in the measurement type and unit and editText value
    // create instances of all the measurements
    // send in the value and the unit into the instances
    private String mUnit;
    private double mEntry;
    private String type;
    private Length classType;
    private LinkedList<String> hermes;

    public Processor(){
//        mUnit = unit;
//        mEntry = entry;
//        type = measurement;
    }

    public void selectedUnit(String unit){
        switch (type){
            case "length":
                classType = new Length(mUnit, mEntry);
                hermes = classType.lengthConv();
                break;
            case "weight":
                selectArray = R.array.weight;
                break;
            case "temperature":
                selectArray = R.array.temperature;
                break;
            case "currency":
                selectArray = R.array.currency;
                break;
            case "volume":
                selectArray = R.array.volume;
                break;
            case "pressure":
                selectArray = R.array.pressure;
                break;
            case "speed":
                selectArray = R.array.speed;
                break;
            case "energy":
                selectArray = R.array.energy;
                break;
            default:
        }
    }

    public void selectMeasurement(){

    }
}
