package com.shanber.callback;

import com.android.volley.VolleyError;

/**
 * @author ctt:
 * @version 创建时间：2016年5月2日 
 * 类说明
 */
public interface VolleyCallback {
	public void success(String success);
	public void fail(VolleyError fail);
}
