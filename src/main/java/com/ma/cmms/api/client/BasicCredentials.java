package com.ma.cmms.api.client;

public class BasicCredentials implements Credentials
{
	private String accessKey;
	private String secretKey;
	private String appKey;

	public BasicCredentials(String appKey, String accessKey, String secretKey)
	{
		this.appKey = appKey;
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}

	@Override
	public String getAccessKey()
	{
		return accessKey;
	}

	public void setAccessKey(String accessKey)
	{
		this.accessKey = accessKey;
	}

	@Override
	public String getSecretKey()
	{
		return secretKey;
	}

	public void setSecretKey(String secretKey)
	{
		this.secretKey = secretKey;
	}

	@Override
	public String getAppKey()
	{
		return appKey;
	}

	public void setAppKey(String appKey)
	{
		this.appKey = appKey;
	}
}
