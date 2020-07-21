package com.example.esias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class Syllabus extends AppCompatActivity {

    String[] course = {"Select Course", "Bsc MB", "Bsc FT", "Bsc BT", "Bsc CS", "BCA", "BA IF","BA Economics", "BA English", "BBA", "BCom"};
    String[] semester = {"Select Semester", "1st", "2nd", "3rd", "4th", "5th", "6th"};
    String getCourse, getSemester;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        ImageView iv = (ImageView) findViewById(R.id.drawer_icon);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), UGPGSelection.class);
                startActivity(k);
            }
        });

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, course);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setAdapter(aa);

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semester);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin3 = (Spinner) findViewById(R.id.spinner3);
        spin3.setAdapter(aa3);

        Button submitBtn = (Button) findViewById(R.id.syllSubmit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCourse = spin.getSelectedItem().toString();
                getSemester = spin3.getSelectedItem().toString();
                checkLink();
            }
        });

    }

    public void checkLink() {

        switch (getCourse) {

            case "Select Course" :
                if (getSemester.equals("Select Semester")){
                    Toast.makeText(this,"Please select a course and semester",Toast.LENGTH_SHORT).show();
                    break;
                }
                else {
                    Toast.makeText(this,"Please select a course",Toast.LENGTH_SHORT).show();
                    break;
                }

            case "BCA":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bca-1.html");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bca-2.html");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bca-3.html");
                } else if (getSemester.equals("4th")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bca-4.html");
                } else if (getSemester.equals("5th")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bca-5.html");
                } else {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bca-6.html");
                }
                break;

            case "Bsc CS":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/cs-1.html");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/cs-2.html");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/cs-3.html");
                } else if (getSemester.equals("4th")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/cs-4.html");
                } else if (getSemester.equals("5th")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/cs-5.html");
                } else {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/cs-6.html");
                }
                break;

            case "BA English":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/en-1.html");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/en-2.html");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/en-3.html");
                } else if (getSemester.equals("4th")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/en-4.html");
                } else if (getSemester.equals("5th")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/en-5.html");
                } else {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/en-6.html");
                }
                break;

            case "Bsc FT":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/ft-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/ft-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/ft-3.html");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/ft-4.html");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/ft-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-syllabus/ft-6.html");
                }
                break;

            case "Bsc IF" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/if-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/if-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/if-3.html");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/if-4.html");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/if-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-syllabus/if-6.html");
                }
                break;

            case "BBA" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bba-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bba-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bba-3.html");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bba-4.html");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bba-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bba-6.html");
                }
                break;

            case "BCom" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bcom-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bcom-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bcom-3.html");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bcom-4.html");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bcom-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bcom-6.html");
                }
                break;

            case "Bsc BT" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bio-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bio-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bio-3.html");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bio-4.html");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bio-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-syllabus/bio-6.html");
                }
                break;

            case "BA Economics" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/eco-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/eco-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/eco-3.html");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/eco-4.html");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/eco-5.html");
                }
                else{
                    linkMake("https://aquibe.github.io/e-sias-syllabus/eco-6.html");
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
        Intent i = new Intent(getApplicationContext(),UGPGSelection.class);
        startActivity(i);
    }
}
