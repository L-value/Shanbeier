package com.shanbeier.utils;


import java.util.HashMap;
import java.util.Map;

import android.media.MediaRouter.VolumeCallback;

import com.android.volley.AuthFailureError;
import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.shanber.callback.VolleyCallback;
import com.shanber.constant.Constant;

/**
 * @author ctt:
 * @version 创建时间：2016年5月2日
 * 类说明
 */
public class VolleyHelper {
	private VolleyCallback callback;
	
	public VolleyHelper(VolleyCallback callback) {
		super();
		this.callback = callback;
	}

	public VolleyHelper() {
	// TODO Auto-generated constructor stub
	}

	public StringRequest excute(String url,int method){
		StringRequest request = 
				new StringRequest(method,url+"?access_token="+Constant.TOKEN, new Response.Listener<String>() {

					@Override
					public void onResponse(String arg0) {
						callback.success(arg0);
						
					}
				}, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError arg0) {
						callback.fail(arg0);
					}
				}){
			@Override
			public Map<String, String> getHeaders()
					throws AuthFailureError {
				//Map<String, String> header = new HashMap<>();
				//header.put("Authorization", Constant.TOKEN);
				return super.getHeaders();
			}
		};
		
		return request;
	}
}
