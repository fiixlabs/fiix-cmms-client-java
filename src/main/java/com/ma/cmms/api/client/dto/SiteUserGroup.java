package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'SiteUserGroup' table.
 * @generated
 */
public class SiteUserGroup extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intGroupID;
	private java.lang.Long intSiteUserID;
		

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
	 * Gets the value of the 'intSiteUserID' field.
	 */
	public java.lang.Long getIntSiteUserID()
	{
		return intSiteUserID;
	}

	/**
	 * Sets the value of the 'intSiteUserID' field.
	 */
	public void setIntSiteUserID(java.lang.Long intSiteUserID)
	{
		this.intSiteUserID = intSiteUserID;
	}
}
