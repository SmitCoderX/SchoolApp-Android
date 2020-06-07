package com.example.sangariyaadarshsrsecschool;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class CalendarActivity extends AppCompatActivity {

    private static final String TAG = "CalendarActivity";
    CompactCalendarView compactCalendarView;
    ImageView CalendarBack;
    //vars
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Log.d(TAG, "onCreate: called");

        //ids
        compactCalendarView = findViewById(R.id.compactcalendar_view);
        final TextView MonthTextView = findViewById(R.id.MonthTextView);
        CalendarBack = findViewById(R.id.CalendarBack);

        //MonthTextView Stuff
        MonthTextView.setText("<< Swipe for Next Month >>");

        //CalendarBack Stuff
        CalendarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });

        //compactCalendarView stuff
        compactCalendarView.setFirstDayOfWeek(Calendar.MONDAY);
        compactCalendarView.setUseThreeLetterAbbreviation(true);
        compactCalendarView.setFirstDayOfWeek(Calendar.MONDAY);

        //Events
        Event ev1 = new Event(Color.RED, 1590049512000L, "Teacher's Professional Day");
        compactCalendarView.addEvent(ev1);

        Event ev2 = new Event(Color.RED, 1477990800000L, "Church Service and Flag Raising Ceremony");
        compactCalendarView.addEvent(ev2);

        Event ev3 = new Event(Color.RED, 1478077200000L, "Display of Bajan  Artefacts");
        compactCalendarView.addEvent(ev3);

        Event ev4 = new Event(Color.RED, 1478509200000L, "Reading Activities - Story Telling");
        compactCalendarView.addEvent(ev4);

        Event ev5 = new Event(Color.RED, 1478854800000L, "Healthy Lifestyle Day");
        compactCalendarView.addEvent(ev5);

        Event ev6 = new Event(Color.RED, 1479459600000L, "Games Day/Tour");
        compactCalendarView.addEvent(ev6);

        Event ev7 = new Event(Color.RED, 1479891600000L, "Independence Quiz");
        compactCalendarView.addEvent(ev7);

        Event ev8 = new Event(Color.RED, 1480064400000L, "Cultural Day");
        compactCalendarView.addEvent(ev8);

        Event ev9 = new Event(Color.RED, 1480237200000L, "P.T.A Picnic");
        compactCalendarView.addEvent(ev9);

        Event ev10 = new Event(Color.RED, 1480323600000L, "Human Chainlink");
        compactCalendarView.addEvent(ev10);

        Event ev11 = new Event(Color.RED, 1480410000000L, "Back in Time Modelling");
        compactCalendarView.addEvent(ev11);

        Event ev12 = new Event(Color.RED, 1480496400000L, "Independence");
        compactCalendarView.addEvent(ev12);

        Event ev13 = new Event(Color.BLUE, 1481792400000L, "End of Term for Students");
        compactCalendarView.addEvent(ev13);

        Event ev14 = new Event(Color.BLUE, 1481878800000L, "End of Term for Teachers");
        compactCalendarView.addEvent(ev14);

        Event ev15 = new Event(Color.GREEN, 1482638400000L, "Christmas Day");
        compactCalendarView.addEvent(ev15);

        Event ev16 = new Event(Color.GREEN, 1482724800000L, "Boxing Day");
        compactCalendarView.addEvent(ev16);

        Event ev17 = new Event(Color.GREEN, 1483243200000L, "New Years Day");
        compactCalendarView.addEvent(ev17);

        Event ev18 = new Event(Color.BLUE, 1590654312000L, "Beginning of Term for Teachers");
        compactCalendarView.addEvent(ev18);

        Event ev19 = new Event(Color.BLUE, 1484020800000L, "Beginning of Term for Students");
        compactCalendarView.addEvent(ev19);

        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {

                if (dateClicked.toString().compareTo("Fri Oct 21 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Teacher's Professional Day", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Tue Nov 01 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Church Service & Flag Raising", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Wed Nov 02 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Bajan Display of Artifacts", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Mon Nov 07 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Reading Activities - Storytelling", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Fri Nov 11 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Healthy Lifestyle Day", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Fri Nov 18 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Games Day / Tour", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Wed Nov 23 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Independence Quiz", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Fri Nov 25 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Cultural Day", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Sun Nov 27 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "P.T.A Picnic", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Tue Nov 29 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Back in Time Modelling", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Mon Nov 28 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Chain Link", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Wed Nov 30 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Independence", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Thu Dec 15 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "End of Term for Students", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Fri Dec 16 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "End of Term for Teachers", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Sun Dec 25 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Christmas Day", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Mon Dec 26 00:00:00 AST 2016") == 0) {
                    Toast.makeText(CalendarActivity.this, "Boxing Day", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Thu May 28 00:00:00 GMT+05:30 2020") == 0) {
                    Toast.makeText(CalendarActivity.this, "New Years Day", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Thu May 28 00:00:00 GMT+05:30 2020") == 0) {
                    Toast.makeText(CalendarActivity.this, "Beginning of Term for Teachers", Toast.LENGTH_SHORT).show();

                } else if (dateClicked.toString().compareTo("Tue Jan 10 2017") == 0) {
                    Toast.makeText(CalendarActivity.this, "Beginning of Term for Students", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CalendarActivity.this, "No Events Planned for that day", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                Log.d(TAG, "Month was scrolled to: " + firstDayOfNewMonth);
                MonthTextView.setText(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });

        gotoToday();
    }

    public void gotoToday() {

        // Set any date to navigate to particular date
        compactCalendarView.setCurrentDate(Calendar.getInstance(Locale.getDefault()).getTime());

    }
}