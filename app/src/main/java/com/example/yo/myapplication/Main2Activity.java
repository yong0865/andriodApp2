package com.example.yo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String price = e1.getText().toString();
                String count = e2.getText().toString();
                int result = Integer.parseInt(price)*Integer.parseInt(count);

                Toast.makeText(getApplicationContext(),"사과의 총가격은"+result +"입니다",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
