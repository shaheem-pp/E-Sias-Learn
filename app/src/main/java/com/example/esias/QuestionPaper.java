package com.example.esias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class QuestionPaper extends AppCompatActivity {

    String[] course = {"Select Course", "Bsc MB", "Bsc FT", "Bsc BT", "Bsc CS", "BCA", "BA IF","BA Economics", "BA English", "BBA", "BCom"};
    String[] semester = {"Select Semester", "1st", "2nd", "3rd", "4th", "5th", "6th"};
    String getCourse, getSemester;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper);

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
        final Spinner spin = (Spinner) findViewById(R.id.qpspinner);
        spin.setAdapter(aa);

        ArrayAdapter aa3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semester);
        aa3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spin3 = (Spinner) findViewById(R.id.qpspinner3);
        spin3.setAdapter(aa3);

        Button submitBtn = (Button) findViewById(R.id.qpsubmit);
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
                    linkMake("https://drive.google.com/folderview?id=1WQfqr4i4UCj-79WMhOQt5L-ubBkNEdYo");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=1-ndJoNAQwpy3_lwRlaOfwEdhkQ8D57iL");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=1-oO-uVnn8dfIJ8CbifPCOuJl2qgc9iju");
                } else if (getSemester.equals("4th")) {
                    linkMake("https://drive.google.com/folderview?id=1-ot0uA6if7Jt0HORinUz3CNZPzrXMDfj");
                } else if (getSemester.equals("5th")) {
                    linkMake("https://drive.google.com/folderview?id=1-s6WA_r7qrkhBwbpQmJEV_nBcJFCEVpm");
                } else {
                    linkMake("https://drive.google.com/folderview?id=1-ueiY_yx8SsdHxzaOzQkX_jg5SD8qhIF");
                }
                break;

            case "Bsc CS":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=11ROhJxPItd5yYiYXAK0x6dMt283fP_4o");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=11STnFWepyESsjq5MxEadi8i5jTy888gR\n");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=11Z_9pqLY74GO209XdPP39jpShjggIACF");
                } else if (getSemester.equals("4th")) {
                    linkMake("https://drive.google.com/folderview?id=11aJh7Z6MjT85Y-gTCXhc0XfP85rH9QSA");
                } else if (getSemester.equals("5th")) {
                    linkMake("https://drive.google.com/folderview?id=11b8bsP2aM0PNJ9VZOCq1jMdrO2fqSAYX\n");
                } else {
                    linkMake("https://drive.google.com/folderview?id=11dO5ofI4GUYP5mr3EPKyvHlpra-d6trX");
                }
                break;

            case "BA English":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=14wsynFBG52o3-Ig1gn7Hq1yf5eD4PQj-");
                } else if (getSemester.equals("2nd")) {
                    linkMake("https://drive.google.com/folderview?id=14xDgHmChUO0FE9a94nGm2_pq7ysjnv4z");
                } else if (getSemester.equals("3rd")) {
                    linkMake("https://drive.google.com/folderview?id=14xUuKIS7TstsgKAKi7zT3pkzvCSiGXu4  ");
                } else if (getSemester.equals("4th")) {
                    linkMake("https://drive.google.com/folderview?id=14xeXFQT1vHSTqp284ZBKPihk5GuHvMZ0");
                } else if (getSemester.equals("5th")) {
                    linkMake("https://drive.google.com/folderview?id=14yyrf_o8jh64JvbIFyadjE7sFSQ-Mwsn");
                } else {
                    linkMake("https://drive.google.com/folderview?id=155SDIKzecmmxHSid4dUOaKFivA0QSfdp");
                }
                break;

            case "Bsc FT":
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=14KblTOsQp80QABbz15Hw2RJr5yYkyAbf");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://drive.google.com/folderview?id=14P6Cvg-6QAqBffYCvawVPY4Iq5rZKcVB");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://drive.google.com/folderview?id=14TMKFGMbMjjcughebrTgqM74qc4Y5Pz7");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://drive.google.com/folderview?id=14V1g4w1pIBmwr0d1ifd_V4uuQ5pUks3M");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://drive.google.com/folderview?id=14eVXPWcr-Vjh1W6Tml8no5Vbwaa49HVA");
                }
                else{
                    linkMake("https://drive.google.com/folderview?id=14oJzQ1wcuMlyJk9FNeFQ5Eo76RTEegB1");
                }
                break;

            case "Bsc IF" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=13NozbniMzeF9LGCP-6K3VZCwIHw1aUt5");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://drive.google.com/folderview?id=13ZelwAjZ5AclFroGFZLkn2bcb-xqT_1j");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://drive.google.com/folderview?id=13beL-6Pnz4hVzz0jJc4nLN16qs_8sGnf");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://drive.google.com/folderview?id=13nuE_D85gwwZpy8QLIaVtkNX1qkehmf3");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://drive.google.com/folderview?id=13pPpjzKdENGGaQ-eWa52PwGNZsSIq09");
                }
                else{
                    linkMake("https://drive.google.com/folderview?id=13pYbS4wW7iOAri3_sMPD3ifXwGanaPhR");
                }
                break;

            case "BBA" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=11i1eUohnV4UUl_p35xBKJHQcOz5KtqeP");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://drive.google.com/folderview?id=11j834kYwWqzae0QGV7GHFqYYjkHkarVQ");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://drive.google.com/folderview?id=11nVNFGr32DezzZ_Y6zAUBlfTOVxwLJz-");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://drive.google.com/folderview?id=11nfKoHV6z1UrA0b2C6ASxk26ALpBcP_O");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://drive.google.com/folderview?id=11nnVvdNYpNIEqgsl9N5VeFrhVA-ULlB1");
                }
                else{
                    linkMake("https://drive.google.com/folderview?id=11tZrvbuPmBR9ZDFVoa9cxKdVY0Cl-HvB");
                }
                break;

            case "BCom" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=12-0-GhBKdR34RQ2LvehEu6cxYtb1ehE");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://drive.google.com/folderview?id=122aVCPGf9AkZ6e-PeR_C-69xNYET8_wW");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://drive.google.com/folderview?id=12DroyD0dpfrSZZlBQqyJXI7qwrz3cgEF");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://drive.google.com/folderview?id=12EN-HHiNrvcBc4j9y2AyHvjCBxYOAs0c");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://drive.google.com/folderview?id=12Mh8HuoxltYZMeGBL6WuXp-oFs_zFsyv");
                }
                else{
                    linkMake("https://drive.google.com/folderview?id=12REHlZnFIls9u5fiDldnb0IRrp8yRIz7");
                }
                break;

            case "Bsc BT" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=12wWzKdEknGumLWTaBKAHuB_36eyOhXdW");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://drive.google.com/folderview?id=12zFqwTxMGlvfbKlcI90h1fVl2I9VeNvE");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://drive.google.com/folderview?id=138BjtS09sRQzn3K9kDxw4YmhpbNYMVjC");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://drive.google.com/folderview?id=13D0T1AxigYW-SRZpOlwroPhzRxvVQuCV");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://drive.google.com/folderview?id=13ELvS0Ka-FVLJ6wdjUIr6qSLs1f276_g");
                }
                else{
                    linkMake("https://drive.google.com/folderview?id=13FEokl2K7GHZ8TEvTp7KPNPBBIIKY7pD");
                }
                break;

            case "BA Economics" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=140ezfZnFmlUEpoamuxwgKo06Affbo13N");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://drive.google.com/folderview?id=143HemUDxuTwEL5Vo9r53VLbqB0jWzsWx");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://drive.google.com/folderview?id=148-ikba7xgbZpMspXPJfFeE6Ne5XVXyY");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://drive.google.com/folderview?id=149zLssdKqmkdvNHk361qOjIT6x2_T22C");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://drive.google.com/folderview?id=14AevnNNxwpne54yGb0OCpFQAJSk0L8Gh");
                }
                else{
                    linkMake("https://drive.google.com/folderview?id=14B71jNhMYvLlWUfXjVjv01NXSvh4_841");
                }
                break;

            case "Bsc MB" :
                if (getSemester.equals("Select Semester")) {
                    Toast.makeText(this, "Please select a semester", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (getSemester.equals("1st")) {
                    linkMake("https://drive.google.com/folderview?id=12aNZm7WlGDNZe5bAUt3oSoQdISODpI8j");
                }
                else if(getSemester.equals("2nd")){
                    linkMake("https://drive.google.com/folderview?id=12e5WqArAN840TaLCAQrHsXhQnWlTzupN");
                }
                else if(getSemester.equals("3rd")){
                    linkMake("https://drive.google.com/folderview?id=12hCmVPEK_vtvYOdUqna16peK7IuEL37b");
                }
                else if(getSemester.equals("4th")){
                    linkMake("https://drive.google.com/folderview?id=12mFvZ-vqgx9LXqhfQs5XiUmOfRbnOhum");
                }
                else if(getSemester.equals("5th")){
                    linkMake("https://drive.google.com/folderview?id=12ntTsrc-9j2FoO5O5ObvBGOSDzKUPWGg");
                }
                else{
                    linkMake("https://drive.google.com/folderview?id=12o34RrQWn6r33GsmPMkbzd9qJ1L8jfnh");
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
        Intent i = new Intent(getApplicationContext(),UGPGQPSelection.class);
        startActivity(i);
    }
}
