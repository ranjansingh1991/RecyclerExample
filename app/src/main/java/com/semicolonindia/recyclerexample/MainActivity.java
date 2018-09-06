package com.semicolonindia.recyclerexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    MainPagerViewAdapter adapter;

    RecyclerView recyclerView;
    ExampleAdapter exampleAdapter;
    GridLayoutManager gridLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ViewPager Initalizing
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new MainPagerViewAdapter(getApplicationContext());
        viewPager.setAdapter(adapter);
        //
        List<ItemObject> listItem = getAllItems();
        // Set your Grid Layout
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        // RecyclerView
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        // size argesment
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);

        exampleAdapter = new ExampleAdapter(getApplicationContext(), listItem);
        recyclerView.setAdapter(exampleAdapter);
    }

    private List<ItemObject> getAllItems(){
        List<ItemObject> list = new ArrayList<>();
        list.add(new ItemObject(R.drawable.sample_0, "First"));
        list.add(new ItemObject(R.drawable.sample_1, "Second"));
        list.add(new ItemObject(R.drawable.sample_2, "Third"));
        list.add(new ItemObject(R.drawable.sample_3, "Fourth"));
        list.add(new ItemObject(R.drawable.sample_4, "Fifth"));
        list.add(new ItemObject(R.drawable.sample_5, "Sixth"));
        list.add(new ItemObject(R.drawable.sample_6, "Seventh"));
        list.add(new ItemObject(R.drawable.sample_0, "Eighth"));

        return list;
    }
}
