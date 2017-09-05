package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetEventTypeAsset' table.
 * @generated
 */
public class AssetEventTypeAsset extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetEventTypeID;
	private java.lang.Long intAssetID;
		

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
	 * Gets the value of the 'intAssetEventTypeID' field.
	 */
	public java.lang.Long getIntAssetEventTypeID()
	{
		return intAssetEventTypeID;
	}

	/**
	 * Sets the value of the 'intAssetEventTypeID' field.
	 */
	public void setIntAssetEventTypeID(java.lang.Long intAssetEventTypeID)
	{
		this.intAssetEventTypeID = intAssetEventTypeID;
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
}
