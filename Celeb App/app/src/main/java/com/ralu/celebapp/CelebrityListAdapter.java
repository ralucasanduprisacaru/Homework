package com.ralu.celebapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CelebrityListAdapter extends RecyclerView.Adapter<CelebrityListAdapter.ViewHolder> {
    private static final String TAG = "CelebrityListAdapter";

    private static List<Celebrity> celebrityList = new ArrayList<>();


    public CelebrityListAdapter(List<Celebrity> celebrityList){this.celebrityList = celebrityList;}


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.celeb_list_item, null);
        Log.d(TAG, "onCreateHolder");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Celebrity celeb = celebrityList.get(i);
        viewHolder.tvcelebName.setText(celeb.getName());
        viewHolder.tvcelebDescription.setText(celeb.getDescription());
        viewHolder.tvcelebAge.setText(celeb.getAge());
        viewHolder.tvcelebJob.setText(celeb.getJob());
        viewHolder.llcelebImage.setImageResource(celeb.getResourceId());
        Log.d(TAG, "onBind");

        final CardView cardView = viewHolder.cardView;





    }

    public void goToNextActivity(){
        
    }

    @Override
    public int getItemCount() {
        return celebrityList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        ImageView llcelebImage;
        TextView tvcelebName, tvcelebDescription, tvcelebAge, tvcelebJob;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.d(TAG, "onCreateViewHolder");
            cardView = itemView.findViewById(R.id.cardList);
            llcelebImage = itemView.findViewById(R.id.llcelebImage);
            tvcelebName = itemView.findViewById(R.id.tvcelebName);
            tvcelebDescription = itemView.findViewById(R.id.tvcelebDescription);
            tvcelebAge = itemView.findViewById(R.id.tvcelebAge);
            tvcelebJob = itemView.findViewById(R.id.tvcelebJob);
        }
    }
}
