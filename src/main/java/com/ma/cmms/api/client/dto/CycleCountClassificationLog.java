package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'CycleCountClassificationLog' table.
 * @generated
 */
public class CycleCountClassificationLog extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateApplied;
	private java.lang.Long intSiteID;
		

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
	 * Gets the value of the 'dtmDateApplied' field.
	 */
	public java.util.Date getDtmDateApplied()
	{
		return dtmDateApplied;
	}

	/**
	 * Sets the value of the 'dtmDateApplied' field.
	 */
	public void setDtmDateApplied(java.util.Date dtmDateApplied)
	{
		this.dtmDateApplied = dtmDateApplied;
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
}
