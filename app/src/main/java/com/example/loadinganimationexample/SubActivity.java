package com.example.loadinganimationexample;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity{
    ListView listview_t;
    Button button_t;
    EditText editTextFilter;
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle(" 컴소버스");
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF6495ED));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1) ;
        listview_t = (ListView) findViewById(R.id.listview_t) ;
        editTextFilter = (EditText)findViewById(R.id.editTextFilter) ;
        button_t=(Button)findViewById(R.id.button_t);
        listview_t.setAdapter(adapter) ;
        adapter.add("100") ;
        adapter.add("201") ;
        adapter.add("302") ;
        adapter.add("403") ;
        adapter.add("504") ;
        adapter.add("605") ;
        adapter.add("707") ;
        adapter.add("808") ;
        adapter.add("909") ;
        adapter.add("1110") ;


        editTextFilter.addTextChangedListener(new TextWatcher() {



            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                if (filterText.length() > 0) {
                    listview_t.setFilterText(filterText) ;
                } else {
                    listview_t.clearTextFilter() ;
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        }) ;



        button_t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });


    }
}