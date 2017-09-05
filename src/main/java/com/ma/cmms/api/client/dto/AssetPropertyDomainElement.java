package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetPropertyDomainElement' table.
 * @generated
 */
public class AssetPropertyDomainElement extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetPropertyID;
		

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
	 * Gets the value of the 'intAssetPropertyID' field.
	 */
	public java.lang.Long getIntAssetPropertyID()
	{
		return intAssetPropertyID;
	}

	/**
	 * Sets the value of the 'intAssetPropertyID' field.
	 */
	public void setIntAssetPropertyID(java.lang.Long intAssetPropertyID)
	{
		this.intAssetPropertyID = intAssetPropertyID;
	}
}
