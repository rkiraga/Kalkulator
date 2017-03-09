package com.example.radek.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bplus, beq;
    //EditText t;
    static String l1 = "";
    static String l2 = "";
   static  boolean flag = false;
   static boolean plusFlag = false;
    //  double result;
    static TextView t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        //   t = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button4);
        b4 = (Button) findViewById(R.id.button5);
        b5 = (Button) findViewById(R.id.button6);
        b6 = (Button) findViewById(R.id.button7);
        b7 = (Button) findViewById(R.id.button8);
        b8 = (Button) findViewById(R.id.button9);
        b9 = (Button) findViewById(R.id.button10);
        b0 = (Button) findViewById(R.id.button13);
        bplus = (Button) findViewById(R.id.button11);
        beq = (Button) findViewById(R.id.button12);

        b1.setOnClickListener(new ButtonListener());
        b2.setOnClickListener(new ButtonListener());
        b3.setOnClickListener(new ButtonListener());
        b4.setOnClickListener(new ButtonListener());


        bplus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;

                if(plusFlag==true){
                    String w="";
                    w = t4.getText().toString();

                    t2.setText(w);
                    l1=t2.getText().toString();
                    l2="";
                    t3.setText("");
                    t4.setText("");
                }

                plusFlag=true;
            }
        });

        beq.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(l1);
                double d2 = Double.parseDouble(l2);
                double wynik = d1 + d2;
                t4.setText(new String(Double.toString(wynik)));
            }
        });
    }

    public void wyswietl(View v) {
        Toast.makeText(getApplicationContext(), "EL12121O", Toast.LENGTH_LONG).show();
    }
}
