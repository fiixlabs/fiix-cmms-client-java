package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'TaskFile' table.
 * @generated
 */
public class TaskFile extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intFileID;
	private java.lang.Long intOrder;
	private java.lang.Long intTaskID;
		

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
	 * Gets the value of the 'intFileID' field.
	 */
	public java.lang.Long getIntFileID()
	{
		return intFileID;
	}

	/**
	 * Sets the value of the 'intFileID' field.
	 */
	public void setIntFileID(java.lang.Long intFileID)
	{
		this.intFileID = intFileID;
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
	 * Gets the value of the 'intTaskID' field.
	 */
	public java.lang.Long getIntTaskID()
	{
		return intTaskID;
	}

	/**
	 * Sets the value of the 'intTaskID' field.
	 */
	public void setIntTaskID(java.lang.Long intTaskID)
	{
		this.intTaskID = intTaskID;
	}
}
