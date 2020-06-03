package com.example.meetup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    Button one, two, plus, equal, three, mul;
    EditText result, e1, e2;


    float a, b;
    boolean add;
    int sum=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        one = (Button)findViewById(R.id.o1);
        two = (Button)findViewById(R.id.o2);
        plus = (Button)findViewById(R.id.add);
        equal = (Button)findViewById(R.id.out);
        result = (EditText)findViewById(R.id.e1);
       three = (Button)findViewById(R.id.button6);
        e1 = (EditText)findViewById(R.id.editText4);
        e2 = (EditText)findViewById(R.id.editText5);
        mul = (Button)findViewById(R.id.mul);



        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int g = Integer.parseInt(e1.getText()+"");
                        int h = Integer.parseInt(e2.getText()+"");
                        int f = g*h;
                        result.setText(f+"");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               result.setText(result.getText() + "1");
           }
       });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null) {
                    result.setText("empty");
                } else {
                    a = Float.parseFloat(result.getText() + "");
                    add = true;
                    result.setText(null);
                }
            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Float.parseFloat(result.getText() + "");

                if (add == true) {
                    result.setText(a + b + "");
                    add = false;
                }


            }
        });


    }
}
