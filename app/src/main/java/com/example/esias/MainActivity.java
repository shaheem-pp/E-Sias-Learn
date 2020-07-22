package com.example.esias;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private int[] image = {R.drawable.slideone, R.drawable.slidetwo, R.drawable.slidethree, R.drawable.slidefour, R.drawable.slidefive};
    private ViewPager viewPager;
    private ImageSliderAdapter imageSliderAdapter;
    private Timer timer;
    private int currentPosition;
    private LinearLayout dotsLayout;
    private int customPostion = 0;

    private long backPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        imageSliderAdapter = new ImageSliderAdapter(image, this);
        viewPager.setAdapter(imageSliderAdapter);
        dotsLayout = (LinearLayout) findViewById(R.id.dotslayout);
        prepareDots(customPostion++);
        createSlideShow();
        buttonActionsurl();


        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (customPostion > 4)
                    customPostion = 0;
                prepareDots(customPostion++);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void createSlideShow() {
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (currentPosition == Integer.MAX_VALUE)
                    currentPosition = 0;
                viewPager.setCurrentItem(currentPosition++, true);
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
                           @Override
                           public void run() {
                               handler.post(runnable);
                           }
                       }
                , 3000, 3000

        );
    }

    private void prepareDots(int currentSlidePosition) {
        if (dotsLayout.getChildCount() > 0)
            dotsLayout.removeAllViews();
        ImageView[] dots = new ImageView[10];

        for (int i = 0; i < 5; i++) {
            dots[i] = new ImageView(this);
            if (i == currentSlidePosition)
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dotactive));
            else
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dotinactive));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(4, 0, 4, 0);
            dotsLayout.addView(dots[i], layoutParams);
        }

    }

    private void buttonActionsurl() {
        final CardView siasclassroom = (CardView) findViewById(R.id.siasclassroom);
        CardView magazine = (CardView) findViewById(R.id.magazine);
        CardView notification = (CardView) findViewById(R.id.notification);
        CardView syllabus = (CardView) findViewById(R.id.syllabus);
        CardView question_paper = (CardView) findViewById(R.id.question_papers);
        CardView siaspublications = (CardView) findViewById(R.id.siaspublications);
        CardView collegewebsite = (CardView) findViewById(R.id.college_website);
        CardView collegetimetable = (CardView) findViewById(R.id.college_time_table);
        CardView ourteam = (CardView) findViewById(R.id.ourteam);


        siasclassroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(getApplicationContext(), OnlineClass.class);
                startActivity(l);
                
            }
        });

        magazine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkMake("https://aquibe.github.io/e-sias-magazine/index.html");

            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WebViewOne.class).putExtra("urltoload", "https://aquibe.github.io/e-sias-notification/"));
            }
        });

        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, WebViewOne.class).putExtra("urltoload", "https://aquibe.github.io/e-sias-syllabus/bca-2.html"));
                Intent j = new Intent(getApplicationContext(), UGPGSelection.class);
                startActivity(j);
                
            }
        });

        question_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), UGPGQPSelection.class);
                startActivity(k);
                
            }
        });

        siaspublications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkMake("https://aquibe.github.io/e-sias-publications/");
            }
        });

        collegewebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WebViewOne.class).putExtra("urltoload", "https://www.siasindia.org/"));
            }
        });

        collegetimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), UGPGTTSelection.class);
                startActivity(k);
                
            }
        });

        ourteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WebViewOne.class).putExtra("urltoload", "https://aquibe.github.io/e-sias-developers/"));
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    public void linkMake(String url) {
        Intent j = new Intent(getApplicationContext(), WebViewOne.class);
        j.putExtra("urltoload", url);
        j.putExtra("teacherPage", true);
        startActivity(j);
    }
}

