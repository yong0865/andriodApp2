package com.example.yo.myapplication;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent aaa = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(aaa);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent bbb = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(bbb);
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent ccc = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(ccc);
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent ddd = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(ddd);
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent eee = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(eee);
            }
        });
    }
}
