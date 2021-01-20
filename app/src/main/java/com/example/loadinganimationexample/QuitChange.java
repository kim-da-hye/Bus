package com.example.loadinganimationexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuitChange extends AppCompatActivity {
    private Button btn_realtime_stop;
    private Button btn_reservation_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_quit);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        btn_realtime_stop= findViewById(R.id.btn_realtime_stop);
        btn_reservation_change= findViewById(R.id.btn_reservation_change);
        btn_realtime_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuitChange.this, BusQuit.class);
                startActivity(intent);
            }
        });
        btn_reservation_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(QuitChange.this, ReservationOption.class);
                startActivity(intent);
            }
        });

    }
}