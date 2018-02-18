package com.example.trihandayani.trihandayani_1202154321_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainMenu extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toast.makeText(this, "TRIHANDAYANI_1202154321", Toast.LENGTH_LONG).show();
    }

    public void onClickOrder(View view) {

        //memeriksa apakah radio button diklik
        boolean dineIn_clicked = ((RadioButton) findViewById(R.id.rbtn_dine_in)).isChecked();
        boolean takeAway_clicked = ((RadioButton) findViewById(R.id.rbtn_take_away)).isChecked();

        //button mana yang yang diklik
        if(dineIn_clicked){
            goToDineInView();
        } else if(takeAway_clicked){
            goToTakeAwayView();
        }else{
            Toast.makeText(this, "Choose One of Main Menu First!", Toast.LENGTH_SHORT).show();
        }


    }

    public void goToDineInView(){
        Intent toDineIn = new Intent(this, DineIn.class);
        startActivity(toDineIn);
    }

    public void goToTakeAwayView(){
        Intent toTakeAway = new Intent(this, TakeAway.class);
        startActivity(toTakeAway);
    }
}
