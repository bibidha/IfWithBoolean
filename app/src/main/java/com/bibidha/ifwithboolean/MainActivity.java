package com.bibidha.ifwithboolean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        int x = 4;
        if (x == 4)/*== means equality, can use > or < etc. as well*/
        { x = x + 12;} // x is no 16

        TextView myTextView = new TextView(this);
        myTextView.setText("The answer of lesson 3 If test with Boolean   =  " + x);
        setContentView(myTextView);

    }
}
