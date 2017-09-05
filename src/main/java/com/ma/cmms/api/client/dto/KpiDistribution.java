package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'KpiDistribution' table.
 * @generated
 */
public class KpiDistribution extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblValue;
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
	 * Gets the value of the 'dblValue' field.
	 */
	public java.lang.Double getDblValue()
	{
		return dblValue;
	}

	/**
	 * Sets the value of the 'dblValue' field.
	 */
	public void setDblValue(java.lang.Double dblValue)
	{
		this.dblValue = dblValue;
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
