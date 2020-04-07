package com.lambton.love_canada_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FragmentViewActivity extends AppCompatActivity {

    public String toastString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_view);
    }

    public void buttonClick(View view){
        Toast.makeText(FragmentViewActivity.this, toastString, Toast.LENGTH_SHORT).show();
    }
}
