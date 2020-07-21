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

public class SyllabusPG extends AppCompatActivity {

    String[] course = {"Select Course", "Msc MB", "Msc FT", "Msc BT", "MA IF", "MCom", "MCJ"};
    String[] semester = {"Select Semester", "1st", "2nd", "3rd", "4th"};
    String getCourse, getSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_p_g);

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
        final Spinner spin = (Spinner) findViewById(R.id.spinnerpg);
        spin.setAdapter(aa);

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semester);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin3 = (Spinner) findViewById(R.id.spinner3pg);
        spin3.setAdapter(aa3);

        Button submitBtn = (Button) findViewById(R.id.syllSubmitpg);
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

            case "MCJ" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
            else if (getSemester.equals("1st")) {
                linkMake("https://aquibe.github.io/e-sias-syllabus/mcj-1.html");
            }
            else if(getSemester.equals("2nd")){
                linkMake("https://aquibe.github.io/e-sias-syllabus/mcj-2.html");
            }
            else if(getSemester.equals("3rd")){
                linkMake("https://aquibe.github.io/e-sias-syllabus/mcj-3.html");
            }
            else {
                linkMake("https://aquibe.github.io/e-sias-syllabus/mcj-4.html");
            }
            break;

            case "Msc MB" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mmb-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mmb-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mmb-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mmb-4.html");
                }
                break;

            case "Msc BT" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mbt-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mbt-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mbt-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mbt-4.html");
                }
                break;

            case "MA IF" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mif-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mif-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mif-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mif-4.html");
                }
                break;

            case "Msc FT" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mft-1.html");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mft-2.html");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mft-3.html");
                }
                else {
                    linkMake("https://aquibe.github.io/e-sias-syllabus/mft-4.html");
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
        finish();
    }
}
