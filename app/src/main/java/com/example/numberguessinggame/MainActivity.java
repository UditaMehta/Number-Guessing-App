package com.example.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button chck, refresh;
    EditText num;
    int dig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chck = (Button) findViewById(R.id.btn);
        num = (EditText) findViewById(R.id.txt);
        refresh = (Button) findViewById(R.id.btn2);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });

       
//        int a = random();
        int a = new Random().nextInt(11-1)+1;

//        Toast.makeText(this, "a = " + a, Toast.LENGTH_SHORT).show();


        chck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dig = Integer.parseInt(num.getText().toString());
                int i= Integer.parseInt(String.valueOf(dig));

                if (i==a){
                    Toast.makeText(MainActivity.this, "Well Done!!", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Get lost uhh !!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private int random() {
        return 0;
    }
}