package com.example.dell.schedulerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by DELL on 07-04-2018.
 */

public class HomePage extends AppCompatActivity {
    TextView textView3;

    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        textView3 = (TextView)findViewById(R.id.textView3);

        b5 = (Button)findViewById(R.id.button5);
        String data = getIntent().getExtras().getString("USER_NAME");
        textView3.setText("Hi,"+data);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent t5 = new Intent("com.example.dell.TIME");
                startActivity(t5);
            }
        });
    }
}