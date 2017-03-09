package com.example.yo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String year = e1.getText().toString();
                int age = 2017- Integer.parseInt(year)+1;

                Toast.makeText(getApplicationContext(),"당신의 나이는"+ age +"세 입니다",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String age = e2.getText().toString();
                int year = 2017 - Integer.parseInt(age) +1;

                Toast.makeText(getApplicationContext(),"당신의 태어난 해는"+ year +"년도 입니다",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
