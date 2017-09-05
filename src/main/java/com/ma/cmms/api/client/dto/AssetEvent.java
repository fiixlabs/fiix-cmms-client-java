package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetEvent' table.
 * @generated
 */
public class AssetEvent extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateSubmitted;
	private java.lang.Long intAssetEventTypeID;
	private java.lang.Long intAssetID;
	private java.lang.Long intSubmittedByUserID;
	private java.lang.Long intWorkOrderID;
	private java.lang.String strAdditionalDescription;
		

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
	 * Gets the value of the 'dtmDateSubmitted' field.
	 */
	public java.util.Date getDtmDateSubmitted()
	{
		return dtmDateSubmitted;
	}

	/**
	 * Sets the value of the 'dtmDateSubmitted' field.
	 */
	public void setDtmDateSubmitted(java.util.Date dtmDateSubmitted)
	{
		this.dtmDateSubmitted = dtmDateSubmitted;
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

	/**
	 * Gets the value of the 'intSubmittedByUserID' field.
	 */
	public java.lang.Long getIntSubmittedByUserID()
	{
		return intSubmittedByUserID;
	}

	/**
	 * Sets the value of the 'intSubmittedByUserID' field.
	 */
	public void setIntSubmittedByUserID(java.lang.Long intSubmittedByUserID)
	{
		this.intSubmittedByUserID = intSubmittedByUserID;
	}

	/**
	 * Gets the value of the 'intWorkOrderID' field.
	 */
	public java.lang.Long getIntWorkOrderID()
	{
		return intWorkOrderID;
	}

	/**
	 * Sets the value of the 'intWorkOrderID' field.
	 */
	public void setIntWorkOrderID(java.lang.Long intWorkOrderID)
	{
		this.intWorkOrderID = intWorkOrderID;
	}

	/**
	 * Gets the value of the 'strAdditionalDescription' field.
	 */
	public java.lang.String getStrAdditionalDescription()
	{
		return strAdditionalDescription;
	}

	/**
	 * Sets the value of the 'strAdditionalDescription' field.
	 */
	public void setStrAdditionalDescription(java.lang.String strAdditionalDescription)
	{
		this.strAdditionalDescription = strAdditionalDescription;
	}
}
