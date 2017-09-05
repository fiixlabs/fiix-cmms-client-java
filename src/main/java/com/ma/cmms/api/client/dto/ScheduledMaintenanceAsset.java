package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ScheduledMaintenanceAsset' table.
 * @generated
 */
public class ScheduledMaintenanceAsset extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
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
