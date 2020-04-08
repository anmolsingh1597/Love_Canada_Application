package com.lambton.love_canada_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.lambton.love_canada_application.fragments.BlueFragment;
import com.lambton.love_canada_application.fragments.GreenFragment;
import com.lambton.love_canada_application.fragments.RedFragment;

public class FragmentViewActivity extends AppCompatActivity {

    public String toastString;
    FragmentManager  fragManager;
    FragmentTransaction fragTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_view);

        fragmentActions();
    }

    private void fragmentActions(){

        fragManager = getSupportFragmentManager();
        //Add default at first time boot
        fragTransaction = fragManager.beginTransaction();
        fragTransaction.add(R.id.container, new RedFragment());
        fragTransaction.commit();
    }

    public void buttonClick(View view){
        Toast.makeText(FragmentViewActivity.this, toastString, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(FragmentViewActivity.this, SplashActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.main_menu,menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        fragTransaction = fragManager.beginTransaction();
        Fragment fragValue = null;

        switch (item.getItemId()){
            case R.id.redMenuItem:
                fragValue = new RedFragment();
                fragTransaction.replace(R.id.container, fragValue);
                break;
            case R.id.greenMenuItem:
                fragValue = new GreenFragment();
                fragTransaction.replace(R.id.container, fragValue);
                break;
            case R.id.blueMenuItem:
                fragValue = new BlueFragment();
                fragTransaction.replace(R.id.container, fragValue);
                break;
            case R.id.homeMenuItem:
                fragTransaction.addToBackStack(null);
                break;
        }


        fragTransaction.commit();
        return super.onOptionsItemSelected(item);
    }
}
