package com.lambton.love_canada_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lambton.love_canada_application.models.CanadaAttraction;

public class AttractionDetailsActivity extends AppCompatActivity {

    Bundle fetchedUser;
    CanadaAttraction object;
    private ImageView attractionImage;
    private TextView id;;
    private TextView name;
    private TextView address;
    private TextView city;
    private TextView province;
    private TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);
        intials();
    }
    public void intials(){
        getSupportActionBar().hide();
        Intent intent = getIntent();
        fetchedUser = intent.getBundleExtra("object");
        object = (CanadaAttraction) fetchedUser.getSerializable("detailsObject");
        attractionImage = findViewById(R.id.detailsImageView);
        id = findViewById(R.id.idDetailsText);
        name = findViewById(R.id.nameDetailsText);
        address = findViewById(R.id.addressDetailsText);
        city = findViewById(R.id.cityDetailsText);
        province = findViewById(R.id.provinceDetailsText);
        description = findViewById(R.id.descriptionDetailsText);
        attractionImage.setImageResource(object.getImage());
        id.setText("Id: " + String.valueOf(object.getPlaceId()));
        name.setText("Name: " + object.getPlaceName());
        address.setText("Address: " + object.getAddress());
        city.setText("City: " + object.getCity());
        province.setText("Province: " + object.getProvince());
        description.setText("Description: " + object.getDescription());
//        Toast.makeText(AttractionDetailsActivity.this, object.getPlaceName(), Toast.LENGTH_SHORT).show();

    }
}
