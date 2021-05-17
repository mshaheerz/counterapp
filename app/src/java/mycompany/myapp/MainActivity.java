package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.service.autofill.*;
import java.util.*;
import android.widget.Button.*;
import android.widget.TextView.*;
import android.view.View.*;
import android.os.Bundle.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;public class MainActivity extends Activity 
{
	int mycountvalue = 0;
	Button btminus, btplus;
	TextView txcount,txreset;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		btminus = findViewById(R.id.btminus);
		btplus = findViewById(R.id.btplus);
		txcount = findViewById(R.id.txcount);
	    txreset = findViewById(R.id.txreset);
		btminus.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					if(mycountvalue!=0) {
						mycountvalue = mycountvalue - 1;
						txcount.setText(mycountvalue+"");
					}
					// Do something in response to button click
				}
			});

	    btplus.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					mycountvalue = mycountvalue + 1;
					txcount.setText(mycountvalue+"");
					// Do something in response to button click
				}
			});

		txreset.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					mycountvalue = 0;
					txcount.setText(mycountvalue+"");
					// Do something in response to button click
				}
			});

	}
}


