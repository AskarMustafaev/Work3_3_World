package com.example.work3_3_world;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> worldList;
    private RecyclerView recyclerView;
    private WorldAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_world);
        loadData();
        adapter = new WorldAdapter(worldList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        worldList = new ArrayList<>();
        worldList.add("Россия");
        worldList.add("Америка");
        worldList.add("Греция");
        worldList.add("Испания");
        worldList.add("Турция");
        worldList.add("Азербайджан");
        worldList.add("Грузия");
        worldList.add("Чечня");
        worldList.add("Грозный");
        worldList.add("Кыргызстан");
        worldList.add("Китай");
        worldList.add("Япония");

    }
}