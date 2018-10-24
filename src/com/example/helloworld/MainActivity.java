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
		//��Activity����������ͼ���ƣ������ļ�
//		setContentView(R.layout.mytest);
		setContentView(R.layout.activity_main);
		
		Log.i("==================", "onCreate");
		
		//����findViewByIdͨ��id��ȡview���
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
	 * �����ť�����÷������÷���д��ֻ�з������Ͳ����ļ���android:onClick="myClick"ֵһ�¡�����д���̶�
	 * @param v
	 */
	public void myClick(View v){
		//1��ȡ�����EditText�������ֵ
		String inputValue = editText.getText().toString();
		//2����ֵ���뵽�ı��������TextView
		tv.setText(inputValue);
	}

}
