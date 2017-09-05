package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'PurchaseOrder' table.
 * @generated
 */
public class PurchaseOrder extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intPurchaseOrderStatusID;
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
	 * Gets the value of the 'intPurchaseOrderStatusID' field.
	 */
	public java.lang.Long getIntPurchaseOrderStatusID()
	{
		return intPurchaseOrderStatusID;
	}

	/**
	 * Sets the value of the 'intPurchaseOrderStatusID' field.
	 */
	public void setIntPurchaseOrderStatusID(java.lang.Long intPurchaseOrderStatusID)
	{
		this.intPurchaseOrderStatusID = intPurchaseOrderStatusID;
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
