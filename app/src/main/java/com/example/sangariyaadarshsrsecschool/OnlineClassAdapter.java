package com.example.sangariyaadarshsrsecschool;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class OnlineClassAdapter extends RecyclerView.Adapter<OnlineClassAdapter.ViewHolder> {

    //declaration
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImagesNames = new ArrayList<>();
    Context mContext;

    public OnlineClassAdapter( Context mContext, ArrayList<String> mImages, ArrayList<String> mImagesNames) {
        this.mImages = mImages;
        this.mImagesNames = mImagesNames;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_onlineclasssubjects,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.imageView);

        holder.textView.setText(mImagesNames.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mImagesNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImagesNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        //Declaration
        ImageView imageView;
        TextView textView;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //ids
            imageView = itemView.findViewById(R.id.subjectImage);
            textView = itemView.findViewById(R.id.subjectText);
            cardView = itemView.findViewById(R.id.subjectCardView);
        }
    }
}
