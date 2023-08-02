package edu.utsa.cs3443.scoretracker;

import android.view.View;

public class MainActivityController implements View.OnClickListener{
    private MainActivity activity;

    public MainActivityController(MainActivity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.new_game_button){
            //load new game activity
        }
    }
}
