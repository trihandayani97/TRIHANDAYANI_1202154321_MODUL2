package com.example.trihandayani.trihandayani_1202154321_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView foodName;
    TextView foodDesc;
    ImageView imgFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        foodName = (TextView) findViewById(R.id.txtv_food_name);
        foodDesc = (TextView) findViewById(R.id.txtv_food_desc);
        imgFood = (ImageView) findViewById(R.id.image_food);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            foodName.setText(bundle.getString("food_list"));
            foodDesc.setText(bundle.getString("foodDesc"));
            imgFood.setImageResource(bundle.getInt("imgThumb"));
        }
    }

    public void backToMainMenu(View view) {
        Intent toMainMenu = new Intent(this, MainMenu.class);
        startActivity(toMainMenu);
    }
}
