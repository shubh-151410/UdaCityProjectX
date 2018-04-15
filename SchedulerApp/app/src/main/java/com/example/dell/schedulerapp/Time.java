package com.example.dell.schedulerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by DELL on 07-04-2018.
 */

public class Time extends AppCompatActivity {

    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i8 = new Intent("com.example.dell.PLACEPREFERENCE");
                startActivity(i8);
            }
        });
    }
}