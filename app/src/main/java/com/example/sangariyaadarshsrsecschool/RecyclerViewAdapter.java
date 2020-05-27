package com.example.sangariyaadarshsrsecschool;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImagesName = new ArrayList<>();
    private Context mContext;

    private static final String TAG = "RecyclerViewAdapter";

    public RecyclerViewAdapter( Context mContext, ArrayList<String> mImages, ArrayList<String> mImagesName) {
        this.mImages = mImages;
        this.mImagesName = mImagesName;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_dashboard, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.dashboardImage);

        holder.dashboardText.setText(mImagesName.get(position));

        holder.dashcardlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mImagesName.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, OnlineStudyActivity.class);
                intent.putExtra("image_name", mImagesName.get(position));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImagesName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView dashboardImage;
        TextView dashboardText;
        CardView dashcardlayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            dashboardImage = itemView.findViewById(R.id.dash_card_image);
            dashboardText = itemView.findViewById(R.id.dash_card_text);
            dashcardlayout = itemView.findViewById(R.id.dashboard_card_layout);

        }
    }
}
