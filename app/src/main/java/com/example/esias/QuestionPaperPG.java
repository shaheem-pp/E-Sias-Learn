package com.example.esias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionPaperPG extends AppCompatActivity {

    String[] course = {"Select Course", "Msc MB", "Msc FT", "Msc BT", "MA IF", "MCom", "MCJ"};
    String[] semester = {"Select Semester", "1st", "2nd", "3rd", "4th"};
    String getCourse, getSemester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper_p_g);

        ImageView iv = (ImageView) findViewById(R.id.drawer_icon);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), UGPGQPSelection.class);
                startActivity(k);
            }
        });

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, course);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin = (Spinner) findViewById(R.id.qpspinnerpg);
        spin.setAdapter(aa);

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semester);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin3 = (Spinner) findViewById(R.id.qpspinner3pg);
        spin3.setAdapter(aa3);

        Button submitBtn = (Button) findViewById(R.id.qpsubmitpg);
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

            case "Select Course":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a course and semester", Toast.LENGTH_SHORT).show();
                    break;
                } else {
                    Toast.makeText(this, "Please select a course", Toast.LENGTH_SHORT).show();
                    break;
                }

            case "MCJ":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                } else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=16mBG8F02_U6UvSfE2N0iDQbMx68ZFf76");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=16mDGYoTa9cElURCXu4K6xHw5c9Hl_DS4");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=16q-41-gyDl_eLHoG_RO0bndM_EkkWgFZ");
                } else {
                    linkMake("https://drive.google.com/folderview?id=16tw9O8AQAmXOtKP8ooL8Si05LWkWrk7T");
                }
                break;

            case "Msc MB":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                } else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=15kpqRvIn_I7AMR6a9MMJPfT3EXqGDgo2");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=15nSyn-KbsjyXIvzwshMzHxF6gS5lCMvM");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=15uzy5GqiCgam5OEOF32TlW_0ccbpPCfY");
                } else {
                    linkMake("https://drive.google.com/folderview?id=160F37CZkeUFqo-_2uVDS-c-XW_F9uwn1");
                }
                break;

            case "Msc BT":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                } else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=163dX0J_mXykR5jDZMmnctz7Vm5BKsM_i");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=165f5Y_vxrr_4KnVyWSNa6a4xLRXpwgY7");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=167DS7CVRTB6Q8f9xDCCYB5Cubdml88m5");
                } else {
                    linkMake("https://drive.google.com/folderview?id=168T_cz0POBCulE07W5HmW31jyZy81wa3");
                }
                break;

            case "MA IF":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                } else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=15_0JcFYiW5ILEQGgNaBGIWhS4HgXdIyi");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=15bFpaQcJYSpMY5e2qlmXPF6RWY3Xjjlc");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=15cfenuC7KpcF283xYK5Nbe-9wlbHbiF6");
                } else {
                    linkMake("https://drive.google.com/folderview?id=15fjHijWYI-fhgdLl3Gk1PiHoA69fVJod");
                }
                break;

            case "Msc FT":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                } else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=15LkfCPfZOTfIG6wQo-IJW6jWPSVhapRH");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=15Lz0dfmYzpCKmfossjxu8FjvXm3WBkGN");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=15O-eYtVv3pwIVXsv9jitsOqKF6-bikvs");
                } else {
                    linkMake("https://drive.google.com/folderview?id=15OXadZmYb2VvTaB7AHQMsfF_Vo_6LYy2");
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
        Intent i = new Intent(getApplicationContext(), UGPGQPSelection.class);
        startActivity(i);
        finish();
    }
}
