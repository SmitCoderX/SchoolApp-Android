package com.example.sangariyaadarshsrsecschool;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class FragmentDashboard extends Fragment {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImage = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        getdata();
        return view;

    }
    private void getdata()
    {
        mImage.add("https://i.imgur.com/16g4Nbu.png");
        mNames.add("Online Class");

        mImage.add("https://i.imgur.com/lxmkxJG.png");
        mNames.add("Daily Work");

        mImage.add("https://i.imgur.com/WYmr7hu.png");
        mNames.add("Student Essentials");

        mImage.add("https://i.imgur.com/sgUVtlO.png");
        mNames.add("Calendar");

        mImage.add("https://i.imgur.com/QJd1tK4.png");
        mNames.add("Result");

        mImage.add("https://i.imgur.com/OgS8Zk7.png");
        mNames.add("Gallery");

        DashboardAdapter adapter = new DashboardAdapter(getActivity(), mImage, mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2  ));
    }
      }
