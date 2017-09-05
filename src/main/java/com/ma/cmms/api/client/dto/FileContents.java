package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'FileContents' table.
 * @generated
 */
public class FileContents extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intSysCode;
	private java.lang.Long intIsShared;
	private java.lang.Long intSize;
	private java.lang.String strContents;
	private java.lang.String strMimeType;
	private java.lang.String strName;
		

	/**
	 * Gets the value of the 'id' field.
	 */
	public java.lang.Long getId()
	{
		return id;
	}

	/**
	 * Sets the value of the 'id' field.
	 */
	public void setId(java.lang.Long id)
	{
		this.id = id;
	}

	/**
	 * Gets the value of the 'intSysCode' field.
	 */
	public java.lang.Long getIntSysCode()
	{
		return intSysCode;
	}

	/**
	 * Sets the value of the 'intSysCode' field.
	 */
	public void setIntSysCode(java.lang.Long intSysCode)
	{
		this.intSysCode = intSysCode;
	}

	/**
	 * Gets the value of the 'intIsShared' field.
	 */
	public java.lang.Long getIntIsShared()
	{
		return intIsShared;
	}

	/**
	 * Sets the value of the 'intIsShared' field.
	 */
	public void setIntIsShared(java.lang.Long intIsShared)
	{
		this.intIsShared = intIsShared;
	}

	/**
	 * Gets the value of the 'intSize' field.
	 */
	public java.lang.Long getIntSize()
	{
		return intSize;
	}

	/**
	 * Sets the value of the 'intSize' field.
	 */
	public void setIntSize(java.lang.Long intSize)
	{
		this.intSize = intSize;
	}

	/**
	 * Gets the value of the 'strContents' field.
	 */
	public java.lang.String getStrContents()
	{
		return strContents;
	}

	/**
	 * Sets the value of the 'strContents' field.
	 */
	public void setStrContents(java.lang.String strContents)
	{
		this.strContents = strContents;
	}

	/**
	 * Gets the value of the 'strMimeType' field.
	 */
	public java.lang.String getStrMimeType()
	{
		return strMimeType;
	}

	/**
	 * Sets the value of the 'strMimeType' field.
	 */
	public void setStrMimeType(java.lang.String strMimeType)
	{
		this.strMimeType = strMimeType;
	}

	/**
	 * Gets the value of the 'strName' field.
	 */
	public java.lang.String getStrName()
	{
		return strName;
	}

	/**
	 * Sets the value of the 'strName' field.
	 */
	public void setStrName(java.lang.String strName)
	{
		this.strName = strName;
	}
}
