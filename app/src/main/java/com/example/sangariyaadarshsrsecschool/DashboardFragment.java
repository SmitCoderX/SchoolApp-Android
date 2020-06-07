package com.example.sangariyaadarshsrsecschool;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class DashboardFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "DashboardFragment";
    CardView DashOnlineClass, DashDailyWork, DashStudentEssential, DashCalendar, DashResult, DashGallery;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        DashOnlineClass = view.findViewById(R.id.DashOnlineClass);
        DashDailyWork = view.findViewById(R.id.DashDailyWork);
        DashStudentEssential = view.findViewById(R.id.DashStudentEssential);
        DashCalendar = view.findViewById(R.id.DashCalendar);
        DashResult = view.findViewById(R.id.DashResult);
        DashGallery = view.findViewById(R.id.DashGallery);

        DashOnlineClass.setOnClickListener(this);
        DashDailyWork.setOnClickListener(this);
        DashStudentEssential.setOnClickListener(this);
        DashCalendar.setOnClickListener(this);
        DashResult.setOnClickListener(this);
        DashGallery.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.DashOnlineClass:
                Intent intent = new Intent(v.getContext(), OnlineStudyActivity.class);
                startActivity(intent);
                break;
            case R.id.DashDailyWork:
                Intent intent1 = new Intent(v.getContext(), DailyWorkActivity.class);
                startActivity(intent1);
                break;
            case R.id.DashStudentEssential:
                Intent intent2 = new Intent(v.getContext(), StudentEssentialActivity.class);
                startActivity(intent2);
                break;
            case R.id.DashCalendar:
                Intent intent3 = new Intent(v.getContext(), CalendarActivity.class);
                startActivity(intent3);
                break;
            case R.id.DashResult:
                Intent intent4 = new Intent(v.getContext(), ResultActivity.class);
                startActivity(intent4);
                break;
            case R.id.DashGallery:
                Intent intent5 = new Intent(v.getContext(), GalleryActivity.class);
                startActivity(intent5);
            default:
        }
    }
}