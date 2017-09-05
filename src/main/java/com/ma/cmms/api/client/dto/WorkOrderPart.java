package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'WorkOrderPart' table.
 * @generated
 */
public class WorkOrderPart extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
	private java.lang.Long intPartID;
	private java.lang.Long intStockID;
	private java.lang.Long intUpdated;
	private java.lang.Long intWorkOrderID;
	private java.lang.Double qtyActualQuantityUsed;
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

	/**
	 * Gets the value of the 'qtyActualQuantityUsed' field.
	 */
	public java.lang.Double getQtyActualQuantityUsed()
	{
		return qtyActualQuantityUsed;
	}

	/**
	 * Sets the value of the 'qtyActualQuantityUsed' field.
	 */
	public void setQtyActualQuantityUsed(java.lang.Double qtyActualQuantityUsed)
	{
		this.qtyActualQuantityUsed = qtyActualQuantityUsed;
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
