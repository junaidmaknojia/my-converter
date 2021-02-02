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
    private Class<Object> classType;
    private LinkedList<String> hermes;

    public Processor(String unit, double entry){
//        mUnit = unit;
//        mEntry = entry;
//        type = measurement;
    }

    public void selectedUnit(String unit){
        switch (type){
            case "length":
                classType = new Length(unit, mEntry);
                break;
            case "weight":
                classType = new Weight(unit, mEntry);
                break;
            case "temperature":
                classType = new Temperature(unit, mEntry);
                break;
            case "currency":
                classType = new Currency(unit, mEntry);
                break;
            case "volume":
                classType = new Volume(unit, mEntry);
                break;
            case "pressure":
                classType = new Pressure(unit, mEntry);
                break;
            case "speed":
                classType = new Speed(unit, mEntry);
                break;
            case "energy":
                classType = new Energy(unit, mEntry);
                break;
            default:
        }

        hermes = classType.conv();
    }

    public void selectMeasurement(){

    }
}
