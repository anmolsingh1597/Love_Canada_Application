package com.lambton.love_canada_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.lambton.love_canada_application.models.CanadaAttraction;

public class AttractionDetailsActivity extends AppCompatActivity {

    Bundle fetchedUser;
    CanadaAttraction object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);
        intials();
    }
    public void intials(){
        Intent intent = getIntent();
        fetchedUser = intent.getBundleExtra("object");
        object = (CanadaAttraction) fetchedUser.getSerializable("detailsObject");
        Toast.makeText(AttractionDetailsActivity.this, object.getPlaceName(), Toast.LENGTH_SHORT).show();
    }
}
