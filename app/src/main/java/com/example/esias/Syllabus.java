package com.example.esias;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Syllabus extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] course = {"Select Course", "Bsc MB", "Bsc FT", "Bsc BT", "Bsc CS", "BCA", "BA Economics", "BA English", "BBA", "BCom"};
    String[] batch = {"Select Batch", "Texas", "Illinois", "Pecos", "LA"};
    String[] semester = {"Select Semester", "1st", "2nd", "3rd", "4th", "5th", "6th"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, course);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setAdapter(aa);
        spin.setOnItemSelectedListener(new CountriesSpinnerClass());

        ArrayAdapter aa2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, batch);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        spin2.setAdapter(aa2);
        spin2.setOnItemSelectedListener(new StatesSpinnerClass());

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semester);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spin3 = (Spinner) findViewById(R.id.spinner3);
        spin3.setAdapter(aa3);
        spin3.setOnItemSelectedListener(new PlacesSpinnerClass());
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    class CountriesSpinnerClass implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View v, int position, long id) {
            Toast.makeText(v.getContext(), "Your choose :" + course[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class StatesSpinnerClass implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View v, int position, long id) {
            Toast.makeText(v.getContext(), "Your choose :" + batch[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class PlacesSpinnerClass implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View v, int position, long id) {
            Toast.makeText(v.getContext(), "Your choose :" + semester[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}