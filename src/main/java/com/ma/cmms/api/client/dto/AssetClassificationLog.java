package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetClassificationLog' table.
 * @generated
 */
public class AssetClassificationLog extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateApplied;
	private java.lang.Long intAssetID;
	private java.lang.Long intClassificationID;
	private java.lang.Long intSiteID;
		

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
	 * Gets the value of the 'dtmDateApplied' field.
	 */
	public java.util.Date getDtmDateApplied()
	{
		return dtmDateApplied;
	}

	/**
	 * Sets the value of the 'dtmDateApplied' field.
	 */
	public void setDtmDateApplied(java.util.Date dtmDateApplied)
	{
		this.dtmDateApplied = dtmDateApplied;
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
	 * Gets the value of the 'intClassificationID' field.
	 */
	public java.lang.Long getIntClassificationID()
	{
		return intClassificationID;
	}

	/**
	 * Sets the value of the 'intClassificationID' field.
	 */
	public void setIntClassificationID(java.lang.Long intClassificationID)
	{
		this.intClassificationID = intClassificationID;
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
}
