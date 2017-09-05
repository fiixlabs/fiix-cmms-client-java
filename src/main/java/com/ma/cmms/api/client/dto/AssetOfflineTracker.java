package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetOfflineTracker' table.
 * @generated
 */
public class AssetOfflineTracker extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblProductionHoursAffected;
	private java.util.Date dtmOffLineTo;
	private java.util.Date dtmOfflineFrom;
	private java.lang.Long intAssetID;
	private java.lang.Long intReasonOfflineID;
	private java.lang.Long intReasonOnlineID;
	private java.lang.Long intSetOfflineByUserID;
	private java.lang.Long intSetOnlineByUserID;
	private java.lang.Long intWorkOrderID;
	private java.lang.String strOfflineAdditionalInfo;
	private java.lang.String strOnlineAdditionalInfo;
		

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
	 * Gets the value of the 'dblProductionHoursAffected' field.
	 */
	public java.lang.Double getDblProductionHoursAffected()
	{
		return dblProductionHoursAffected;
	}

	/**
	 * Sets the value of the 'dblProductionHoursAffected' field.
	 */
	public void setDblProductionHoursAffected(java.lang.Double dblProductionHoursAffected)
	{
		this.dblProductionHoursAffected = dblProductionHoursAffected;
	}

	/**
	 * Gets the value of the 'dtmOffLineTo' field.
	 */
	public java.util.Date getDtmOffLineTo()
	{
		return dtmOffLineTo;
	}

	/**
	 * Sets the value of the 'dtmOffLineTo' field.
	 */
	public void setDtmOffLineTo(java.util.Date dtmOffLineTo)
	{
		this.dtmOffLineTo = dtmOffLineTo;
	}

	/**
	 * Gets the value of the 'dtmOfflineFrom' field.
	 */
	public java.util.Date getDtmOfflineFrom()
	{
		return dtmOfflineFrom;
	}

	/**
	 * Sets the value of the 'dtmOfflineFrom' field.
	 */
	public void setDtmOfflineFrom(java.util.Date dtmOfflineFrom)
	{
		this.dtmOfflineFrom = dtmOfflineFrom;
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
	 * Gets the value of the 'intReasonOfflineID' field.
	 */
	public java.lang.Long getIntReasonOfflineID()
	{
		return intReasonOfflineID;
	}

	/**
	 * Sets the value of the 'intReasonOfflineID' field.
	 */
	public void setIntReasonOfflineID(java.lang.Long intReasonOfflineID)
	{
		this.intReasonOfflineID = intReasonOfflineID;
	}

	/**
	 * Gets the value of the 'intReasonOnlineID' field.
	 */
	public java.lang.Long getIntReasonOnlineID()
	{
		return intReasonOnlineID;
	}

	/**
	 * Sets the value of the 'intReasonOnlineID' field.
	 */
	public void setIntReasonOnlineID(java.lang.Long intReasonOnlineID)
	{
		this.intReasonOnlineID = intReasonOnlineID;
	}

	/**
	 * Gets the value of the 'intSetOfflineByUserID' field.
	 */
	public java.lang.Long getIntSetOfflineByUserID()
	{
		return intSetOfflineByUserID;
	}

	/**
	 * Sets the value of the 'intSetOfflineByUserID' field.
	 */
	public void setIntSetOfflineByUserID(java.lang.Long intSetOfflineByUserID)
	{
		this.intSetOfflineByUserID = intSetOfflineByUserID;
	}

	/**
	 * Gets the value of the 'intSetOnlineByUserID' field.
	 */
	public java.lang.Long getIntSetOnlineByUserID()
	{
		return intSetOnlineByUserID;
	}

	/**
	 * Sets the value of the 'intSetOnlineByUserID' field.
	 */
	public void setIntSetOnlineByUserID(java.lang.Long intSetOnlineByUserID)
	{
		this.intSetOnlineByUserID = intSetOnlineByUserID;
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
	 * Gets the value of the 'strOfflineAdditionalInfo' field.
	 */
	public java.lang.String getStrOfflineAdditionalInfo()
	{
		return strOfflineAdditionalInfo;
	}

	/**
	 * Sets the value of the 'strOfflineAdditionalInfo' field.
	 */
	public void setStrOfflineAdditionalInfo(java.lang.String strOfflineAdditionalInfo)
	{
		this.strOfflineAdditionalInfo = strOfflineAdditionalInfo;
	}

	/**
	 * Gets the value of the 'strOnlineAdditionalInfo' field.
	 */
	public java.lang.String getStrOnlineAdditionalInfo()
	{
		return strOnlineAdditionalInfo;
	}

	/**
	 * Sets the value of the 'strOnlineAdditionalInfo' field.
	 */
	public void setStrOnlineAdditionalInfo(java.lang.String strOnlineAdditionalInfo)
	{
		this.strOnlineAdditionalInfo = strOnlineAdditionalInfo;
	}
}
