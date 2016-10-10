package com.example.jnitestdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {
	static {
		//º”‘ÿJNIø‚
		System.loadLibrary("NewJNI");
	}
	private TextView textview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Jni jni = new Jni();
		int result = jni.add();
		textview = (TextView) findViewById(R.id.tv);
		textview.setText("add()=" + result + "\ngetString()=" + jni.getString());
	}
	
}
