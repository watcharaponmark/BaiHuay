package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button RandomBt2=(Button) findViewById(R.id.random_button_2);
        Button RandomBt3=(Button) findViewById(R.id.random_button_3);
        assert RandomBt2 != null;
        assert RandomBt3 != null;

        RandomBt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("ฺBai_main","2");
                startActivity(intent);
            }
        });
         RandomBt3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                 intent.putExtra("ฺBai_main","3");
                 startActivity(intent);
             }
         });


    }
}
