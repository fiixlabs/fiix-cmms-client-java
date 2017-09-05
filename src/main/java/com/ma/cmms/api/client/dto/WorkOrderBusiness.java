package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'WorkOrderBusiness' table.
 * @generated
 */
public class WorkOrderBusiness extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
	private java.lang.Long intBusinessGroupID;
	private java.lang.Long intBusinessID;
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
