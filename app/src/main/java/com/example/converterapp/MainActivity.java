package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    public double userEntry;
    public int selectArray;
    public String unitSelect;
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private EditText editText;
    private Spinner measurements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        measurements = findViewById(R.id.spinner);
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


        editText = findViewById(R.id.entry);
        if (editText != null) {
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView textView, int j, KeyEvent keyEvent) {
                boolean mHandled = false;
                if (j == EditorInfo.IME_ACTION_SEND) {
                    recycleSetup();
                    mHandled = true;
                }
                return mHandled;
                }
            });
        }
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
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
        }
    };





    public void recycleSetup(){
        if(findViewById(R.id.entry) != null){
            userEntry = Double.parseDouble(editText.getText().toString());
            LinkedList<String> arr = fillTable();
            mRecyclerView = findViewById(R.id.liststuff);
            mAdapter = new WordListAdapter(this, arr);
            mRecyclerView.setAdapter(mAdapter);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }

    public LinkedList<String> fillTable(){
        Length length = new Length(unitSelect, userEntry);
        return length.lengthConv();
    }
}