package com.lambton.love_canada_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lambton.love_canada_application.adapters.CanadaAttractionAdapter;
import com.lambton.love_canada_application.models.CanadaAttraction;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {

    private RecyclerView canadaAttractionListView;
    private ArrayList<CanadaAttraction> attractionList;
    private CanadaAttractionAdapter canadaAttractionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);
        intials();
    }
    public void intials(){
        getSupportActionBar().hide();

        canadaAttractionListView = findViewById(R.id.rvAttractionList);
        populateAttractions();
        canadaAttractionAdapter = new CanadaAttractionAdapter(attractionList);
        RecyclerView.LayoutManager thisLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        canadaAttractionListView.setLayoutManager(thisLayoutManager);
        canadaAttractionListView.setAdapter(canadaAttractionAdapter);
    }

    public void populateAttractions(){
        attractionList = new ArrayList<>();
        attractionList.add(new CanadaAttraction( 1, "CN Tower", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Tobermory", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Quebec", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Phillip Square", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Tobermory", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Tobermory", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Tobermory", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Tobermory", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));
        attractionList.add(new CanadaAttraction( 1, "Tobermory", "String address", "String city", "String province", "String description", R.drawable.ic_launcher_foreground));

    }
}
