package com.example.radek.kalkulator;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Radek on 09.03.2017.
 */
public class ButtonListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
    String number = "";
        if(v==MainActivity.b1) number = "1";
        if(v==MainActivity.b2) number = "2";
        if(v==MainActivity.b3) number = "3";
        if(v==MainActivity.b4) number = "4";


            if (MainActivity.flag == false) {
                MainActivity.l1 += number;
                MainActivity.t2.setText(MainActivity.l1);
            } else {
                MainActivity.l2 += number;
                MainActivity.t3.setText(MainActivity.l2);
            }


    }
}
