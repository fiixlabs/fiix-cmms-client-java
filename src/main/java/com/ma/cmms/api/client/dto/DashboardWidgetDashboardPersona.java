package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'DashboardWidgetDashboardPersona' table.
 * @generated
 */
public class DashboardWidgetDashboardPersona extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intDashboardPersonaID;
	private java.lang.Long intWidgetID;
		

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
	 * Gets the value of the 'intWidgetID' field.
	 */
	public java.lang.Long getIntWidgetID()
	{
		return intWidgetID;
	}

	/**
	 * Sets the value of the 'intWidgetID' field.
	 */
	public void setIntWidgetID(java.lang.Long intWidgetID)
	{
		this.intWidgetID = intWidgetID;
	}
}
