package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'Stock' table.
 * @generated
 */
public class Stock extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
	private java.lang.Long intFacilityID;
	private java.lang.Double qtyMinQty;
	private java.lang.Double qtyOnHand;
	private java.lang.String strAisle;
	private java.lang.String strBin;
	private java.lang.String strRow;
		

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
	 * Gets the value of the 'intFacilityID' field.
	 */
	public java.lang.Long getIntFacilityID()
	{
		return intFacilityID;
	}

	/**
	 * Sets the value of the 'intFacilityID' field.
	 */
	public void setIntFacilityID(java.lang.Long intFacilityID)
	{
		this.intFacilityID = intFacilityID;
	}

	/**
	 * Gets the value of the 'qtyMinQty' field.
	 */
	public java.lang.Double getQtyMinQty()
	{
		return qtyMinQty;
	}

	/**
	 * Sets the value of the 'qtyMinQty' field.
	 */
	public void setQtyMinQty(java.lang.Double qtyMinQty)
	{
		this.qtyMinQty = qtyMinQty;
	}

	/**
	 * Gets the value of the 'qtyOnHand' field.
	 */
	public java.lang.Double getQtyOnHand()
	{
		return qtyOnHand;
	}

	/**
	 * Sets the value of the 'qtyOnHand' field.
	 */
	public void setQtyOnHand(java.lang.Double qtyOnHand)
	{
		this.qtyOnHand = qtyOnHand;
	}

	/**
	 * Gets the value of the 'strAisle' field.
	 */
	public java.lang.String getStrAisle()
	{
		return strAisle;
	}

	/**
	 * Sets the value of the 'strAisle' field.
	 */
	public void setStrAisle(java.lang.String strAisle)
	{
		this.strAisle = strAisle;
	}

	/**
	 * Gets the value of the 'strBin' field.
	 */
	public java.lang.String getStrBin()
	{
		return strBin;
	}

	/**
	 * Sets the value of the 'strBin' field.
	 */
	public void setStrBin(java.lang.String strBin)
	{
		this.strBin = strBin;
	}

	/**
	 * Gets the value of the 'strRow' field.
	 */
	public java.lang.String getStrRow()
	{
		return strRow;
	}

	/**
	 * Sets the value of the 'strRow' field.
	 */
	public void setStrRow(java.lang.String strRow)
	{
		this.strRow = strRow;
	}
}
