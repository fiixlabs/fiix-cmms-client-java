package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ReportsToResolved' table.
 * @generated
 */
public class ReportsToResolved extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intChildID;
	private java.lang.Long intParentID;
		

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
	 * Gets the value of the 'intChildID' field.
	 */
	public java.lang.Long getIntChildID()
	{
		return intChildID;
	}

	/**
	 * Sets the value of the 'intChildID' field.
	 */
	public void setIntChildID(java.lang.Long intChildID)
	{
		this.intChildID = intChildID;
	}

	/**
	 * Gets the value of the 'intParentID' field.
	 */
	public java.lang.Long getIntParentID()
	{
		return intParentID;
	}

	/**
	 * Sets the value of the 'intParentID' field.
	 */
	public void setIntParentID(java.lang.Long intParentID)
	{
		this.intParentID = intParentID;
	}
}
