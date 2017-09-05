package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ScheduledMaintenanceBusiness' table.
 * @generated
 */
public class ScheduledMaintenanceBusiness extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetBusinessID;
	private java.lang.Long intAssetID;
	private java.lang.Long intBusinessGroupID;
	private java.lang.Long intBusinessID;
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
	 * Gets the value of the 'intAssetBusinessID' field.
	 */
	public java.lang.Long getIntAssetBusinessID()
	{
		return intAssetBusinessID;
	}

	/**
	 * Sets the value of the 'intAssetBusinessID' field.
	 */
	public void setIntAssetBusinessID(java.lang.Long intAssetBusinessID)
	{
		this.intAssetBusinessID = intAssetBusinessID;
	}

	/**
	 * Gets the value of the 'intAssetID' field.
	 */
	public java.lang.Long getIntAssetID()
	{
		return intAssetID;
	}

	/**
	 * Sets the value of the 'intAssetID' field.
	 */
	public void setIntAssetID(java.lang.Long intAssetID)
	{
		this.intAssetID = intAssetID;
	}

	/**
	 * Gets the value of the 'intBusinessGroupID' field.
	 */
	public java.lang.Long getIntBusinessGroupID()
	{
		return intBusinessGroupID;
	}

	/**
	 * Sets the value of the 'intBusinessGroupID' field.
	 */
	public void setIntBusinessGroupID(java.lang.Long intBusinessGroupID)
	{
		this.intBusinessGroupID = intBusinessGroupID;
	}

	/**
	 * Gets the value of the 'intBusinessID' field.
	 */
	public java.lang.Long getIntBusinessID()
	{
		return intBusinessID;
	}

	/**
	 * Sets the value of the 'intBusinessID' field.
	 */
	public void setIntBusinessID(java.lang.Long intBusinessID)
	{
		this.intBusinessID = intBusinessID;
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
