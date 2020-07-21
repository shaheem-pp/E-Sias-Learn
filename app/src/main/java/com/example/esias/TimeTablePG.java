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

public class TimeTablePG extends AppCompatActivity {

    String[] course = {"Select Course", "Msc MB", "Msc FT", "Msc BT", "MA IF", "MCom", "MCJ"};
    String[] year = {"Select Year", "1st", "2nd"};
    String getCourse, getYear;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table_p_g);
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
        final Spinner spin = (Spinner) findViewById(R.id.tt_pg_course_spinner);
        spin.setAdapter(aa);

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, year);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin3 = (Spinner) findViewById(R.id.tt_pg_year_spinner);
        spin3.setAdapter(aa3);

        Button submitBtn = (Button) findViewById(R.id.tt_pg_year_submit);
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
                    Toast.makeText(this,"Please select a course and Year",Toast.LENGTH_SHORT).show();
                    break;
                }
                else {
                    Toast.makeText(this,"Please select a course",Toast.LENGTH_SHORT).show();
                    break;
                }

            case "MCJ" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mcj-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mcj-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mcj-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mcj-4.html");
                }
                break;

            case "Msc MB" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mmb-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mmb-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mmb-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mmb-4.html");
                }
                break;

            case "Msc BT" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mbt-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mbt-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mbt-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mbt-4.html");
                }
                break;

            case "MA IF" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mif-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mif-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mif-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mif-4.html");
                }
                break;

            case "Msc FT" :
                if (getYear.equals("Select Year")) {
                    Toast.makeText(this, "Please select a year", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getYear.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mft-1.html");
                }
                else if(getYear.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mft-2.html");
                }
                else if(getYear.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-timetable/mft-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-timetable/mft-4.html");
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
