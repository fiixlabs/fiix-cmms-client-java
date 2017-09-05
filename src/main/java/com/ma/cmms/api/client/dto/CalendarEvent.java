package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'CalendarEvent' table.
 * @generated
 */
public class CalendarEvent extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDate;
	private java.lang.Long intScheduleTriggerID;
	private java.lang.Long intScheduledMaintenanceID;
		

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
	 * Gets the value of the 'dtmDate' field.
	 */
	public java.util.Date getDtmDate()
	{
		return dtmDate;
	}

	/**
	 * Sets the value of the 'dtmDate' field.
	 */
	public void setDtmDate(java.util.Date dtmDate)
	{
		this.dtmDate = dtmDate;
	}

	/**
	 * Gets the value of the 'intScheduleTriggerID' field.
	 */
	public java.lang.Long getIntScheduleTriggerID()
	{
		return intScheduleTriggerID;
	}

	/**
	 * Sets the value of the 'intScheduleTriggerID' field.
	 */
	public void setIntScheduleTriggerID(java.lang.Long intScheduleTriggerID)
	{
		this.intScheduleTriggerID = intScheduleTriggerID;
	}

	/**
	 * Gets the value of the 'intScheduledMaintenanceID' field.
	 */
	public java.lang.Long getIntScheduledMaintenanceID()
	{
		return intScheduledMaintenanceID;
	}

	/**
	 * Sets the value of the 'intScheduledMaintenanceID' field.
	 */
	public void setIntScheduledMaintenanceID(java.lang.Long intScheduledMaintenanceID)
	{
		this.intScheduledMaintenanceID = intScheduledMaintenanceID;
	}
}
