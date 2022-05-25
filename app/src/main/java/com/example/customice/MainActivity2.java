package com.example.customice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {
//    TextView rcv_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        },2000);

//        rcv_name = (TextView) findViewById(R.id.name_display);
//        Intent intent = getIntent();
//        String str = intent.getStringExtra("msg_key");
//        rcv_name.setText("Welcome " + str);
    }
}