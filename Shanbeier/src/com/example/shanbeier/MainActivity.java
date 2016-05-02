package com.example.shanbeier;

import android.widget.TextView;

import com.android.volley.Request.Method;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lottery.common.BaseActivity;
import com.shanbeier.utils.VolleyHelper;
import com.shanber.bean.UserInfo;
import com.shanber.callback.VolleyCallback;
import com.shanber.constant.Constant;

public class MainActivity extends BaseActivity {

	private TextView hello;
	private VolleyHelper helper;
	
	
	@Override
	public void setContentView() {
		setContentView(R.layout.activity_main);
	}

	@Override
	public void initView() {
		hello = (TextView) findViewById(R.id.hello);
	}

	@Override
	public void initListener() {
		helper = new VolleyHelper(new VolleyCallback() {
			
			@Override
			public void success(String success) {
				System.out.println("success"+success);
				Gson gson = new Gson();
				try {
					UserInfo userInfo = gson.fromJson(success, new TypeToken<UserInfo>() {
					}.getType());
					hello.setText(userInfo.toString());
				} catch (Exception e) {
					hello.setText("==¡£");
				}
			}
			
			@Override
			public void fail(VolleyError fail) {
				System.out.println("fail"+fail.getMessage());
				hello.setText(fail.getMessage());
			}
		});
	}

	@Override
	public void initData() {
		//System.out.println(mQueue.toString());
		mQueue.add(helper.excute(Constant.GET_USER_INFO, Method.GET));
	}

	
}
