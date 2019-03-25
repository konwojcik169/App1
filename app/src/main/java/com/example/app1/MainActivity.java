package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    EditText et1;
    EditText et2;
    EditText et3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);
        rb3 = findViewById(R.id.radioButton3);
        rb4 = findViewById(R.id.radioButton4);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        et3 = findViewById(R.id.editText3);
        b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator();
            }
        });
    }

    public void calculator()
    {
        if (rb1.isChecked()){
            add(et3);
        } else if (rb2.isChecked()) {
            sub(et3);
        } else if (rb3.isChecked()){
            mul(et3);
        } else if (rb4.isChecked()) {
            div(et3);
        } else {
            et3.setText("Choose maths operation");
        }
    }

    public void add(View v){
        float x = Float.parseFloat(et1.getText().toString());
        float y = Float.parseFloat(et2.getText().toString());
        float sum = x + y;
        et3.setText("Sum = " + String.valueOf(sum));
    }

    public void sub(View v){
        float x = Float.parseFloat(et1.getText().toString());
        float y = Float.parseFloat(et2.getText().toString());
        float sum = x - y;
        et3.setText("Difference = " + String.valueOf(sum));
    }

    public void mul(View v){
        float x = Float.parseFloat(et1.getText().toString());
        float y = Float.parseFloat(et2.getText().toString());
        float sum = x * y;
        et3.setText("Product = " + String.valueOf(sum));
    }

    public void div(View v){
        float x = Float.parseFloat(et1.getText().toString());
        float y = Float.parseFloat(et2.getText().toString());
        if(y != 0){
            float sum = x / y;
            et3.setText("Quotient = " + String.valueOf(sum));
        }
        else {
            et3.setText("Enter the second number different off 0");
        }
    }

    @Override
    public void onClick(View v) {

    }
}
