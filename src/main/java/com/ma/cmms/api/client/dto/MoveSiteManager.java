package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'MoveSiteManager' table.
 * @generated
 */
public class MoveSiteManager extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intSiteID;
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
	 * Gets the value of the 'intSiteID' field.
	 */
	public java.lang.Long getIntSiteID()
	{
		return intSiteID;
	}

	/**
	 * Sets the value of the 'intSiteID' field.
	 */
	public void setIntSiteID(java.lang.Long intSiteID)
	{
		this.intSiteID = intSiteID;
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
