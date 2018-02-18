package com.example.trihandayani.trihandayani_1202154321_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TakeAway extends AppCompatActivity {

    String name;
    String phoneNumb;
    String address;
    String additional_info;

    TextView txtvName;
    TextView txtvPhoneNumb;
    TextView txtvAddr;
    TextView txtAddInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        txtvName = (TextView) findViewById(R.id.editText_name);
        txtvPhoneNumb = (TextView) findViewById(R.id.editText_phone_numb);
        txtvAddr = (TextView) findViewById(R.id.editText_addr);
        txtAddInfo = (TextView) findViewById(R.id.editText_additional_info);

    }


    public void onClicTakeAway(View view) {

        name = txtvName.getText().toString();
        phoneNumb = txtvPhoneNumb.getText().toString();
        address = txtvAddr.getText().toString();
        additional_info = txtAddInfo.getText().toString();

        Intent toFoodlist = new Intent(this, FoodList.class);
        startActivity(toFoodlist);

    }
}
