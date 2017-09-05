package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'PurchaseOrderLineItem' table.
 * @generated
 */
public class PurchaseOrderLineItem extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolAddedDirectlyToPurchaseOrder;
	private java.lang.Long bolProductionEquipmentDownWhileOnOrder;
	private java.lang.Long bolSupplierConfirmed;
	private java.lang.Double dblRemoteOrgUnitPrice;
	private java.lang.Double dblTaxRate;
	private java.lang.Double dblTotalPrice;
	private java.lang.Double dblUnitPrice;
	private java.util.Date dtmDateCreated;
	private java.util.Date dtmRequiredByDate;
	private java.lang.Long intAccountID;
	private java.lang.Long intAssetID;
	private java.lang.Long intChargeDepartmentID;
	private java.lang.Long intPurchaseOrderID;
	private java.lang.Long intRequestedByUserID;
	private java.lang.Long intShipToLocationID;
	private java.lang.Long intSiteID;
	private java.lang.Long intSourceAssetID;
	private java.lang.Long intSourceWorkOrderID;
	private java.lang.Long intStockHistoryID;
	private java.lang.Long intStockID;
	private java.lang.Long intSupplierID;
	private java.lang.Double qtyOnOrder;
	private java.lang.Double qtyRecieved;
	private java.lang.String strBusinessAssetNumber;
	private java.lang.String strDescription;
	private java.lang.String strJSON;
		

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
	 * Gets the value of the 'bolAddedDirectlyToPurchaseOrder' field.
	 */
	public java.lang.Long getBolAddedDirectlyToPurchaseOrder()
	{
		return bolAddedDirectlyToPurchaseOrder;
	}

	/**
	 * Sets the value of the 'bolAddedDirectlyToPurchaseOrder' field.
	 */
	public void setBolAddedDirectlyToPurchaseOrder(java.lang.Long bolAddedDirectlyToPurchaseOrder)
	{
		this.bolAddedDirectlyToPurchaseOrder = bolAddedDirectlyToPurchaseOrder;
	}

	/**
	 * Gets the value of the 'bolProductionEquipmentDownWhileOnOrder' field.
	 */
	public java.lang.Long getBolProductionEquipmentDownWhileOnOrder()
	{
		return bolProductionEquipmentDownWhileOnOrder;
	}

	/**
	 * Sets the value of the 'bolProductionEquipmentDownWhileOnOrder' field.
	 */
	public void setBolProductionEquipmentDownWhileOnOrder(java.lang.Long bolProductionEquipmentDownWhileOnOrder)
	{
		this.bolProductionEquipmentDownWhileOnOrder = bolProductionEquipmentDownWhileOnOrder;
	}

	/**
	 * Gets the value of the 'bolSupplierConfirmed' field.
	 */
	public java.lang.Long getBolSupplierConfirmed()
	{
		return bolSupplierConfirmed;
	}

	/**
	 * Sets the value of the 'bolSupplierConfirmed' field.
	 */
	public void setBolSupplierConfirmed(java.lang.Long bolSupplierConfirmed)
	{
		this.bolSupplierConfirmed = bolSupplierConfirmed;
	}

	/**
	 * Gets the value of the 'dblRemoteOrgUnitPrice' field.
	 */
	public java.lang.Double getDblRemoteOrgUnitPrice()
	{
		return dblRemoteOrgUnitPrice;
	}

	/**
	 * Sets the value of the 'dblRemoteOrgUnitPrice' field.
	 */
	public void setDblRemoteOrgUnitPrice(java.lang.Double dblRemoteOrgUnitPrice)
	{
		this.dblRemoteOrgUnitPrice = dblRemoteOrgUnitPrice;
	}

	/**
	 * Gets the value of the 'dblTaxRate' field.
	 */
	public java.lang.Double getDblTaxRate()
	{
		return dblTaxRate;
	}

	/**
	 * Sets the value of the 'dblTaxRate' field.
	 */
	public void setDblTaxRate(java.lang.Double dblTaxRate)
	{
		this.dblTaxRate = dblTaxRate;
	}

	/**
	 * Gets the value of the 'dblTotalPrice' field.
	 */
	public java.lang.Double getDblTotalPrice()
	{
		return dblTotalPrice;
	}

	/**
	 * Sets the value of the 'dblTotalPrice' field.
	 */
	public void setDblTotalPrice(java.lang.Double dblTotalPrice)
	{
		this.dblTotalPrice = dblTotalPrice;
	}

	/**
	 * Gets the value of the 'dblUnitPrice' field.
	 */
	public java.lang.Double getDblUnitPrice()
	{
		return dblUnitPrice;
	}

	/**
	 * Sets the value of the 'dblUnitPrice' field.
	 */
	public void setDblUnitPrice(java.lang.Double dblUnitPrice)
	{
		this.dblUnitPrice = dblUnitPrice;
	}

	/**
	 * Gets the value of the 'dtmDateCreated' field.
	 */
	public java.util.Date getDtmDateCreated()
	{
		return dtmDateCreated;
	}

	/**
	 * Sets the value of the 'dtmDateCreated' field.
	 */
	public void setDtmDateCreated(java.util.Date dtmDateCreated)
	{
		this.dtmDateCreated = dtmDateCreated;
	}

	/**
	 * Gets the value of the 'dtmRequiredByDate' field.
	 */
	public java.util.Date getDtmRequiredByDate()
	{
		return dtmRequiredByDate;
	}

	/**
	 * Sets the value of the 'dtmRequiredByDate' field.
	 */
	public void setDtmRequiredByDate(java.util.Date dtmRequiredByDate)
	{
		this.dtmRequiredByDate = dtmRequiredByDate;
	}

	/**
	 * Gets the value of the 'intAccountID' field.
	 */
	public java.lang.Long getIntAccountID()
	{
		return intAccountID;
	}

	/**
	 * Sets the value of the 'intAccountID' field.
	 */
	public void setIntAccountID(java.lang.Long intAccountID)
	{
		this.intAccountID = intAccountID;
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
	 * Gets the value of the 'intChargeDepartmentID' field.
	 */
	public java.lang.Long getIntChargeDepartmentID()
	{
		return intChargeDepartmentID;
	}

	/**
	 * Sets the value of the 'intChargeDepartmentID' field.
	 */
	public void setIntChargeDepartmentID(java.lang.Long intChargeDepartmentID)
	{
		this.intChargeDepartmentID = intChargeDepartmentID;
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
	 * Gets the value of the 'intRequestedByUserID' field.
	 */
	public java.lang.Long getIntRequestedByUserID()
	{
		return intRequestedByUserID;
	}

	/**
	 * Sets the value of the 'intRequestedByUserID' field.
	 */
	public void setIntRequestedByUserID(java.lang.Long intRequestedByUserID)
	{
		this.intRequestedByUserID = intRequestedByUserID;
	}

	/**
	 * Gets the value of the 'intShipToLocationID' field.
	 */
	public java.lang.Long getIntShipToLocationID()
	{
		return intShipToLocationID;
	}

	/**
	 * Sets the value of the 'intShipToLocationID' field.
	 */
	public void setIntShipToLocationID(java.lang.Long intShipToLocationID)
	{
		this.intShipToLocationID = intShipToLocationID;
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
	 * Gets the value of the 'intSourceAssetID' field.
	 */
	public java.lang.Long getIntSourceAssetID()
	{
		return intSourceAssetID;
	}

	/**
	 * Sets the value of the 'intSourceAssetID' field.
	 */
	public void setIntSourceAssetID(java.lang.Long intSourceAssetID)
	{
		this.intSourceAssetID = intSourceAssetID;
	}

	/**
	 * Gets the value of the 'intSourceWorkOrderID' field.
	 */
	public java.lang.Long getIntSourceWorkOrderID()
	{
		return intSourceWorkOrderID;
	}

	/**
	 * Sets the value of the 'intSourceWorkOrderID' field.
	 */
	public void setIntSourceWorkOrderID(java.lang.Long intSourceWorkOrderID)
	{
		this.intSourceWorkOrderID = intSourceWorkOrderID;
	}

	/**
	 * Gets the value of the 'intStockHistoryID' field.
	 */
	public java.lang.Long getIntStockHistoryID()
	{
		return intStockHistoryID;
	}

	/**
	 * Sets the value of the 'intStockHistoryID' field.
	 */
	public void setIntStockHistoryID(java.lang.Long intStockHistoryID)
	{
		this.intStockHistoryID = intStockHistoryID;
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

	/**
	 * Gets the value of the 'qtyOnOrder' field.
	 */
	public java.lang.Double getQtyOnOrder()
	{
		return qtyOnOrder;
	}

	/**
	 * Sets the value of the 'qtyOnOrder' field.
	 */
	public void setQtyOnOrder(java.lang.Double qtyOnOrder)
	{
		this.qtyOnOrder = qtyOnOrder;
	}

	/**
	 * Gets the value of the 'qtyRecieved' field.
	 */
	public java.lang.Double getQtyRecieved()
	{
		return qtyRecieved;
	}

	/**
	 * Sets the value of the 'qtyRecieved' field.
	 */
	public void setQtyRecieved(java.lang.Double qtyRecieved)
	{
		this.qtyRecieved = qtyRecieved;
	}

	/**
	 * Gets the value of the 'strBusinessAssetNumber' field.
	 */
	public java.lang.String getStrBusinessAssetNumber()
	{
		return strBusinessAssetNumber;
	}

	/**
	 * Sets the value of the 'strBusinessAssetNumber' field.
	 */
	public void setStrBusinessAssetNumber(java.lang.String strBusinessAssetNumber)
	{
		this.strBusinessAssetNumber = strBusinessAssetNumber;
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

	/**
	 * Gets the value of the 'strJSON' field.
	 */
	public java.lang.String getStrJSON()
	{
		return strJSON;
	}

	/**
	 * Sets the value of the 'strJSON' field.
	 */
	public void setStrJSON(java.lang.String strJSON)
	{
		this.strJSON = strJSON;
	}
}
