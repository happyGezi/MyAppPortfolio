package com.gezi.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btnBigger;
	private Button btnCapstone;
	private Button btnHawk;
	private Button btnMaterial;
	private Button btnMvies;
	private Button btnUbiquitous;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		bindEvents();
	}

	/**
	 * 绑定事件
	 */
	private void bindEvents() {
		btnBigger.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//TODO 跳转到相应的APP
				showHint((Button) v);
			}
		});
		btnCapstone.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//TODO 跳转到相应的APP
				showHint((Button) v);
			}
		});
		btnHawk.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//TODO 跳转到相应的APP
				showHint((Button) v);
			}
		});
		btnMaterial.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//TODO 跳转到相应的APP
				showHint((Button) v);
			}
		});
		btnMvies.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//TODO 跳转到相应的APP
				showHint((Button) v);
			}
		});
		btnUbiquitous.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//TODO 跳转到相应的APP
				showHint((Button) v);
			}
		});
	}

	/**
	 * 弹出提示
	 *
	 * @param v
	 */
	private void showHint(Button v) {
		Button btn = v;
		String hint = btn.getText().toString().toLowerCase();
		Toast.makeText(MainActivity.this, "This button will launch my " + hint + " app!", Toast.LENGTH_SHORT).show();
	}

	/**
	 * 初始化控件
	 */
	private void initView() {
		btnBigger = (Button) findViewById(R.id.btnBigger);
		btnCapstone = (Button) findViewById(R.id.btnCapstone);
		btnHawk = (Button) findViewById(R.id.btnHawk);
		btnMaterial = (Button) findViewById(R.id.btnMaterial);
		btnMvies = (Button) findViewById(R.id.btnMvies);
		btnUbiquitous = (Button) findViewById(R.id.btnUbiquitous);
	}
}
