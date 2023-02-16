package com.example.work3_3_world;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WorldAdapter extends RecyclerView.Adapter <WorldViewHolder> {

    private ArrayList<String> worldList;

    public WorldAdapter(ArrayList<String> worldList) {
        this.worldList = worldList;
    }

    @NonNull
    @Override
    public WorldViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WorldViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_world, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WorldViewHolder holder, int position) {

        holder.bind(worldList.get(position));

    }

    @Override
    public int getItemCount() {
        return worldList.size();
    }
}
