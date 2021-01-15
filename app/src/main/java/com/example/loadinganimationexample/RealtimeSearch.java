package com.example.loadinganimationexample;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class RealtimeSearch extends AppCompatActivity{
    ListView search_listview;
    Button btn_realtime_button;
    EditText bus_Filter;
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_realtime);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle(" 컴소버스");
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF6495ED));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1) ;
        search_listview = (ListView) findViewById(R.id.search_listview) ;
        bus_Filter = (EditText)findViewById(R.id.bus_Filter) ;
        btn_realtime_button=(Button)findViewById(R.id.btn_realtime_button);
        search_listview.setAdapter(adapter) ;
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


        bus_Filter.addTextChangedListener(new TextWatcher() {



            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                if (filterText.length() > 0) {
                    search_listview.setFilterText(filterText) ;
                } else {
                    search_listview.clearTextFilter() ;
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        }) ;



        btn_realtime_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RealtimeSearch.this, RealtimeBus.class);
                startActivity(intent);
            }
        });


    }
}