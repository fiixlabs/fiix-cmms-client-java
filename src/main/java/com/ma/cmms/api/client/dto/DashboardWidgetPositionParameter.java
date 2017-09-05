package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'DashboardWidgetPositionParameter' table.
 * @generated
 */
public class DashboardWidgetPositionParameter extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intDashboardWidgetParameterID;
	private java.lang.Long intWidgetPositionID;
	private java.lang.String strParamValue;
		

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
	 * Gets the value of the 'intDashboardWidgetParameterID' field.
	 */
	public java.lang.Long getIntDashboardWidgetParameterID()
	{
		return intDashboardWidgetParameterID;
	}

	/**
	 * Sets the value of the 'intDashboardWidgetParameterID' field.
	 */
	public void setIntDashboardWidgetParameterID(java.lang.Long intDashboardWidgetParameterID)
	{
		this.intDashboardWidgetParameterID = intDashboardWidgetParameterID;
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

	/**
	 * Gets the value of the 'strParamValue' field.
	 */
	public java.lang.String getStrParamValue()
	{
		return strParamValue;
	}

	/**
	 * Sets the value of the 'strParamValue' field.
	 */
	public void setStrParamValue(java.lang.String strParamValue)
	{
		this.strParamValue = strParamValue;
	}
}
