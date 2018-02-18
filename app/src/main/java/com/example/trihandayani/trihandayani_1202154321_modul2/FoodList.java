package com.example.trihandayani.trihandayani_1202154321_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class FoodList extends AppCompatActivity {

    ListView lv_food_list;
    String[] food_list = {
            "Ayam Fillet Lada Hitam",
            "Ayam Goreng Krispi Separo",
            "Ayam Goreng Krispi Utuh",
            "Bebek Panggang Setengah Ekor",
            "Alung Unagi",
            "Cumi Bakar Kecap",
            "Ikan Gurami Bakar Kecap",
            "Ikan Kuwe Bakar Kecap",
            "Ikan Kuwe Bakar Pedas",
            "Ikan Patin Bakar Pedas",
            "Kepiting Soka Cabe Garam",
            "Lobster Saus Singapore"};
    String[] foodDesc = {
            "Rp 25.000 \n Ayam Suir dengan saus lada hitam",
            "Rp 30.000 \n Setengah ekor ayam goreng tepung krispi",
            "Rp 40.000 \n Satu ekor ayam goreng tepung krispi",
            "Rp 25.000 \n Setengah ekor bebek panggang",
            "Rp 23.000 \n Makanan laut",
            "Rp 27.000 \n Makanan laut. Cumi-cumi bakar yang dilumuri kecap manis",
            "Rp 35.000 \n Makanan laut. Ikan gurami bakar yang dilumuri kecap manis",
            "Rp 36.000 \n Makanan laut. Ikan kuwe bakar yang dilumuri kecap manis",
            "Rp 34.000 \n Makanan laut. Ikan kuwe bakar yang dilumuri bumbu sambal pedas",
            "Rp 38.000 \n Makanan laut. Ikan patin bakar yang dilumuri bumbu sambal pedas",
            "Rp 39.500 \n Makanan laut. Kepiting Soka pedas asin yang dilumuri sambal cabai dan garam",
            "Rp 35.000 \n Makanan laut. Udang Lobster yang dilumuri saus singapore"};
    int[] imgThumb = {
            R.drawable.ayamfilletladahitam01,
            R.drawable.ayamgorengkrispiseparo01,
            R.drawable.ayamgorengkrispiutuh01,
            R.drawable.bebekpanggangsetengahekor,
            R.drawable.alungunagi01,
            R.drawable.cumibakarkecap,
            R.drawable.ikanguramibakarkecap01,
            R.drawable.ikankuwebakarkecap01,
            R.drawable.ikankuwebakarpedas01,
            R.drawable.ikanpatinbakarpedas,
            R.drawable.kepitingsokacabegaram01,
            R.drawable.lobstersaussingapore01
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        lv_food_list = (ListView) findViewById(R.id.foodlist);
        CustListView custListView = new CustListView(this, food_list, foodDesc, imgThumb);
        lv_food_list.setAdapter(custListView);
        lv_food_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent toDetailMenu = new Intent(FoodList.this, DetailMenu.class);
                toDetailMenu.putExtra("food_list", food_list[i]);
                toDetailMenu.putExtra("foodDesc", foodDesc[i]);
                toDetailMenu.putExtra("imgThumb", imgThumb[i]);
                startActivity(toDetailMenu);

            }
        });
    }
}
