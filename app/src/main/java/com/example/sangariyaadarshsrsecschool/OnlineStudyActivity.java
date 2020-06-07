package com.example.sangariyaadarshsrsecschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class OnlineStudyActivity extends AppCompatActivity {

    private static final String TAG = "OnlineStudyActivity";

    //vars
    private ImageView CalendarBack;
    private androidx.appcompat.widget.Toolbar toolbar;
    private TabLayout tabLayout;
    private  ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_study);

        Log.d(TAG, "onCreate: called");
        //Id's
        CalendarBack = findViewById(R.id.CalendarBack);
        toolbar = findViewById(R.id.toolbarOnlineStudy);
        tabLayout = findViewById(R.id.TabLayoutOnlineStudy);
        viewPager = findViewById(R.id.ViewPagerOnlineStudy);

        //Toolbar stuff
        setSupportActionBar(toolbar);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        //On Click Listener
        CalendarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });
    }

    private void setupViewPager(ViewPager viewPager)
    {
        OnlineStudyPagerAdapter adapter = new OnlineStudyPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OnlineBooksFragment(),"BOOKS");
        adapter.addFragment(new NotesFragment(), "NOTES");
        adapter.addFragment(new OnlineVideoFragment(),"VIDEOS");
        viewPager.setAdapter(adapter);
    }
}
