package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public EditText editText;
	public TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//给Activity窗口设置视图名称，布局文件
//		setContentView(R.layout.mytest);
		setContentView(R.layout.activity_main);
		
		Log.i("==================", "onCreate");
		
		//调用findViewById通过id获取view组件
		editText = (EditText)findViewById(R.id.inputEdit);
		tv = (TextView)findViewById(R.id.showView);
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("==================", "onStart");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("==================", "onResume");
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("==================", "onPause");
	}
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("==================", "onRestart");
	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("==================", "onStop");
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("==================", "onDestroy");
	}
	/**
	 * 点击按钮触发该方法，该方法写法只有方法名和布局文件中android:onClick="myClick"值一致。其余写法固定
	 * @param v
	 */
	public void myClick(View v){
		//1获取输入框EditText中输入的值
		String inputValue = editText.getText().toString();
		//2将该值放入到文本输出框中TextView
		tv.setText(inputValue);
	}

}
