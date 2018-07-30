package com.example.waqar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText firstnumber;
    EditText secondnumber;
    Button add,subb,mul,div;

    double num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnumber = (EditText) findViewById(R.id.Text1);
        secondnumber =(EditText) findViewById(R.id.Text2);
        result = (TextView) findViewById(R.id.textView);
        add = (Button) findViewById(R.id.button5);
        subb = (Button) findViewById(R.id.button6);
        mul = (Button) findViewById(R.id.button7);
        div = (Button) findViewById(R.id.button8);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Double.parseDouble(firstnumber.getText().toString());
                num2 =Double.parseDouble(secondnumber.getText().toString());
                sum = num1+num2;
                result.setText(Double.toString(sum));
            }

        });
        subb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Double.parseDouble(firstnumber.getText().toString());
                num2 =Double.parseDouble(secondnumber.getText().toString());
                sum = num1-num2;
                result.setText(Double.toString(sum));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Double.parseDouble(firstnumber.getText().toString());
                num2 =Double.parseDouble(secondnumber.getText().toString());
                sum = num1*num2;
                result.setText(Double.toString(sum));
            }

        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Double.parseDouble(firstnumber.getText().toString());
                num2 =Double.parseDouble(secondnumber.getText().toString());
                sum = num1/num2;
                result.setText(Double.toString(sum));
            }

        });





    }
}
