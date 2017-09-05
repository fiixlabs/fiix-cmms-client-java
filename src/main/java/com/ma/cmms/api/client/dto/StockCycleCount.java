package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'StockCycleCount' table.
 * @generated
 */
public class StockCycleCount extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblPrice;
	private java.util.Date dtmDateCounted;
	private java.lang.Long intCountedBy;
	private java.lang.Long intCycleCountID;
	private java.lang.Long intStockID;
	private java.lang.Double qtyExpected;
	private java.lang.Double qtyStockCount;
		

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
	 * Gets the value of the 'dblPrice' field.
	 */
	public java.lang.Double getDblPrice()
	{
		return dblPrice;
	}

	/**
	 * Sets the value of the 'dblPrice' field.
	 */
	public void setDblPrice(java.lang.Double dblPrice)
	{
		this.dblPrice = dblPrice;
	}

	/**
	 * Gets the value of the 'dtmDateCounted' field.
	 */
	public java.util.Date getDtmDateCounted()
	{
		return dtmDateCounted;
	}

	/**
	 * Sets the value of the 'dtmDateCounted' field.
	 */
	public void setDtmDateCounted(java.util.Date dtmDateCounted)
	{
		this.dtmDateCounted = dtmDateCounted;
	}

	/**
	 * Gets the value of the 'intCountedBy' field.
	 */
	public java.lang.Long getIntCountedBy()
	{
		return intCountedBy;
	}

	/**
	 * Sets the value of the 'intCountedBy' field.
	 */
	public void setIntCountedBy(java.lang.Long intCountedBy)
	{
		this.intCountedBy = intCountedBy;
	}

	/**
	 * Gets the value of the 'intCycleCountID' field.
	 */
	public java.lang.Long getIntCycleCountID()
	{
		return intCycleCountID;
	}

	/**
	 * Sets the value of the 'intCycleCountID' field.
	 */
	public void setIntCycleCountID(java.lang.Long intCycleCountID)
	{
		this.intCycleCountID = intCycleCountID;
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
	 * Gets the value of the 'qtyExpected' field.
	 */
	public java.lang.Double getQtyExpected()
	{
		return qtyExpected;
	}

	/**
	 * Sets the value of the 'qtyExpected' field.
	 */
	public void setQtyExpected(java.lang.Double qtyExpected)
	{
		this.qtyExpected = qtyExpected;
	}

	/**
	 * Gets the value of the 'qtyStockCount' field.
	 */
	public java.lang.Double getQtyStockCount()
	{
		return qtyStockCount;
	}

	/**
	 * Sets the value of the 'qtyStockCount' field.
	 */
	public void setQtyStockCount(java.lang.Double qtyStockCount)
	{
		this.qtyStockCount = qtyStockCount;
	}
}
