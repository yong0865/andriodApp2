package com.example.yo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    Button b1;
    TextView count, price;
    CheckBox c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        b1 = (Button)findViewById(R.id.b1);
        count = (TextView)findViewById(R.id.count);
        price = (TextView)findViewById(R.id.price);
        c1 = (CheckBox)findViewById(R.id.c1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = e1.getText().toString();
                String spa = e2.getText().toString();
                String salad = e3.getText().toString();

                int acount = Integer.parseInt(pizza) +Integer.parseInt(spa) +Integer.parseInt(salad);
                int aprice = Integer.parseInt(pizza)*15000 +Integer.parseInt(spa)*13000 +Integer.parseInt(salad)*9000;

                if(c1.isChecked() == true) aprice = aprice*90/100;

                count.setText(acount +"개");
                price.setText(aprice +"원");

            }
        });


    }
}
