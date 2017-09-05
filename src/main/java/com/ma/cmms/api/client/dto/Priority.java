package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'Priority' table.
 * @generated
 */
public class Priority extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intSysCode;
	private java.lang.Long intOrder;
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
	 * Gets the value of the 'intOrder' field.
	 */
	public java.lang.Long getIntOrder()
	{
		return intOrder;
	}

	/**
	 * Sets the value of the 'intOrder' field.
	 */
	public void setIntOrder(java.lang.Long intOrder)
	{
		this.intOrder = intOrder;
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
