package com.example.customice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button next_btn;
    EditText send_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                finish();
            }
        },2000);

    }
}



//        next_btn = (Button) findViewById(R.id.next_button);
//send_name = (EditText) findViewById(R.id.user_name_input);

//next_btn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                String str = send_name.getText().toString();
//                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                intent.putExtra("msg_key",str);
//                startActivity(intent);
//            }
//        });