package com.ralu.week3daily2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CelebAdapter extends RecyclerView.Adapter<CelebAdapter.ViewHolder> {
    public static final String TAG = "Adapter";
    List<Celebrity> celebrity = new ArrayList<>();
    Context context;

    public CelebAdapter(List<Celebrity> celebList){ this.celebrity = celebList;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateHolder");
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.celeb_detail_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Celebrity celeb = celebrity.get(position);
        holder.celebName.setText(celeb.getName());
        holder.celebDescription.setText(celeb.getDescription());
        holder.celebAge.setText(celeb.getAge());
        holder.celebJob.setText(celeb.getJob());
        holder.celebImage.setImageResource(celeb.getResourceId());
    }

    @Override
    public int getItemCount() {
        return celebrity.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView celebImage;
        TextView celebName, celebDescription, celebAge, celebJob;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.d(TAG, "onCreateViewHolder");
            celebImage = itemView.findViewById(R.id.celebImage);
            celebName = itemView.findViewById(R.id.celebName);
            celebAge = itemView.findViewById(R.id.celebAge);
            celebDescription = itemView.findViewById(R.id.celebDescription);
            celebJob = itemView.findViewById(R.id.celebJob);


        }
    }
}
