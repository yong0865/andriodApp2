package com.example.yo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String c = e1.getText().toString();
                double f = Integer.parseInt(c)*1.8 +32 ;

                Toast.makeText(getApplicationContext(),"화씨 온도는"+ f +"도 입니다",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String f = e2.getText().toString();
                double c = (Integer.parseInt(f)-32)/1.8;

                Toast.makeText(getApplicationContext(),"섭씨 온도는"+ c+"도 입니다",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
