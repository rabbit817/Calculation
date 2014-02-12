package com.example.calculation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class result extends Activity{

	private TextView myTextView=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		
		Intent intent=getIntent();
		int defaultValue=0;
		int Value = intent.getIntExtra("testIntent", defaultValue);
		myTextView=(TextView)findViewById(R.id.myTextView);
		myTextView.setText(Value+"");
	}

}
