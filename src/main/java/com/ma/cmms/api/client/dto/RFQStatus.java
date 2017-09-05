package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'RFQStatus' table.
 * @generated
 */
public class RFQStatus extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intSysCode;
	private java.lang.Long intControlID;
	private java.lang.String strDefaultLabel;
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
	 * Gets the value of the 'intControlID' field.
	 */
	public java.lang.Long getIntControlID()
	{
		return intControlID;
	}

	/**
	 * Sets the value of the 'intControlID' field.
	 */
	public void setIntControlID(java.lang.Long intControlID)
	{
		this.intControlID = intControlID;
	}

	/**
	 * Gets the value of the 'strDefaultLabel' field.
	 */
	public java.lang.String getStrDefaultLabel()
	{
		return strDefaultLabel;
	}

	/**
	 * Sets the value of the 'strDefaultLabel' field.
	 */
	public void setStrDefaultLabel(java.lang.String strDefaultLabel)
	{
		this.strDefaultLabel = strDefaultLabel;
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
