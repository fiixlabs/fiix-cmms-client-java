package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'RegionUser' table.
 * @generated
 */
public class RegionUser extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intRegionID;
	private java.lang.Long intUserID;
		

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
	 * Gets the value of the 'intRegionID' field.
	 */
	public java.lang.Long getIntRegionID()
	{
		return intRegionID;
	}

	/**
	 * Sets the value of the 'intRegionID' field.
	 */
	public void setIntRegionID(java.lang.Long intRegionID)
	{
		this.intRegionID = intRegionID;
	}

	/**
	 * Gets the value of the 'intUserID' field.
	 */
	public java.lang.Long getIntUserID()
	{
		return intUserID;
	}

	/**
	 * Sets the value of the 'intUserID' field.
	 */
	public void setIntUserID(java.lang.Long intUserID)
	{
		this.intUserID = intUserID;
	}
}
