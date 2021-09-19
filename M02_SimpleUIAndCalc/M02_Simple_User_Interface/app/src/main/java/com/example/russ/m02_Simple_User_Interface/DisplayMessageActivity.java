package com.example.russ.m02_Simple_User_Interface;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        try {
//            Thread.sleep(10000);


        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_message);

        // Receive the Intent, get the message
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);

        // Set color of container
        switch (message) {
            case "red":
                textView.setBackgroundColor(Color.RED);
                break;
            case "white":
                textView.setBackgroundColor(Color.WHITE);
                break;
            case "blue":
                textView.setBackgroundColor(Color.BLUE);
                break;
            case "cyan":
                textView.setBackgroundColor(Color.CYAN);
                break;
            case "green":
                textView.setBackgroundColor(Color.GREEN);
                break;
            case "tim":
                textView.setBackgroundColor(Color.YELLOW);
                textView.setText("Dear Russ,\n I hope this Android Studio message finds you well,\n I am disquieted to be missing the sight of little Pumpkin growing into a sophisticated young feline. ");
                break;
            default: // Color not found...just use dark gray
                textView.setBackgroundColor(Color.DKGRAY);
        }
//
//        // Add to the text
//        //textView.setText(message + "\n\n  AHA!!!!  I have changed the text colour!!!");
//
//
//        // Start logging stuff we can find out
//        Log.v("SimpleUserInterface", " getGravity =>" + Integer.toHexString(textView.getGravity()));
//        Log.v("SimpleUserInterface", " getCurrentTextColor =>" + Integer.toHexString(textView.getCurrentTextColor()));
//        Log.v("SimpleUserInterface", " getSolidColor =>" + Integer.toHexString(textView.getSolidColor()));
//        Log.v("SimpleUserInterface", " getMaxLines =>" + textView.getMaxLines());
//        Log.v("SimpleUserInterface", " getLineHeight =>" + textView.getLineHeight());
        Log.v("SimpleUserInterface", " getText =>" + textView.getText());
//        Log.v("SimpleUserInterface", " getText.length =>" + textView.getText().length());

//        try {
//            Thread.sleep(1000);
//        } catch (java.lang.InterruptedException e) {
//            Log.v("SimpleUserInterface", "java.lang.InterruptedException: " + e.getMessage());
//        }

//        } catch (java.lang.InterruptedException e) {
//            Log.v("SimpleUserInterface", "java.lang.InterruptedException: " + e.getMessage());
//        }
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_display_message, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
