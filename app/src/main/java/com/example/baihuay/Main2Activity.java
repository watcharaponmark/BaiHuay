package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Huay ha=new Huay();
        Intent intent=getIntent();
        String bai=intent.getStringExtra("ฺBai_main");
        TextView baiTextviwe1 =(TextView) findViewById(R.id.bai_textView1);
        TextView baiTextviwe2 = (TextView) findViewById(R.id.bai_textView2);
        if(bai.equals("2")){
            baiTextviwe1.setText("เลขท้าย 2 ตัว");
            baiTextviwe2.setText(ha.getRandomTwoDigits());
        }else if(bai.equals("3")){
            baiTextviwe1.setText("เลขท้าย 3 ตัว");
            baiTextviwe2.setText(ha.getRandomThreeDigits());
        }





    }
}
