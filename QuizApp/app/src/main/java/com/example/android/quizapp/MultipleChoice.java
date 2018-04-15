package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MultipleChoice extends AppCompatActivity {
    CheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkkbox6, checkkbox7, checkkbox8;
    Button btn_next;
    EditText edt_txt;
    int score = 0, score1 = 0,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);
        checkbox1 = (CheckBox) findViewById(R.id.checkbox_1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox_2);
        checkbox3 = (CheckBox) findViewById(R.id.checkbox_3);
        checkbox4 = (CheckBox) findViewById(R.id.checkbox_4);
        checkbox5 = (CheckBox) findViewById(R.id.checkbox_5);
        checkkbox6 = (CheckBox) findViewById(R.id.checkbox_6);
        checkkbox7 = (CheckBox) findViewById(R.id.checkbox_7);
        checkkbox8 = (CheckBox) findViewById(R.id.checkbox_8);
        btn_next = (Button) findViewById(R.id.next_button);
        edt_txt = (EditText) findViewById(R.id.ans_edit_text);
    }

    public void anschkbox(View view) {
        if (checkbox1.isChecked() && checkbox2.isChecked()) {
            score = 5;
        }
        if (checkbox1.isChecked() && checkbox2.isChecked() && checkbox3.isChecked() && checkbox4.isChecked()) {
            score = 0;
        }
        if (checkbox1.isChecked() && checkbox2.isChecked() && checkbox3.isChecked()) {
            score = 0;
        }
        if (checkbox1.isChecked() && checkbox2.isChecked() && checkbox4.isChecked()) {
            score = 0;
        }
        if (checkbox2.isChecked() && checkbox3.isChecked()) {
            score = 0;
        }
        if (checkbox2.isChecked() && checkbox4.isChecked()) {
            score = 0;
        }
        if (checkbox1.isChecked() && checkbox3.isChecked()) {
            score = 0;
        }
        if (checkbox1.isChecked() && checkbox4.isChecked()) {
            score = 0;
        }
    }

    public void checkanser(View view) {
        if (score > 0) {
            Toast.makeText(MultipleChoice.this, "Correct Anser", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MultipleChoice.this, "please try again", Toast.LENGTH_LONG).show();
        }
    }

    public void showans(View view) {
        if (checkkbox7.isChecked() && checkkbox8.isChecked()) {
            score1 = 5;
        }
        if (checkkbox7.isChecked() && checkkbox8.isChecked() && checkbox5.isChecked() && checkkbox6.isChecked()) {
            score1 = 0;
        }
        if (checkkbox7.isChecked() && checkkbox8.isChecked() && checkkbox6.isChecked()) {
            score1 = 0;
        }
        if (checkkbox7.isChecked() && checkkbox8.isChecked() && checkbox5.isChecked()) {
            score1 = 0;
        }
        if (checkkbox7.isChecked() && checkbox5.isChecked()) {
            score1 = 0;
        }
        if (checkkbox7.isChecked() && checkkbox6.isChecked()) {
            score1 = 0;
        }
        if (checkkbox8.isChecked() && checkbox5.isChecked()) {
            score1 = 0;
        }
        if (checkkbox8.isChecked() && checkkbox6.isChecked()) {
            score1 = 0;
        }
    }

    public void checkans(View view) {
        if (score1 >= 5) {
            Toast.makeText(MultipleChoice.this, "Correct choice", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MultipleChoice.this, "please try again", Toast.LENGTH_SHORT).show();
        }
    }

    public void edtans(View view) {
        String q = edt_txt.getText().toString();
        if(TextUtils.isEmpty(q)) {
            edt_txt.setError("Please Enter your Answer");
            return;
        }
         else {
            try {
                 z = Integer.parseInt(edt_txt.getText().toString());
            } catch (NumberFormatException e){
                Log.i("",q+" is not a number");
            }
            if (z == 200) {
                Toast.makeText(MultipleChoice.this, "Correct answer", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MultipleChoice.this, "Please try Again", Toast.LENGTH_SHORT).show();
            }
        }
    }
}


