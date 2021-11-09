// Copyright 2021 The Android Open Source Project
//
// File: MainActivity.java
// Author: Tim Mailman
// Date: Nov 8th, 2021
//

package com.example.m02_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstNumField;
    private EditText mSecondNumField;
    private Button mAddButton;
    private Button mSubtractButton;
    private Button mMultiplyButton;
    private Button mDivideButton;
    private EditText mAnswerField;

    // Creates the activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstNumField = findViewById(R.id.numField1);
        mSecondNumField = findViewById(R.id.numField2);
        mAddButton = findViewById(R.id.buttonPlus);
        mSubtractButton = findViewById(R.id.buttonSubtract);
        mMultiplyButton = findViewById(R.id.buttonMultiply);
        mDivideButton = findViewById(R.id.buttonDivide);
        mAnswerField = findViewById(R.id.answerField);
        Log.v("onCreate", "setContentView " + R.layout.activity_main);


        // Does addition on two edittext fields when mAddButton is invoked
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int userNumber1 = Integer.parseInt(mFirstNumField.getText().toString());
                int userNumber2 = Integer.parseInt(mSecondNumField.getText().toString());
                int userTotal = userNumber1 + userNumber2;
                mAnswerField.setText(String.valueOf(userTotal));
                Log.v("onClick Add", "expression: " + userNumber1 + " + " + userNumber2 + " = " + userTotal);
            }
        });


        // Does subtraction on two edittext fields when mSubtractButton is invoked
        mSubtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int userNumber1 = Integer.parseInt(mFirstNumField.getText().toString());
                int userNumber2 = Integer.parseInt(mSecondNumField.getText().toString());
                int userTotal = userNumber1 - userNumber2;
                mAnswerField.setText(String.valueOf(userTotal));
                Log.v("onClick subtract", "expression: " + userNumber1 + " - " + userNumber2 + " = " + userTotal);
            }
        });


        // Does multiplication on two edittext fields when mMultiplyButton is invoked
        mMultiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int userNumber1 = Integer.parseInt(mFirstNumField.getText().toString());
                int userNumber2 = Integer.parseInt(mSecondNumField.getText().toString());
                int userTotal = userNumber1 * userNumber2;
                mAnswerField.setText(String.valueOf(userTotal));
                Log.v("onClick multiply", "expression: " + userNumber1 + " * " + userNumber2 + " = " + userTotal);
            }
        });


        // Does division on two edittext fields when mDivideButton is invoked
        mDivideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double userNumber1 = Double.parseDouble(mFirstNumField.getText().toString());
                double userNumber2 = Double.parseDouble(mSecondNumField.getText().toString());
                double userTotal = userNumber1 / userNumber2;
                mAnswerField.setText(String.valueOf(userTotal));
                Log.v("onClick divide", "expression: " + userNumber1 + " / " + userNumber2 + " = " + userTotal);
            }
        });

    }
}