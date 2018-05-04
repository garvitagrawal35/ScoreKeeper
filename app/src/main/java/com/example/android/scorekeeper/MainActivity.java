package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int wicketscore=0;
    int balls=0;
    int over =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View v){
        score = 0;
        wicketscore = 0;
        balls = 0;
        over = 0;
        displayForbowling(0);
        displayForbatting(0);
        displayForwicket(0);
        displayForbowlingballs(0);
    }


    /**
     * for 1 ball
     */
    public void oneBall(View v){
        balls = balls + 1;
        if(balls>6)
        {
            balls=0;
            over = over +1;
            displayForbowling(over);
        }
        displayForbowlingballs(balls);
    }

    /**
     * for over
     */
    public void over(View v){
        over = over + 1;
        displayForbowling(over);
    }


    /**
     * for 6 runs
     */
    public void sixRuns(View v){
        score = score + 6;
        displayForbatting(score);
    }

    /**
     * for 4 runs
     */
    public void fourRuns(View v){
        score = score + 4;
        displayForbatting(score);
    }

    /**
     * for 3 runs
     */
    public void threeRuns(View v){
        score = score + 3;
        displayForbatting(score);
    }

    /**
     * for 2 runs
     */
    public void twoRuns(View v){
        score = score + 2;
        displayForbatting(score);
    }

    /**
     * for 1 runs
     */
    public void oneRun(View v){
        score = score + 1;
        displayForbatting(score);
    }

    /**
     * for wicket
     */
    public void wicket(View v){

        wicketscore = wicketscore + 1;
        displayForwicket(wicketscore);
    }

    /**
     * Displays the over of bowling team
     */
    public void displayForbowling(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bowlilng_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the balls of bowling team
     */
    public void displayForbowlingballs(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bowling_team_balls);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the runs of batting team
     */
    public void displayForbatting(int score) {
        TextView scoreView = (TextView) findViewById(R.id.batting_team_runs);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the wicket
     */
    public void displayForwicket(int score) {
        TextView scoreView = (TextView) findViewById(R.id.batting_team_wicket);
        scoreView.setText(String.valueOf(score));
    }
}