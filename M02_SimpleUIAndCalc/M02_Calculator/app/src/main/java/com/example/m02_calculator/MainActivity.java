//Make an Android Calculator App:
//
//        Create a working Calculator App.
//        input 2 numbers
//        set 4 buttons (for add, subtract, multiply and divide)
//        one field for the answer (set as read-only)
//        id attributes are set properly  (don't leave it as editText....use a pattern that others can understand, such as editText_Num1, editText_Num2, ect...
//        Show your code in the PDF, so I can verify your field names.


        package com.example.m02_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private EditText answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        num1 = (EditText)findViewById(R.id.numField1);
        num1 = findViewById(R.id.numField1);
        num2 = findViewById(R.id.numField2);
//        add = (Button)findViewById(R.id.buttonPlus);
        add = findViewById(R.id.buttonPlus);
        subtract = findViewById(R.id.buttonSubtract);
        multiply = findViewById(R.id.buttonMultiply);
        divide = findViewById(R.id.buttonDivide);
        answer = findViewById(R.id.answerField);





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int total = number1 + number2;
                answer.setText(String.valueOf(total));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int total = number1 - number2;
                answer.setText(String.valueOf(total));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int total = number1 * number2;
                answer.setText(String.valueOf(total));
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double total = number1 / number2;
                answer.setText(String.valueOf(total));
            }
        });

    }
}