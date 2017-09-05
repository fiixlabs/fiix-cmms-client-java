package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'Receipt' table.
 * @generated
 */
public class Receipt extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateOrdered;
	private java.util.Date dtmDateReceived;
	private java.lang.Long intCode;
	private java.lang.Long intPurchaseCurrencyID;
	private java.lang.Long intPurchaseOrderID;
	private java.lang.Long intReceiptStatusID;
	private java.lang.Long intSiteID;
	private java.lang.Long intSupplierID;
		

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
	 * Gets the value of the 'dtmDateOrdered' field.
	 */
	public java.util.Date getDtmDateOrdered()
	{
		return dtmDateOrdered;
	}

	/**
	 * Sets the value of the 'dtmDateOrdered' field.
	 */
	public void setDtmDateOrdered(java.util.Date dtmDateOrdered)
	{
		this.dtmDateOrdered = dtmDateOrdered;
	}

	/**
	 * Gets the value of the 'dtmDateReceived' field.
	 */
	public java.util.Date getDtmDateReceived()
	{
		return dtmDateReceived;
	}

	/**
	 * Sets the value of the 'dtmDateReceived' field.
	 */
	public void setDtmDateReceived(java.util.Date dtmDateReceived)
	{
		this.dtmDateReceived = dtmDateReceived;
	}

	/**
	 * Gets the value of the 'intCode' field.
	 */
	public java.lang.Long getIntCode()
	{
		return intCode;
	}

	/**
	 * Sets the value of the 'intCode' field.
	 */
	public void setIntCode(java.lang.Long intCode)
	{
		this.intCode = intCode;
	}

	/**
	 * Gets the value of the 'intPurchaseCurrencyID' field.
	 */
	public java.lang.Long getIntPurchaseCurrencyID()
	{
		return intPurchaseCurrencyID;
	}

	/**
	 * Sets the value of the 'intPurchaseCurrencyID' field.
	 */
	public void setIntPurchaseCurrencyID(java.lang.Long intPurchaseCurrencyID)
	{
		this.intPurchaseCurrencyID = intPurchaseCurrencyID;
	}

	/**
	 * Gets the value of the 'intPurchaseOrderID' field.
	 */
	public java.lang.Long getIntPurchaseOrderID()
	{
		return intPurchaseOrderID;
	}

	/**
	 * Sets the value of the 'intPurchaseOrderID' field.
	 */
	public void setIntPurchaseOrderID(java.lang.Long intPurchaseOrderID)
	{
		this.intPurchaseOrderID = intPurchaseOrderID;
	}

	/**
	 * Gets the value of the 'intReceiptStatusID' field.
	 */
	public java.lang.Long getIntReceiptStatusID()
	{
		return intReceiptStatusID;
	}

	/**
	 * Sets the value of the 'intReceiptStatusID' field.
	 */
	public void setIntReceiptStatusID(java.lang.Long intReceiptStatusID)
	{
		this.intReceiptStatusID = intReceiptStatusID;
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

	/**
	 * Gets the value of the 'intSupplierID' field.
	 */
	public java.lang.Long getIntSupplierID()
	{
		return intSupplierID;
	}

	/**
	 * Sets the value of the 'intSupplierID' field.
	 */
	public void setIntSupplierID(java.lang.Long intSupplierID)
	{
		this.intSupplierID = intSupplierID;
	}
}
