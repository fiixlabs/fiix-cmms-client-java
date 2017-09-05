package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'MaintenanceType' table.
 * @generated
 */
public class MaintenanceType extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intSysCode;
	private java.lang.String strColor;
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
	 * Gets the value of the 'strColor' field.
	 */
	public java.lang.String getStrColor()
	{
		return strColor;
	}

	/**
	 * Sets the value of the 'strColor' field.
	 */
	public void setStrColor(java.lang.String strColor)
	{
		this.strColor = strColor;
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
