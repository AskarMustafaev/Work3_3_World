package com.example.work3_3_world;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WorldViewHolder extends RecyclerView.ViewHolder {

    private TextView tvWorld;

    public WorldViewHolder(@NonNull View itemView) {
        super(itemView);
        tvWorld = itemView.findViewById(R.id.tv_word);
    }

    void bind(String world){
        tvWorld.setText(world);


    }
}
