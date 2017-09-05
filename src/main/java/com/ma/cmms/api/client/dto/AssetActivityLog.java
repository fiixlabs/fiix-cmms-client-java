package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetActivityLog' table.
 * @generated
 */
public class AssetActivityLog extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDate;
	private java.lang.Long intActivityLogID;
	private java.lang.Long intMoveAssetID;
	private java.lang.Long intMoveBackAssetID;
	private java.lang.Long intMoveBackID;
	private java.lang.Long intMoveID;
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
	 * Gets the value of the 'dtmDate' field.
	 */
	public java.util.Date getDtmDate()
	{
		return dtmDate;
	}

	/**
	 * Sets the value of the 'dtmDate' field.
	 */
	public void setDtmDate(java.util.Date dtmDate)
	{
		this.dtmDate = dtmDate;
	}

	/**
	 * Gets the value of the 'intActivityLogID' field.
	 */
	public java.lang.Long getIntActivityLogID()
	{
		return intActivityLogID;
	}

	/**
	 * Sets the value of the 'intActivityLogID' field.
	 */
	public void setIntActivityLogID(java.lang.Long intActivityLogID)
	{
		this.intActivityLogID = intActivityLogID;
	}

	/**
	 * Gets the value of the 'intMoveAssetID' field.
	 */
	public java.lang.Long getIntMoveAssetID()
	{
		return intMoveAssetID;
	}

	/**
	 * Sets the value of the 'intMoveAssetID' field.
	 */
	public void setIntMoveAssetID(java.lang.Long intMoveAssetID)
	{
		this.intMoveAssetID = intMoveAssetID;
	}

	/**
	 * Gets the value of the 'intMoveBackAssetID' field.
	 */
	public java.lang.Long getIntMoveBackAssetID()
	{
		return intMoveBackAssetID;
	}

	/**
	 * Sets the value of the 'intMoveBackAssetID' field.
	 */
	public void setIntMoveBackAssetID(java.lang.Long intMoveBackAssetID)
	{
		this.intMoveBackAssetID = intMoveBackAssetID;
	}

	/**
	 * Gets the value of the 'intMoveBackID' field.
	 */
	public java.lang.Long getIntMoveBackID()
	{
		return intMoveBackID;
	}

	/**
	 * Sets the value of the 'intMoveBackID' field.
	 */
	public void setIntMoveBackID(java.lang.Long intMoveBackID)
	{
		this.intMoveBackID = intMoveBackID;
	}

	/**
	 * Gets the value of the 'intMoveID' field.
	 */
	public java.lang.Long getIntMoveID()
	{
		return intMoveID;
	}

	/**
	 * Sets the value of the 'intMoveID' field.
	 */
	public void setIntMoveID(java.lang.Long intMoveID)
	{
		this.intMoveID = intMoveID;
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
