package com.example.loadinganimationexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class BusQuit extends AppCompatActivity {
    private Button btn_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quit_bus);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        btn_quit=(Button)findViewById(R.id.btn_quit);

        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BusQuit.this, "벨이 울렸습니다", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder ad= new AlertDialog.Builder(BusQuit.this);
                ad.setIcon(R.mipmap.ic_launcher);
                ad.setTitle("즉시 하차");
                ad.setMessage("지금 하차 하시겠습니까?");



                ad.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                ad.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
                ad.show();
            }
        });

    }
}