package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetConsumingReference' table.
 * @generated
 */
public class AssetConsumingReference extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAssetID;
	private java.lang.Long intBOMControlID;
	private java.lang.Long intBOMPartControlID;
	private java.lang.Long intConsumesAssetID;
	private java.lang.Double qtyMaxConsumption;
		

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
	 * Gets the value of the 'intBOMControlID' field.
	 */
	public java.lang.Long getIntBOMControlID()
	{
		return intBOMControlID;
	}

	/**
	 * Sets the value of the 'intBOMControlID' field.
	 */
	public void setIntBOMControlID(java.lang.Long intBOMControlID)
	{
		this.intBOMControlID = intBOMControlID;
	}

	/**
	 * Gets the value of the 'intBOMPartControlID' field.
	 */
	public java.lang.Long getIntBOMPartControlID()
	{
		return intBOMPartControlID;
	}

	/**
	 * Sets the value of the 'intBOMPartControlID' field.
	 */
	public void setIntBOMPartControlID(java.lang.Long intBOMPartControlID)
	{
		this.intBOMPartControlID = intBOMPartControlID;
	}

	/**
	 * Gets the value of the 'intConsumesAssetID' field.
	 */
	public java.lang.Long getIntConsumesAssetID()
	{
		return intConsumesAssetID;
	}

	/**
	 * Sets the value of the 'intConsumesAssetID' field.
	 */
	public void setIntConsumesAssetID(java.lang.Long intConsumesAssetID)
	{
		this.intConsumesAssetID = intConsumesAssetID;
	}

	/**
	 * Gets the value of the 'qtyMaxConsumption' field.
	 */
	public java.lang.Double getQtyMaxConsumption()
	{
		return qtyMaxConsumption;
	}

	/**
	 * Sets the value of the 'qtyMaxConsumption' field.
	 */
	public void setQtyMaxConsumption(java.lang.Double qtyMaxConsumption)
	{
		this.qtyMaxConsumption = qtyMaxConsumption;
	}
}
