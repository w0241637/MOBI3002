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

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
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


//        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
//
//        }








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









//    public void getMyVersion(View view) {
//
//        // Get version data
//        String versionNum = Integer.toString(Build.VERSION.SDK_INT);
//        Boolean afterKitKat = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT);
//
//        // Put it on the screen
//        TextView t = (TextView) findViewById(R.id.textView);
//        t.setText(" Version Number is " + versionNum);
//        t.append("\n afterKitKat = " + afterKitKat.toString());
//        t.append("\n Build.VERSION.RELEASE = " + Build.VERSION.RELEASE);
//        t.append("\n Build.VERSION.INCREMENTAL = " + Build.VERSION.INCREMENTAL);
//
//        // dump build and display metrics
//        t.append("\n Build.DISPLAY = " + Build.DISPLAY.toString());
//        t.append("\n Screen Size = " + getSizeName(view.getContext()));
//        t.append("\n getDisplayMetrics().densityDpi = " + getResources().getDisplayMetrics().densityDpi);
//        t.append("\n getDisplayMetrics().density = " + getResources().getDisplayMetrics().density);
//        t.append("\n getDisplayMetrics().xdpi = " + getResources().getDisplayMetrics().xdpi);
//        t.append("\n getDisplayMetrics().ydpi = " + getResources().getDisplayMetrics().ydpi);
//        t.append("\n getDisplayMetrics().heightPixels = " + getResources().getDisplayMetrics().heightPixels);
//        t.append("\n getDisplayMetrics().widthPixels = " + getResources().getDisplayMetrics().widthPixels);
//
//        // show what the masks look like for layout size
//        t.append("\n\n screenLayout (HEX) = " + (Integer.toHexString(view.getContext().getResources().getConfiguration().screenLayout)));
//        t.append("\n SCREENLAYOUT_SIZE_MASK (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_MASK)));
//        t.append("\n SCREENLAYOUT_LONG_MASK  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_MASK)));
//        t.append("\n SCREENLAYOUT_SIZE_SMALL (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_SMALL)));
//        t.append("\n SCREENLAYOUT_SIZE_NORMAL (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_NORMAL)));
//        t.append("\n SCREENLAYOUT_SIZE_LARGE (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_LARGE)));
//
//        // Get the layout and mask with size
//        int screenLayout = view.getContext().getResources().getConfiguration().screenLayout;
//        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;
//        t.append("\n screenLayout & size mask (HEX) = " + (Integer.toHexString((screenLayout))));
//
//        // Get the layout (again) and mask with long bit of layout
//        t.append("\n\n SCREENLAYOUT_LONG_MASK  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_MASK)));
//        t.append("\n SCREENLAYOUT_LONG_NO  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_NO)));
//        t.append("\n SCREENLAYOUT_LONG_UNDEFINED   (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_UNDEFINED)));
//        t.append("\n  SCREENLAYOUT_LONG_YES   (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_YES)));
//
//        // Now get the layout (again) and mask with size
//        screenLayout = view.getContext().getResources().getConfiguration().screenLayout;
//        screenLayout &= Configuration.SCREENLAYOUT_LONG_MASK;
//        t.append("\n screenLayout & long mask (HEX) = " + (Integer.toHexString((screenLayout))));
//
//    }
//
//    // Use bitmasks to determine screen size
//    private static String getSizeName(Context context) {
//        int screenLayout = context.getResources().getConfiguration().screenLayout;
//        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;
//
//        switch (screenLayout) {
//            case Configuration.SCREENLAYOUT_SIZE_SMALL:
//                return "small";
//            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
//                return "normal";
//            case Configuration.SCREENLAYOUT_SIZE_LARGE:
//                return "large";
//            case 4: // Configuration.SCREENLAYOUT_SIZE_XLARGE is API >= 9
//                return "xlarge";
//            default:
//                return "undefined";
//        }
//    }

}