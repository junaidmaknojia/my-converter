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
    private LinkedList<String> hermes;
    private Length length;
    private Weight weight;
    private Temperature temp;
    private Currency curr;
    private Volume volume;
    private Pressure press;
    private Speed speed;
    private Energy energy;

    public Processor(String unit, double entry){
//        mUnit = unit;
//        mEntry = entry;
//        type = measurement;
    }

    public void selectedUnit(String unit){

        switch (type){
            case "length":
                length = new Length(unit, mEntry);
                hermes = length.lengthConv();
                break;
            case "weight":
                weight = new Weight(unit, mEntry);
                hermes = weight.weightConv();
                break;
            case "temperature":
                temp = new Temperature(unit, mEntry);
                hermes = temp.tempConv();
                break;
            case "currency":
                curr = new Currency(unit, mEntry);
                hermes = curr.currConv();
                break;
            case "volume":
                volume = new Volume(unit, mEntry);
                hermes = volume.volConv();
                break;
            case "pressure":
                press = new Pressure(unit, mEntry);
                hermes = press.pressConv();
                break;
            case "speed":
                speed = new Speed(unit, mEntry);
                hermes = speed.speedConv();
                break;
            case "energy":
                energy = new Energy(unit, mEntry);
                hermes = energy.energyConv();
                break;
            default:
        }
    }

    public void selectMeasurement(){

    }
}
