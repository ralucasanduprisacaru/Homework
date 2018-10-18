package com.ralu.zooapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AnimalListAdapter extends RecyclerView.Adapter<AnimalListAdapter.ViewHolder> {

    private static final String TAG = "Adapter";
    List<Animal> animalList = new ArrayList<>();
    Context context;

    public AnimalListAdapter (List<Animal> animalList){
        this.animalList = animalList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.animal_list_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.animalName.setText(animal.getName());
        holder.animalDescription.setText(animal.getDescription());
        holder.animalWeight.setText(animal.getWeight());
        holder.animalImage.setImageResource(animal.getResourceId());



    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView animalName, animalDescription, animalWeight;
        ImageView animalImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animalImage = itemView.findViewById(R.id.animalImage);
            animalName = itemView.findViewById(R.id.animalName);
            animalDescription = itemView.findViewById(R.id.animalDescription);
            animalWeight =  itemView.findViewById(R.id.animalWeight);
        }
    }
}
