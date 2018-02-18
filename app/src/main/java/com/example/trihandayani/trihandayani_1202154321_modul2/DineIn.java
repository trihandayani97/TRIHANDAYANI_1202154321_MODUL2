package com.example.trihandayani.trihandayani_1202154321_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    private Spinner spinner;
    private Intent toFoodList;
    private EditText editText_name;
    private String no_meja;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //buat inisialisasi editText Name
        editText_name = (EditText) findViewById(R.id.editTxt_name);

        //Buat inisialisasi spinner
        spinner = (Spinner) findViewById(R.id.spinner_no_meja);
        toast();
    }

    public void toast(){    //memunculkan toast
        if(spinner.isSelected()){
            name = editText_name.getText().toString();
            no_meja = spinner.getSelectedItem().toString();
            Toast.makeText(this, name +" Has Booked " + no_meja, Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickOrder(View view) {
        //Toast.makeText(this, spinner.getSelectedItem().toString()+" is Selected", Toast.LENGTH_SHORT).show();
        toFoodList = new Intent(this, FoodList.class);
        startActivity(toFoodList);
    }
}
