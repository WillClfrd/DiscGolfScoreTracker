package edu.utsa.cs3443.scoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MainActivityController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new MainActivityController(this);

        Button newGameButton = findViewById(R.id.new_game_button);
        setupClickable(newGameButton);
    }

    private void setupClickable(View view){
        view.setOnClickListener(controller);
    }
}