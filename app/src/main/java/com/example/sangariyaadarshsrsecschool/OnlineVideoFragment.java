package com.example.sangariyaadarshsrsecschool;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OnlineVideoFragment extends Fragment {

    RecyclerView recyclerView;
    //Declarations
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImagesNames = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_onlinevideo, container, false);

        //ids
        recyclerView = view.findViewById(R.id.onlinevideoRecyclerView);

        getdata();
        return view;
    }

    public void getdata() {
        mImages.add("https://i.imgur.com/JaNrpbd.png");
        mImagesNames.add("English");

        mImages.add("https://i.imgur.com/e8sgDmF.png");
        mImagesNames.add("Hindi");

        mImages.add("https://i.imgur.com/aUf7WZF.png");
        mImagesNames.add("Physics");

        mImages.add("https://i.imgur.com/nQ6cZSm.png");
        mImagesNames.add("Chemistry");

        mImages.add("https://i.imgur.com/tXJ8omw.png");
        mImagesNames.add("Mathematics");

        OnlineClassAdapter adapter = new OnlineClassAdapter(getActivity(), mImages, mImagesNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

}