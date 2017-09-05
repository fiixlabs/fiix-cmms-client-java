package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'DashboardDashboardPersona' table.
 * @generated
 */
public class DashboardDashboardPersona extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intDashboardID;
	private java.lang.Long intDashboardPersonaID;
		

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
	 * Gets the value of the 'intDashboardID' field.
	 */
	public java.lang.Long getIntDashboardID()
	{
		return intDashboardID;
	}

	/**
	 * Sets the value of the 'intDashboardID' field.
	 */
	public void setIntDashboardID(java.lang.Long intDashboardID)
	{
		this.intDashboardID = intDashboardID;
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
}
