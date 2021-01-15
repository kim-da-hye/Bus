package com.example.loadinganimationexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuitCancel extends AppCompatActivity {
    private Button btn_realtime_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cancel_quit);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        btn_realtime_stop= findViewById(R.id.btn_realtime_stop);
        btn_realtime_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuitCancel.this, BusQuit.class);
                startActivity(intent);
            }
        });
    }
}