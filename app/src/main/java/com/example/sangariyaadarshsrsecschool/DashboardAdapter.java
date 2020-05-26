package com.example.sangariyaadarshsrsecschool;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.ViewHolder> {

    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<String> mImageName = new ArrayList<>();
    private Context mContext;

    public DashboardAdapter( Context context, ArrayList<String> image, ArrayList<String> imageName) {
        this.mImage = image;
        this.mImageName = imageName;
        this.mContext = context;
    }

    private static final String TAG = "DashboardAdapter";

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_dashboard, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(position))
                .into(holder.dashcardimage);

        holder.dashcardtext.setText(mImageName.get(position));

    }

    @Override
    public int getItemCount() {
        return mImageName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView dashcardimage;
        TextView dashcardtext;
        CardView dashcardlayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            dashcardimage = itemView.findViewById(R.id.dash_card_image);
            dashcardtext = itemView.findViewById(R.id.dash_card_text);
            dashcardlayout = itemView.findViewById(R.id.dashboard_card_layout);

        }
    }
}
