package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ScheduledMaintenancePart' table.
 * @generated
 */
public class ScheduledMaintenancePart extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
	private java.lang.Long intPartID;
	private java.lang.Long intScheduledMaintenanceID;
	private java.lang.Long intStockID;
	private java.lang.Double qtySuggestedQuantity;
		

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
	 * Gets the value of the 'intPartID' field.
	 */
	public java.lang.Long getIntPartID()
	{
		return intPartID;
	}

	/**
	 * Sets the value of the 'intPartID' field.
	 */
	public void setIntPartID(java.lang.Long intPartID)
	{
		this.intPartID = intPartID;
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

	/**
	 * Gets the value of the 'intStockID' field.
	 */
	public java.lang.Long getIntStockID()
	{
		return intStockID;
	}

	/**
	 * Sets the value of the 'intStockID' field.
	 */
	public void setIntStockID(java.lang.Long intStockID)
	{
		this.intStockID = intStockID;
	}

	/**
	 * Gets the value of the 'qtySuggestedQuantity' field.
	 */
	public java.lang.Double getQtySuggestedQuantity()
	{
		return qtySuggestedQuantity;
	}

	/**
	 * Sets the value of the 'qtySuggestedQuantity' field.
	 */
	public void setQtySuggestedQuantity(java.lang.Double qtySuggestedQuantity)
	{
		this.qtySuggestedQuantity = qtySuggestedQuantity;
	}
}
