package com.example.aulareciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapters.ItemAdapter;
import data.ItemModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ItemAdapter adapter;
    List<ItemModel> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize list of items with sample data
        itemList = new ArrayList<>();
        itemList.add(new ItemModel("Item 1", "Descrição 1"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));
        itemList.add(new ItemModel("Item 3", "Descrição 3"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));
        itemList.add(new ItemModel("Item 1", "Descrição 1"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));
        itemList.add(new ItemModel("Item 1", "Descrição 1"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));
        itemList.add(new ItemModel("Item 1", "Descrição 1"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));
        itemList.add(new ItemModel("Item 1", "Descrição 1"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));
        itemList.add(new ItemModel("Item 1", "Descrição 1"));
        itemList.add(new ItemModel("Item 2", "Descrição 2"));

        Log.i("Teste", "count" + itemList.size());

        // Initialize the adapter and connect it to the RecyclerView
        adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}