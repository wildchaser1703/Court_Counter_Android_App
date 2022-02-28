package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.score_team_a);
        scoreview.setText(String.valueOf(score));
    }

    public void displayTeamB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.score_team_b);
        scoreview.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA += 3;
        displayTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA += 2;
        displayTeamA(scoreTeamA);
    }

    public void addFreeForTeamA(View view) {
        scoreTeamA += 1;
        displayTeamA(scoreTeamA);

    }

    public void addThreeForTeamB(View view) {
        scoreTeamB += 3;
        displayTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB += 2;
        displayTeamB(scoreTeamB);
    }

    public void addFreeForTeamB(View view) {
        scoreTeamB += 1;
        displayTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}