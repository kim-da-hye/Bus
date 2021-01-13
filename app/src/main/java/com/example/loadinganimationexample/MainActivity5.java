package com.example.loadinganimationexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    private RadioButton single_list_item_check_button;
    private View.OnClickListener radioButtonClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        single_list_item_check_button=(RadioButton) findViewById(R.id.single_list_item_check_button);
        
        single_list_item_check_button.setOnClickListener(radioButtonClickListener);



        RadioButton.OnClickListener radioButtonClickListener = new RadioButton.OnClickListener(){
            @Override public void onClick(View view) {
                Toast.makeText(MainActivity5.this, "첫번째 정류장 : "+single_list_item_check_button.isChecked(), Toast.LENGTH_SHORT).show();
            } };






    }
}