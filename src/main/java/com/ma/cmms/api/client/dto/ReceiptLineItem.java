package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ReceiptLineItem' table.
 * @generated
 */
public class ReceiptLineItem extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblPurchasePricePerUnit;
	private java.lang.Double dblPurchasePriceTotal;
	private java.util.Date dtmDateExpiryOfInventoryItems;
	private java.lang.Long intAssetID;
	private java.lang.Long intParentReceiptLineItemID;
	private java.lang.Long intPurchaseOrderLineItemID;
	private java.lang.Long intReceiptID;
	private java.lang.Long intReceiveToFacilityID;
	private java.lang.Long intReceiveToStockID;
	private java.lang.Long intStockID;
	private java.lang.Double qtyQuantityOrdered;
	private java.lang.Double qtyQuantityReceived;
	private java.lang.String strDescription;
		

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
	 * Gets the value of the 'dblPurchasePricePerUnit' field.
	 */
	public java.lang.Double getDblPurchasePricePerUnit()
	{
		return dblPurchasePricePerUnit;
	}

	/**
	 * Sets the value of the 'dblPurchasePricePerUnit' field.
	 */
	public void setDblPurchasePricePerUnit(java.lang.Double dblPurchasePricePerUnit)
	{
		this.dblPurchasePricePerUnit = dblPurchasePricePerUnit;
	}

	/**
	 * Gets the value of the 'dblPurchasePriceTotal' field.
	 */
	public java.lang.Double getDblPurchasePriceTotal()
	{
		return dblPurchasePriceTotal;
	}

	/**
	 * Sets the value of the 'dblPurchasePriceTotal' field.
	 */
	public void setDblPurchasePriceTotal(java.lang.Double dblPurchasePriceTotal)
	{
		this.dblPurchasePriceTotal = dblPurchasePriceTotal;
	}

	/**
	 * Gets the value of the 'dtmDateExpiryOfInventoryItems' field.
	 */
	public java.util.Date getDtmDateExpiryOfInventoryItems()
	{
		return dtmDateExpiryOfInventoryItems;
	}

	/**
	 * Sets the value of the 'dtmDateExpiryOfInventoryItems' field.
	 */
	public void setDtmDateExpiryOfInventoryItems(java.util.Date dtmDateExpiryOfInventoryItems)
	{
		this.dtmDateExpiryOfInventoryItems = dtmDateExpiryOfInventoryItems;
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
	 * Gets the value of the 'intParentReceiptLineItemID' field.
	 */
	public java.lang.Long getIntParentReceiptLineItemID()
	{
		return intParentReceiptLineItemID;
	}

	/**
	 * Sets the value of the 'intParentReceiptLineItemID' field.
	 */
	public void setIntParentReceiptLineItemID(java.lang.Long intParentReceiptLineItemID)
	{
		this.intParentReceiptLineItemID = intParentReceiptLineItemID;
	}

	/**
	 * Gets the value of the 'intPurchaseOrderLineItemID' field.
	 */
	public java.lang.Long getIntPurchaseOrderLineItemID()
	{
		return intPurchaseOrderLineItemID;
	}

	/**
	 * Sets the value of the 'intPurchaseOrderLineItemID' field.
	 */
	public void setIntPurchaseOrderLineItemID(java.lang.Long intPurchaseOrderLineItemID)
	{
		this.intPurchaseOrderLineItemID = intPurchaseOrderLineItemID;
	}

	/**
	 * Gets the value of the 'intReceiptID' field.
	 */
	public java.lang.Long getIntReceiptID()
	{
		return intReceiptID;
	}

	/**
	 * Sets the value of the 'intReceiptID' field.
	 */
	public void setIntReceiptID(java.lang.Long intReceiptID)
	{
		this.intReceiptID = intReceiptID;
	}

	/**
	 * Gets the value of the 'intReceiveToFacilityID' field.
	 */
	public java.lang.Long getIntReceiveToFacilityID()
	{
		return intReceiveToFacilityID;
	}

	/**
	 * Sets the value of the 'intReceiveToFacilityID' field.
	 */
	public void setIntReceiveToFacilityID(java.lang.Long intReceiveToFacilityID)
	{
		this.intReceiveToFacilityID = intReceiveToFacilityID;
	}

	/**
	 * Gets the value of the 'intReceiveToStockID' field.
	 */
	public java.lang.Long getIntReceiveToStockID()
	{
		return intReceiveToStockID;
	}

	/**
	 * Sets the value of the 'intReceiveToStockID' field.
	 */
	public void setIntReceiveToStockID(java.lang.Long intReceiveToStockID)
	{
		this.intReceiveToStockID = intReceiveToStockID;
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
	 * Gets the value of the 'qtyQuantityOrdered' field.
	 */
	public java.lang.Double getQtyQuantityOrdered()
	{
		return qtyQuantityOrdered;
	}

	/**
	 * Sets the value of the 'qtyQuantityOrdered' field.
	 */
	public void setQtyQuantityOrdered(java.lang.Double qtyQuantityOrdered)
	{
		this.qtyQuantityOrdered = qtyQuantityOrdered;
	}

	/**
	 * Gets the value of the 'qtyQuantityReceived' field.
	 */
	public java.lang.Double getQtyQuantityReceived()
	{
		return qtyQuantityReceived;
	}

	/**
	 * Sets the value of the 'qtyQuantityReceived' field.
	 */
	public void setQtyQuantityReceived(java.lang.Double qtyQuantityReceived)
	{
		this.qtyQuantityReceived = qtyQuantityReceived;
	}

	/**
	 * Gets the value of the 'strDescription' field.
	 */
	public java.lang.String getStrDescription()
	{
		return strDescription;
	}

	/**
	 * Sets the value of the 'strDescription' field.
	 */
	public void setStrDescription(java.lang.String strDescription)
	{
		this.strDescription = strDescription;
	}
}
