package com.example.calculation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private Button myButton=null;
	private EditText myEditView1=null;
	private EditText myEditView2=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myButton=(Button)findViewById(R.id.button1);
		myEditView1=(EditText)findViewById(R.id.editText1);
		myEditView2=(EditText)findViewById(R.id.editText2);
		myButton.setOnClickListener(new MyButtonListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.activity_main, menu);
		menu.add(0, 1, 1, R.string.exit);
		menu.add(0, 2, 2, R.string.about);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==1)
		{
			System.out.println("退出");
			finish();			
		}
		return super.onOptionsItemSelected(item);
	}

	class MyButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//生成一个Intent的对象
			int x=Integer.parseInt(myEditView1.getText().toString());
			int y=Integer.parseInt(myEditView2.getText().toString());
			int z=x*y;
			Intent intent =new Intent();
			intent.putExtra("testIntent", z);
			intent.setClass(MainActivity.this, result.class);
			MainActivity.this.startActivity(intent);

		}
	
	}
}
