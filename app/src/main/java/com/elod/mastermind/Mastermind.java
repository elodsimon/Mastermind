package com.elod.mastermind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Mastermind extends AppCompatActivity {
    Game game;
    static Button sol1, sol2, sol3, sol4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mastermind);
        Button btnStart = findViewById(R.id.btnStart);
        sol1 = findViewById(R.id.sol1);
        sol1 = findViewById(R.id.sol2);
        sol1 = findViewById(R.id.sol3);
        sol1 = findViewById(R.id.sol4);

    }

    public void onClick(View v) {
        if ((v.getId() == R.id.btnStart)) {
            game = new Game(this);
            game.generalas();
        }
    }
}
