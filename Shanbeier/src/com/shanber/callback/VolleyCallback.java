package com.shanber.callback;

import com.android.volley.VolleyError;

/**
 * @author ctt:
 * @version ����ʱ�䣺2016��5��2�� 
 * ��˵��
 */
public interface VolleyCallback {
	public void success(String success);
	public void fail(VolleyError fail);
}
