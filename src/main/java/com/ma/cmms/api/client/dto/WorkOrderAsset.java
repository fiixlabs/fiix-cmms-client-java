package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'WorkOrderAsset' table.
 * @generated
 */
public class WorkOrderAsset extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
	private java.lang.Long intUpdated;
	private java.lang.Long intWorkOrderID;
		

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
	 * Gets the value of the 'intUpdated' field.
	 */
	public java.lang.Long getIntUpdated()
	{
		return intUpdated;
	}

	/**
	 * Sets the value of the 'intUpdated' field.
	 */
	public void setIntUpdated(java.lang.Long intUpdated)
	{
		this.intUpdated = intUpdated;
	}

	/**
	 * Gets the value of the 'intWorkOrderID' field.
	 */
	public java.lang.Long getIntWorkOrderID()
	{
		return intWorkOrderID;
	}

	/**
	 * Sets the value of the 'intWorkOrderID' field.
	 */
	public void setIntWorkOrderID(java.lang.Long intWorkOrderID)
	{
		this.intWorkOrderID = intWorkOrderID;
	}
}
