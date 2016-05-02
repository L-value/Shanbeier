package com.lottery.common;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.content.Context;
import android.media.audiofx.Equalizer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

public abstract class BaseActivity extends FragmentActivity
{
	public BaseApplication baseApplication;
	protected static RequestQueue mQueue;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		baseApplication = BaseApplication.getInstance();
		if (mQueue == null) {
			mQueue = Volley.newRequestQueue(this);
		}
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView();
		initView();
		initListener();
		initData();
	}
	public abstract void setContentView();
	public abstract void initView();
	public abstract void initListener();
	public abstract void initData();
	  /**
     * 妫�煡褰撳墠缃戠粶鏄惁鍙敤
     */
    public boolean isNetworkAvailable(Activity activity)
    {
        Context context = activity.getApplicationContext();
        // 鑾峰彇鎵嬫満鎵�湁杩炴帴绠＄悊瀵硅薄锛堝寘鎷wi-fi,net绛夎繛鎺ョ殑绠＄悊锛�
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager == null)
        {
            return false;
        }
        else
        {
            // 鑾峰彇NetworkInfo瀵硅薄
            NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();

            if (networkInfo != null && networkInfo.length > 0)
            {
                for (int i = 0; i < networkInfo.length; i++)
                {
                    System.out.println(i + "===鐘舵�===" + networkInfo[i].getState());
                    System.out.println(i + "===绫诲瀷===" + networkInfo[i].getTypeName());
                    // 鍒ゆ柇褰撳墠缃戠粶鐘舵�鏄惁涓鸿繛鎺ョ姸鎬�
                    if (networkInfo[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
	
	

    //隐藏软键盘
    void closeInputMethod(Activity activity){
        /*隐藏软键盘*/
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if(inputMethodManager.isActive()){
            if(activity.getCurrentFocus()!=null){
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }

    
}
