package com.example.loadinganimationexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    private RadioButton single_list_item_check_button,second_single_list_item_check_button
            ,forth_single_list_item_check_button, third_single_list_item_check_button,fifth_single_list_item_check_button,
            sixth_single_list_item_check_button,seventh_single_list_item_check_button,eighth_single_list_item_check_button,
            ninth_single_list_item_check_button,tenth_single_list_item_check_button, twelvth_single_list_item_check_button,
            eleventh_single_list_item_check_button,thirdteenth_single_list_item_check_button;
    private RadioGroup radioGroup;
    private String str_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        radioGroup=findViewById(R.id.radioGroup);
        single_list_item_check_button=findViewById(R.id.single_list_item_check_button);
        second_single_list_item_check_button=findViewById(R.id.second_single_list_item_check_button);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i == R.id.single_list_item_check_button){
                    Toast.makeText(MainActivity5.this,"1정거장",Toast.LENGTH_SHORT).show();
                } else if (i == R.id.single_list_item_check_button){
                    Toast.makeText(MainActivity5.this,"2정거장",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}