package com.example.sangariyaadarshsrsecschool;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class DashboardFragment extends Fragment {

    private static final String TAG = "DashboardFragment";

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

        Log.d(TAG, "getdata: preaparing bitmap");
        mImage.add("https://i.imgur.com/16g4Nbu.png");
        mNames.add("Online Study");

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

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), mImage, mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2 ));
    }
}