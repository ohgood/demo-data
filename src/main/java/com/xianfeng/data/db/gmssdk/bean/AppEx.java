package com.xianfeng.data.db.gmssdk.bean;

import java.io.Serializable;


@SuppressWarnings("serial")
public class AppEx implements Serializable {
	
	
	private int appId;
	
	private String name;
	
	private String value;
	
	
	public void setAppId(int appId)
	{
		this.appId = appId;
	}
	
	public int getAppId()
	{
		return this.appId;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return this.value;
	}
	

}
