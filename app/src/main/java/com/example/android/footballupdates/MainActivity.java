package com.example.android.footballupdates;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAShots = 0;
    int teamBShots = 0;
    int teamAFoul = 0;
    int teamBFoul = 0;
    int teamAGoal = 0;
    int teamBGoal = 0;

    public void addBarcaShots (View view) {
        teamAShots = teamAShots + 1;
        displayBarcaShots (teamAShots);
    }

    public void addMadridShots (View view) {
        teamBShots = teamBShots + 1;
        displayMadridShots (teamBShots);
    }

    public void addBarcaFoul (View view) {
        teamAFoul = teamAFoul + 1;
        displayBarcaFoul (teamAFoul);
    }

    public void addMadridFoul (View view) {
        teamBFoul = teamBFoul + 1;
        displayMadridFoul (teamBFoul);
    }

    public void addBarcaGoal (View view) {
        teamAGoal = teamAGoal + 1;
        displayBarcaGoals (teamAGoal);
    }

    public void addMadridGoal (View view) {
        teamBGoal = teamBGoal + 1;
        displayMadridGoals (teamBGoal);
    }

    public void displayBarcaShots(int number) {
        TextView barcaShots = (TextView) findViewById(R.id.barca_shots);
        barcaShots.setText("" + number);
    }

    public void displayMadridShots(int number) {
        TextView madridShots = (TextView) findViewById(R.id.madrid_shots);
        madridShots.setText("" + number);
    }

    public void displayBarcaFoul(int number) {
        TextView barcaFoul = (TextView) findViewById(R.id.barca_foul);
        barcaFoul.setText("" + number);
    }

    public void displayMadridFoul(int number) {
        TextView madridFoul = (TextView) findViewById(R.id.madrid_foul);
        madridFoul.setText("" + number);
    }

    public void displayBarcaGoals(int number) {
        TextView barcaGoal = (TextView) findViewById(R.id.barca_goals);
        barcaGoal.setText("" + number);
    }

    public void displayMadridGoals(int number) {
        TextView madridGoal = (TextView) findViewById(R.id.madrid_goals);
        madridGoal.setText("" + number);
    }

    public void resetScore (View view) {
        teamAGoal = 0;
        teamBGoal = 0;
        teamAShots = 0;
        teamBShots = 0;
        teamAFoul = 0;
        teamBFoul = 0;

        displayBarcaGoals(teamAGoal);
        displayMadridGoals(teamBGoal);
        displayBarcaShots(teamAShots);
        displayMadridShots(teamBShots);
        displayBarcaFoul(teamAFoul);
        displayMadridFoul(teamBFoul);

    }
}
