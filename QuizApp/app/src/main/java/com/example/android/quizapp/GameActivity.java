package com.example.android.quizapp;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    TextView textview;
    RadioGroup rdgroup;
    Random r = new Random();                                                        // Use for Random Function;
    int min, max, i = 1, j = 4, x, score = 0, ques = 5, i1, i2, result;
    RadioButton btr1, btr2, btr3, btr4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        textview = (TextView) findViewById(R.id.text_view);
        rdgroup = (RadioGroup) findViewById(R.id.groupbutton);
        btr1 = (RadioButton) findViewById(R.id.radio_button_1);
        btr2 = (RadioButton) findViewById(R.id.radio_button_2);
        btr3 = (RadioButton) findViewById(R.id.radio_button_3);
        btr4 = (RadioButton) findViewById(R.id.radio_button_4);
        getques();                                                             // Getting a new Question
        newques();
    }
    public void getques() {
        min = getIntent().getIntExtra("min", 0);
        max = getIntent().getIntExtra("max", 0);
        i1 = r.nextInt(max - min + 1) + min;                           // Generate A Random Number;
        i2 = r.nextInt(max - min + 1) + min;
        x = r.nextInt(j - i + 1) + i;
        textview.setText(i1 + "*" + i2 + "=" + "?");
        result = i1 * i2;
        btr1.setText("" + (r.nextInt(max - min + 1) + min * r.nextInt(max - min + 1) + min));
        btr2.setText("" + (r.nextInt(max - min + 1) + min * r.nextInt(max - min + 1) + min));
        btr3.setText("" + (r.nextInt(max - min + 1) + min * r.nextInt(max - min + 1) + min));
        btr4.setText("" + (r.nextInt(max - min + 1) + min * r.nextInt(max - min + 1) + min));
        switch (x) {
            case 1:
                btr1.setText("" + result);
                break;
            case 2:
                btr2.setText("" + result);
                break;
            case 3:
                btr3.setText("" + result);
                break;
            case 4:
                btr4.setText("" + result);
                break;
            default:
                break;
        }
    }

    public void newques() {
        rdgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                btr1.setChecked(false);
                btr2.setChecked(false);
                btr3.setChecked(false);
                btr4.setChecked(false);
                String answer = ((RadioButton) findViewById(checkedId)).getText().toString();
                if (answer.equals(String.valueOf(result))) {
                    score = score + 5;
                    Toast.makeText(GameActivity.this, "CORRECT OPTION", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "INCORRET OPTION", Toast.LENGTH_SHORT).show();
                }
                if (ques == 0) {
                    Toast.makeText(GameActivity.this, "ques complete", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                    intent.putExtra("TotalScore", score);
                    startActivity(intent);
                } else {
                    getques();
                    ques--;
                }
            }

        });
    }
}
