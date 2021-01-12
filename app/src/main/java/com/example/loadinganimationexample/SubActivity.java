package com.example.loadinganimationexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle(" 컴소버스");
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF6495ED));

        et_id = findViewById(R.id.et_id);
        btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}