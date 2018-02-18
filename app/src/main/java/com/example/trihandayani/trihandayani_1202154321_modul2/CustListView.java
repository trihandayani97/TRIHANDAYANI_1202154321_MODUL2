package com.example.trihandayani.trihandayani_1202154321_modul2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tri Handayani on 2/18/2018.
 */

public class CustListView extends ArrayAdapter<String> {

    Activity context;
    String[] foodnames;
    String[] foodDescrp;
    int[] imgThumbn;

    //adapter
    public CustListView(@NonNull Activity context, String[] food_list, String[] foodDesc, int[] imgThumb) {
        super(context, R.layout.layout_cust_listview, food_list);
        this.context = context;
        this.foodnames = food_list;
        this.foodDescrp = foodDesc;
        this.imgThumbn = imgThumb;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View cv = convertView;
        ViewHolder vHolder = null;
        if(cv == null){
            LayoutInflater lyInflater = context.getLayoutInflater();
            cv = lyInflater.inflate(R.layout.layout_cust_listview, null, true);
            vHolder = new ViewHolder(cv);
            cv.setTag(vHolder);
        }else {
            vHolder = (ViewHolder) cv.getTag();
        }
        vHolder.imgThmb.setImageResource(imgThumbn[position]);
        vHolder.fName.setText(foodnames[position]);
        vHolder.fDesc.setText(foodDescrp[position]);

        return cv;


    }

    class ViewHolder {

        TextView fName;
        TextView fDesc;
        ImageView imgThmb;

        ViewHolder(View view) {
            fName = (TextView) view.findViewById(R.id.txt_foodname);
            fDesc = (TextView) view.findViewById(R.id.txt_menu_desc);
            imgThmb = (ImageView) view.findViewById(R.id.imageView_thumb);
        }
    }
}
