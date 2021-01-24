package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    public double entry;
    public int selectArray;
    public String unitSelect;
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<Integer> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner measurements = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.measurements, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        measurements.setAdapter(adapter);
        measurements.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Spinner units = findViewById(R.id.spinner2);
                switch ((adapterView.getItemAtPosition(i)).toString().toLowerCase()){
                    case "length":
                        selectArray = R.array.length;
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
                ArrayAdapter<CharSequence> jAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                        selectArray, android.R.layout.simple_spinner_item);
                jAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                units.setAdapter(jAdapter);

                units.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        unitSelect = (String) adapterView.getItemAtPosition(i);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) { }
                });
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { }
        });

        EditText editText = findViewById(R.id.entry);
        if (editText != null)
            editText.setOnEditorActionListener
                    (new TextView.OnEditorActionListener() {
                        @Override
                        public boolean onEditorAction(TextView textView, int j, KeyEvent keyEvent) {
                            boolean mHandled = false;
                            if (j == EditorInfo.IME_ACTION_SEND) {
                                recycleSetup();
                                mHandled = true;
                            }
                            return mHandled;
                        }
                        // If view is found, set the listener for editText.
                    });
    }

    public void recycleSetup(){
        if(findViewById(R.id.entry) != null){
            System.out.println("Inside recyclesetup if statement");
            arr = fillTable();
            Log.d("MAINACTIVITY", "Filled the table");
            mRecyclerView = findViewById(R.id.liststuff);
            mAdapter = new WordListAdapter(this, arr);
            mRecyclerView.setAdapter(mAdapter);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }

    public LinkedList<Integer> fillTable(){
        Calculations calc = new Calculations(unitSelect);
        arr = calc.lengthConv(entry);
        System.out.println("Created arr in filltable");
        //System.out.println(lengthArray); // to test what is being returned from the Calculations object
        return arr;
    }
}