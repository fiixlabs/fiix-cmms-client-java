package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetEventType' table.
 * @generated
 */
public class AssetEventType extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.String strEventCode;
	private java.lang.String strEventDescription;
	private java.lang.String strEventName;
		

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
	 * Gets the value of the 'strEventCode' field.
	 */
	public java.lang.String getStrEventCode()
	{
		return strEventCode;
	}

	/**
	 * Sets the value of the 'strEventCode' field.
	 */
	public void setStrEventCode(java.lang.String strEventCode)
	{
		this.strEventCode = strEventCode;
	}

	/**
	 * Gets the value of the 'strEventDescription' field.
	 */
	public java.lang.String getStrEventDescription()
	{
		return strEventDescription;
	}

	/**
	 * Sets the value of the 'strEventDescription' field.
	 */
	public void setStrEventDescription(java.lang.String strEventDescription)
	{
		this.strEventDescription = strEventDescription;
	}

	/**
	 * Gets the value of the 'strEventName' field.
	 */
	public java.lang.String getStrEventName()
	{
		return strEventName;
	}

	/**
	 * Sets the value of the 'strEventName' field.
	 */
	public void setStrEventName(java.lang.String strEventName)
	{
		this.strEventName = strEventName;
	}
}
