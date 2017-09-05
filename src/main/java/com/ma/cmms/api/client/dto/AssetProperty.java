package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetProperty' table.
 * @generated
 */
public class AssetProperty extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
	private java.lang.Long intAssetPropertyTypeID;
	private java.lang.Long intMeterReadingUnitID;
	private java.lang.String strCode;
	private java.lang.String strName;
		

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
	 * Gets the value of the 'intAssetPropertyTypeID' field.
	 */
	public java.lang.Long getIntAssetPropertyTypeID()
	{
		return intAssetPropertyTypeID;
	}

	/**
	 * Sets the value of the 'intAssetPropertyTypeID' field.
	 */
	public void setIntAssetPropertyTypeID(java.lang.Long intAssetPropertyTypeID)
	{
		this.intAssetPropertyTypeID = intAssetPropertyTypeID;
	}

	/**
	 * Gets the value of the 'intMeterReadingUnitID' field.
	 */
	public java.lang.Long getIntMeterReadingUnitID()
	{
		return intMeterReadingUnitID;
	}

	/**
	 * Sets the value of the 'intMeterReadingUnitID' field.
	 */
	public void setIntMeterReadingUnitID(java.lang.Long intMeterReadingUnitID)
	{
		this.intMeterReadingUnitID = intMeterReadingUnitID;
	}

	/**
	 * Gets the value of the 'strCode' field.
	 */
	public java.lang.String getStrCode()
	{
		return strCode;
	}

	/**
	 * Sets the value of the 'strCode' field.
	 */
	public void setStrCode(java.lang.String strCode)
	{
		this.strCode = strCode;
	}

	/**
	 * Gets the value of the 'strName' field.
	 */
	public java.lang.String getStrName()
	{
		return strName;
	}

	/**
	 * Sets the value of the 'strName' field.
	 */
	public void setStrName(java.lang.String strName)
	{
		this.strName = strName;
	}
}
