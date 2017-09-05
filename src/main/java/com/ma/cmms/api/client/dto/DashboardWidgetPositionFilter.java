package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'DashboardWidgetPositionFilter' table.
 * @generated
 */
public class DashboardWidgetPositionFilter extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolActive;
	private java.lang.Long intSubQueryID;
	private java.lang.Long intWidgetPositionID;
		

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
	 * Gets the value of the 'bolActive' field.
	 */
	public java.lang.Long getBolActive()
	{
		return bolActive;
	}

	/**
	 * Sets the value of the 'bolActive' field.
	 */
	public void setBolActive(java.lang.Long bolActive)
	{
		this.bolActive = bolActive;
	}

	/**
	 * Gets the value of the 'intSubQueryID' field.
	 */
	public java.lang.Long getIntSubQueryID()
	{
		return intSubQueryID;
	}

	/**
	 * Sets the value of the 'intSubQueryID' field.
	 */
	public void setIntSubQueryID(java.lang.Long intSubQueryID)
	{
		this.intSubQueryID = intSubQueryID;
	}

	/**
	 * Gets the value of the 'intWidgetPositionID' field.
	 */
	public java.lang.Long getIntWidgetPositionID()
	{
		return intWidgetPositionID;
	}

	/**
	 * Sets the value of the 'intWidgetPositionID' field.
	 */
	public void setIntWidgetPositionID(java.lang.Long intWidgetPositionID)
	{
		this.intWidgetPositionID = intWidgetPositionID;
	}
}
