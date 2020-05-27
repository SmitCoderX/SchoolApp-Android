package com.example.sangariyaadarshsrsecschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class OnlineStudyActivity extends AppCompatActivity {

    private static final String TAG = "OnlineStudyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_study);

        Button button = findViewById(R.id.backbutton);
    }
    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageName);
        }
    }


    private void setImage( String imageName){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView activity_heading = findViewById(R.id.activity_heading);
        activity_heading.setText(imageName);

    }
}
