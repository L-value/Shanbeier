package com.lottery.common;

import java.util.ArrayList;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import android.app.Application;

public class BaseApplication extends Application
{
	public static BaseApplication application = null;
	private static ArrayList<BaseActivity> activities = new ArrayList<>();
	@Override
	public void onCreate()
	{
		super.onCreate();
	}
	private BaseApplication()
	{
		
	}
	public static BaseApplication getInstance()
	{
		synchronized (Application.class)
		{
			if (application == null)
			{
				application = new BaseApplication();
			}	
		}
		return application;
	}
	public  ArrayList<BaseActivity> getActivities()
	{
		return activities;
	}
	public void addActivity(BaseActivity activity)
	{
		activities.add(activity);
	}
	public void exit(){
		for (BaseActivity activity : activities)
		{
			activity.finish();
		}
	}



}
