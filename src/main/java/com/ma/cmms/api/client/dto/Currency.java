package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'Currency' table.
 * @generated
 */
public class Currency extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.String strDescription;
	private java.lang.String strISOCode;
	private java.lang.String strName;
	private java.lang.String strSymbol;
		

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
	 * Gets the value of the 'strDescription' field.
	 */
	public java.lang.String getStrDescription()
	{
		return strDescription;
	}

	/**
	 * Sets the value of the 'strDescription' field.
	 */
	public void setStrDescription(java.lang.String strDescription)
	{
		this.strDescription = strDescription;
	}

	/**
	 * Gets the value of the 'strISOCode' field.
	 */
	public java.lang.String getStrISOCode()
	{
		return strISOCode;
	}

	/**
	 * Sets the value of the 'strISOCode' field.
	 */
	public void setStrISOCode(java.lang.String strISOCode)
	{
		this.strISOCode = strISOCode;
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

	/**
	 * Gets the value of the 'strSymbol' field.
	 */
	public java.lang.String getStrSymbol()
	{
		return strSymbol;
	}

	/**
	 * Sets the value of the 'strSymbol' field.
	 */
	public void setStrSymbol(java.lang.String strSymbol)
	{
		this.strSymbol = strSymbol;
	}
}
