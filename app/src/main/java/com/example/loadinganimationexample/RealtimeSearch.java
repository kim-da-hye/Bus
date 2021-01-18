package com.example.loadinganimationexample;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class RealtimeSearch extends AppCompatActivity{
    ListView search_listview;
    EditText bus_Filter;
    BusListViewAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_realtime);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle(" 컴소버스");
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF6495ED));
        adapter = new BusListViewAdapter();
        search_listview = (ListView) findViewById(R.id.search_listview) ;
        bus_Filter = (EditText)findViewById(R.id.bus_Filter) ;

        search_listview.setAdapter(adapter) ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_account_box_black_36dp),
                "안녕") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_account_circle_black_36dp),
                "안녕하세요") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_assignment_ind_black_36dp),
                "저는 ") ;


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



        search_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        RealtimeBus.class);


                startActivity(intent);
            }
        });


    }
}