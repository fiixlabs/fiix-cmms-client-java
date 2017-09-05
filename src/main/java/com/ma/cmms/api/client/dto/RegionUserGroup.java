package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'RegionUserGroup' table.
 * @generated
 */
public class RegionUserGroup extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intGroupID;
	private java.lang.Long intRegionUserID;
		

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
	 * Gets the value of the 'intGroupID' field.
	 */
	public java.lang.Long getIntGroupID()
	{
		return intGroupID;
	}

	/**
	 * Sets the value of the 'intGroupID' field.
	 */
	public void setIntGroupID(java.lang.Long intGroupID)
	{
		this.intGroupID = intGroupID;
	}

	/**
	 * Gets the value of the 'intRegionUserID' field.
	 */
	public java.lang.Long getIntRegionUserID()
	{
		return intRegionUserID;
	}

	/**
	 * Sets the value of the 'intRegionUserID' field.
	 */
	public void setIntRegionUserID(java.lang.Long intRegionUserID)
	{
		this.intRegionUserID = intRegionUserID;
	}
}
