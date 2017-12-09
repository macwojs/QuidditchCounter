package com.example.android.quidditchcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.quidditchcounter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    int pointsA = 0;
    int pointsB = 0;

    public void click10A(View view) {
        pointsA = pointsA + 10;
        displayForTeamA(pointsA);
    }

    public void click10B(View view) {
        pointsB = pointsB + 10;
        displayForTeamB(pointsB);
    }

    public void clickGoldenA(View view) {
        pointsA = pointsA + 150;
        displayForTeamA(pointsA);
    }

    public void clickGoldenB(View view) {
        pointsB = pointsB + 150;
        displayForTeamB(pointsB);
    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void restartScore(View view) {
        pointsA = 0;
        pointsB = 0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }

}
