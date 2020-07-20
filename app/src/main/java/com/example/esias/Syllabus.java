package com.example.esias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Syllabus extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] course = {"Select Course", "Bsc MB", "Bsc FT", "Bsc BT", "Bsc CS", "BCA", "BA Economics", "BA English", "BBA", "BCom"};
//    String[] batch = {"Select Batch", "2019", "Illinois", "Pecos", "LA"};
    String[] semester = {"Select Semester", "1st", "2nd", "3rd", "4th", "5th", "6th"};
    String getCourse, getBatch, getSemester;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, course);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setAdapter(aa);
        spin.setOnItemSelectedListener(new CountriesSpinnerClass());


//        ArrayAdapter aa2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, batch);
//        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        final Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
//        spin2.setAdapter(aa2);
//        spin2.setOnItemSelectedListener(new StatesSpinnerClass());

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semester);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin3 = (Spinner) findViewById(R.id.spinner3);
        spin3.setAdapter(aa3);
        spin3.setOnItemSelectedListener(new PlacesSpinnerClass());

        LinearLayout submitBtn = (LinearLayout) findViewById(R.id.syllSubmit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCourse = spin.getSelectedItem().toString();
//                getBatch = spin2.getSelectedItem().toString();
                getSemester = spin3.getSelectedItem().toString();
                checkLink();
            }
        });


    }

    public void checkLink() {
        if(getCourse.equals("BCA")&&getSemester.equals("1st")){
            linkMake("https://aquibe.github.io/e-sias-syllabus/bca-1.html");
        }
    }

    public void linkMake(String url) {
        Intent j = new Intent(getApplicationContext(), WebViewOne.class);
        j.putExtra("urltoload", url);
        j.putExtra("syllabusPage",true);
        startActivity(j);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    class CountriesSpinnerClass implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View v, int position, long id) {
//            Toast.makeText(v.getContext(), "Your choose :" + course[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class StatesSpinnerClass implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View v, int position, long id) {
//            Toast.makeText(v.getContext(), "Your choose :" + batch[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class PlacesSpinnerClass implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> arg0, View v, int position, long id) {
//            Toast.makeText(v.getContext(), "Your choose :" + semester[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}