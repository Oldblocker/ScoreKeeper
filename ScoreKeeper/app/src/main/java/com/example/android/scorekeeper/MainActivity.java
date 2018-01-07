package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulA = 0;
    int foulB = 0;
    int yellowCardA = 0;
    int yellowCardB = 0;
    int redCardA = 0;
    int redCardB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team 1 by 1 point.
     */
    public void goalA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the amount of fouls for Team 1.
     */
    public void foulA(View v) {
        foulA = foulA + 1;
        displayFoulA(foulA);
    }

    /**
     * Increases the amount of yellow cards for Team 1.
     */
    public void yellowCardA(View v) {
        yellowCardA = yellowCardA + 1;
        displayYellowA(yellowCardA);
    }

    /**
     * Increase the amount of red cards for Team 1.
     */
    public void redCardA(View v) {
        redCardA = redCardA + 1;
        displayRedA(redCardA);
    }

    /**
     * Increase the score for Team 2 by 1 point.
     */
    public void goalB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the amount of fouls for Team 2.
     */
    public void foulB(View v) {
        foulB = foulB + 1;
        displayFoulB(foulB);
    }

    /**
     * Increase the amount of yellow cards for Team 2.
     */
    public void yellowCardB(View v) {
        yellowCardB = yellowCardB + 1;
        displayYellowB(yellowCardB);
    }

    /**
     * Increase the amount of red cards for Team 2.
     */
    public void redCardB(View v) {
        redCardB = redCardB + 1;
        displayRedB(redCardB);
    }

    /**
     * Resets the score for both teams.
     */
    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulA = 0;
        foulB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulA(foulA);
        displayFoulB(foulB);
        displayYellowA(yellowCardA);
        displayYellowB(yellowCardB);
        displayRedA(redCardA);
        displayRedB(redCardB);
    }

    /**
     * Displays the given score for Team 1.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul amount for Team 1.
     */
    public void displayFoulA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulAScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red card amount for Team 1.
     */
    public void displayRedA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redAScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow card amount for Team 1.
     */
    public void displayYellowA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowAScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul amount for Team 2.
     */
    public void displayFoulB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulBScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow card amount for Team 2.
     */
    public void displayYellowB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowBScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red card amount for Team 2.
     */
    public void displayRedB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redBScore);
        scoreView.setText(String.valueOf(score));
    }
}