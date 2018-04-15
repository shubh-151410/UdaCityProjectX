package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text_view;
    String scoredisplay = "";
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_view = (TextView) findViewById(R.id.name_edit_text_view);
    }

    public void OnClick(View view) {
        Intent intent = new Intent(getApplicationContext(), GameActivity.class);
        intent.putExtra("min", 1);
        intent.putExtra("max", 9);
        startActivity(intent);
    }

    public void OnClickNext(View view) {
        Intent intent = new Intent(getApplicationContext(), MultipleChoice.class);
        startActivity(intent);
    }

    public void displayscore(View view) {
        score = getIntent().getIntExtra("TotalScore", 0);
        if (score == 0) {                                   // cecking the condition
            scoredisplay = Integer.toString(score);
            text_view.setText("High Score:- " + scoredisplay);
        } else {
            scoredisplay = Integer.toString(score);
            text_view.setText("High Score:- " + scoredisplay);
            Toast.makeText(MainActivity.this, scoredisplay, Toast.LENGTH_LONG).show();

        }
    }

    public void resetscore(View view) {
        getIntent().removeExtra("TotalScore");  //reset the value of high score
        text_view.setText("High Score:- 0");
    }
}
