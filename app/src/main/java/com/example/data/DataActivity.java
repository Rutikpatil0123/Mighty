package com.example.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.data.Adpters.ItemListAdapter;

public class DataActivity extends AppCompatActivity {
    private ItemListAdapter itemListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        RecyclerView recyclerView = findViewById(R.id.recycler_Home);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemListAdapter = new ItemListAdapter(this);
        recyclerView.setAdapter(itemListAdapter);

    }
}