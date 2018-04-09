package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_of_A = 0;
    int score_of_A1 = 0;
    int score_of_A_total = score_of_A + score_of_A1;
    int score_of_B = 0;
    int score_of_B1 = 0;
    int score_of_B_total = score_of_B + score_of_B1;

    public void A (View view){
        score_of_A=score_of_A+1;
        score_of_A_total = score_of_A + score_of_A1;
        display_A(score_of_A);
        display_Atot(score_of_A_total);
    }

    public void A1 (View view){
        score_of_A1=score_of_A1+1;
        score_of_A_total = score_of_A + score_of_A1;
        display_A1(score_of_A1);
        display_Atot(score_of_A_total);
    }

    public void B (View view){
        score_of_B=score_of_B+1;
        score_of_B_total = score_of_B + score_of_B1;
        display_B(score_of_B);
        display_Btot(score_of_B_total);
    }

    public void B1 (View view){
        score_of_B1=score_of_B1+1;
        score_of_B_total = score_of_B + score_of_B1;
        display_B1(score_of_B1);
        display_Btot(score_of_B_total);
    }

    public void reset (View view) {
        score_of_A=0;
        score_of_A1=0;
        score_of_A_total=0;
        score_of_B=0;
        score_of_B1=0;
        score_of_B_total=0;
        display_A(score_of_A);
        display_A1(score_of_A1);
        display_Atot(score_of_A_total);
        display_B(score_of_B);
        display_B1(score_of_B1);
        display_Btot(score_of_B_total);
    }


    public void display_A(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));
    }

    public void display_A1(int score) {
        TextView scoreView1 = (TextView) findViewById(R.id.team_A_score1);
        scoreView1.setText(String.valueOf(score));
    }

    public void display_Atot(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_total);
        scoreView.setText(String.valueOf(score));
    }

    public void display_B(int score) {
        TextView scoreViewTot = (TextView) findViewById(R.id.team_B_score);
        scoreViewTot.setText(String.valueOf(score));
    }

    public void display_B1(int score) {
        TextView scoreView1 = (TextView) findViewById(R.id.team_B_score1);
        scoreView1.setText(String.valueOf(score));
    }

    public void display_Btot(int score) {
        TextView scoreViewTot = (TextView) findViewById(R.id.team_B_total);
        scoreViewTot.setText(String.valueOf(score));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
