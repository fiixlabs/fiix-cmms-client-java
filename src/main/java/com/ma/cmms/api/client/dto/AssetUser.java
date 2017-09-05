package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetUser' table.
 * @generated
 */
public class AssetUser extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateAdded;
	private java.lang.Long intAssetID;
	private java.lang.Long intAssetUserTypeID;
	private java.lang.Long intUserID;
		

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
	 * Gets the value of the 'dtmDateAdded' field.
	 */
	public java.util.Date getDtmDateAdded()
	{
		return dtmDateAdded;
	}

	/**
	 * Sets the value of the 'dtmDateAdded' field.
	 */
	public void setDtmDateAdded(java.util.Date dtmDateAdded)
	{
		this.dtmDateAdded = dtmDateAdded;
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
	 * Gets the value of the 'intAssetUserTypeID' field.
	 */
	public java.lang.Long getIntAssetUserTypeID()
	{
		return intAssetUserTypeID;
	}

	/**
	 * Sets the value of the 'intAssetUserTypeID' field.
	 */
	public void setIntAssetUserTypeID(java.lang.Long intAssetUserTypeID)
	{
		this.intAssetUserTypeID = intAssetUserTypeID;
	}

	/**
	 * Gets the value of the 'intUserID' field.
	 */
	public java.lang.Long getIntUserID()
	{
		return intUserID;
	}

	/**
	 * Sets the value of the 'intUserID' field.
	 */
	public void setIntUserID(java.lang.Long intUserID)
	{
		this.intUserID = intUserID;
	}
}
