package com.example.esias;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class TimeTable extends AppCompatActivity {

    String[] course = {"Select Course", "Bsc MB", "Bsc FT", "Bsc BT", "Bsc CS", "BCA", "BA IF","BA Economics", "BA English", "BBA", "BCom"};
    String[] year = {"Select Year", "1st", "2nd", "3rd"};
    String getCourse, getYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        ImageView iv = (ImageView) findViewById(R.id.drawer_icon);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), UGPGTTSelection.class);
                startActivity(k);
            }
        });

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, course);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin = (Spinner) findViewById(R.id.tt_ug_course_spinner);
        spin.setAdapter(aa);

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, year);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin3 = (Spinner) findViewById(R.id.tt_ug_year_spinner);
        spin3.setAdapter(aa3);

        Button submitBtn = (Button) findViewById(R.id.tt_ug_year_submit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCourse = spin.getSelectedItem().toString();
                getYear = spin3.getSelectedItem().toString();
                checkLink();
            }
        });
    }

    public void checkLink() {

        switch (getCourse) {

            case "Select Course" :
                if (getYear.equals("Select Year")){
                    Toast.makeText(this,"Please select a course and year",Toast.LENGTH_SHORT).show();
                    break;
                }
                else {
                    Toast.makeText(this,"Please select a course",Toast.LENGTH_SHORT).show();
                    break;
                }

            case "BCA":
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bca-1.html");
                } else if (getYear.equals("2nd")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bca-2.html");
                } else if (getYear.equals("3rd")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bca-3.html");
                } else if (getYear.equals("4th")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bca-4.html");
                } else if (getYear.equals("5th")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bca-5.html");
                } else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bca-6.html");
                }
                break;

            case "Bsc CS":
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/cs-1.html");
                } else if (getYear.equals("2nd")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/cs-2.html");
                } else if (getYear.equals("3rd")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/cs-3.html");
                } else if (getYear.equals("4th")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/cs-4.html");
                } else if (getYear.equals("5th")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/cs-5.html");
                } else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/cs-6.html");
                }
                break;

            case "BA English":
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/en-1.html");
                } else if (getYear.equals("2nd")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/en-2.html");
                } else if (getYear.equals("3rd")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/en-3.html");
                } else if (getYear.equals("4th")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/en-4.html");
                } else if (getYear.equals("5th")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/en-5.html");
                } else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/en-6.html");
                }
                break;

            case "Bsc FT":
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/ft-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/ft-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/ft-3.html");
                }
                else if(getYear.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/ft-4.html");
                }
                else if(getYear.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/ft-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-timetable/ft-6.html");
                }
                break;

            case "Bsc IF" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/if-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/if-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/if-3.html");
                }
                else if(getYear.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/if-4.html");
                }
                else if(getYear.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/if-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-timetable/if-6.html");
                }
                break;

            case "BBA" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bba-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bba-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bba-3.html");
                }
                else if(getYear.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bba-4.html");
                }
                else if(getYear.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bba-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-timetable/bba-6.html");
                }
                break;

            case "BCom" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bcom-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bcom-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bcom-3.html");
                }
                else if(getYear.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bcom-4.html");
                }
                else if(getYear.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bcom-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-timetable/bcom-6.html");
                }
                break;

            case "Bsc BT" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/bio-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bio-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bio-3.html");
                }
                else if(getYear.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bio-4.html");
                }
                else if(getYear.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/bio-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-timetable/bio-6.html");
                }
                break;

            case "BA Economics" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/eco-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/eco-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/eco-3.html");
                }
                else if(getYear.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/eco-4.html");
                }
                else if(getYear.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/eco-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-timetable/eco-6.html");
                }
                break;

        }
    }
    public void linkMake(String url) {
        Intent j = new Intent(getApplicationContext(), WebViewOne.class);
        j.putExtra("urltoload", url);
        j.putExtra("syllabusPage", true);
        startActivity(j);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),UGPGTTSelection.class);
        startActivity(i);
        finish();
    }
}
