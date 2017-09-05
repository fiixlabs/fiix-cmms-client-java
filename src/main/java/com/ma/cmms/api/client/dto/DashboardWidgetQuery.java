package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'DashboardWidgetQuery' table.
 * @generated
 */
public class DashboardWidgetQuery extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intDashboardWidgetID;
	private java.lang.Long intSubQueryTypeID;
	private java.lang.String strLabel;
	private java.lang.String strQuery;
		

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
	 * Gets the value of the 'intDashboardWidgetID' field.
	 */
	public java.lang.Long getIntDashboardWidgetID()
	{
		return intDashboardWidgetID;
	}

	/**
	 * Sets the value of the 'intDashboardWidgetID' field.
	 */
	public void setIntDashboardWidgetID(java.lang.Long intDashboardWidgetID)
	{
		this.intDashboardWidgetID = intDashboardWidgetID;
	}

	/**
	 * Gets the value of the 'intSubQueryTypeID' field.
	 */
	public java.lang.Long getIntSubQueryTypeID()
	{
		return intSubQueryTypeID;
	}

	/**
	 * Sets the value of the 'intSubQueryTypeID' field.
	 */
	public void setIntSubQueryTypeID(java.lang.Long intSubQueryTypeID)
	{
		this.intSubQueryTypeID = intSubQueryTypeID;
	}

	/**
	 * Gets the value of the 'strLabel' field.
	 */
	public java.lang.String getStrLabel()
	{
		return strLabel;
	}

	/**
	 * Sets the value of the 'strLabel' field.
	 */
	public void setStrLabel(java.lang.String strLabel)
	{
		this.strLabel = strLabel;
	}

	/**
	 * Gets the value of the 'strQuery' field.
	 */
	public java.lang.String getStrQuery()
	{
		return strQuery;
	}

	/**
	 * Sets the value of the 'strQuery' field.
	 */
	public void setStrQuery(java.lang.String strQuery)
	{
		this.strQuery = strQuery;
	}
}
