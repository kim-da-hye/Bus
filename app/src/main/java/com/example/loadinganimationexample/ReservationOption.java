package com.example.loadinganimationexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ReservationOption extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_reservation);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();







    }
}