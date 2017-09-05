package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'UserGroupDashboardPersona' table.
 * @generated
 */
public class UserGroupDashboardPersona extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intDashboardPersonaID;
	private java.lang.Long intUserGroupID;
		

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
	 * Gets the value of the 'intDashboardPersonaID' field.
	 */
	public java.lang.Long getIntDashboardPersonaID()
	{
		return intDashboardPersonaID;
	}

	/**
	 * Sets the value of the 'intDashboardPersonaID' field.
	 */
	public void setIntDashboardPersonaID(java.lang.Long intDashboardPersonaID)
	{
		this.intDashboardPersonaID = intDashboardPersonaID;
	}

	/**
	 * Gets the value of the 'intUserGroupID' field.
	 */
	public java.lang.Long getIntUserGroupID()
	{
		return intUserGroupID;
	}

	/**
	 * Sets the value of the 'intUserGroupID' field.
	 */
	public void setIntUserGroupID(java.lang.Long intUserGroupID)
	{
		this.intUserGroupID = intUserGroupID;
	}
}
