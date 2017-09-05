package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ScheduledMaintenance' table.
 * @generated
 */
public class ScheduledMaintenance extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblSuggestedTime;
	private java.util.Date dtmCreateDate;
	private java.util.Date dtmUpdatedDate;
	private java.lang.Long intMaintenanceTypeID;
	private java.lang.Long intPriorityID;
	private java.lang.Long intProjectID;
	private java.lang.Long intRequestorUserID;
	private java.lang.Long intScheduledMaintenanceStatusID;
	private java.lang.Long intSiteID;
	private java.lang.Long intStartAsWorkOrderStatusID;
	private java.lang.Long intSuggestedCompletion;
	private java.lang.String strCode;
	private java.lang.String strCompletionNotes;
	private java.lang.String strCustomerIds;
	private java.lang.String strDescription;
	private java.lang.String strVendorIds;
		

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
	 * Gets the value of the 'dblSuggestedTime' field.
	 */
	public java.lang.Double getDblSuggestedTime()
	{
		return dblSuggestedTime;
	}

	/**
	 * Sets the value of the 'dblSuggestedTime' field.
	 */
	public void setDblSuggestedTime(java.lang.Double dblSuggestedTime)
	{
		this.dblSuggestedTime = dblSuggestedTime;
	}

	/**
	 * Gets the value of the 'dtmCreateDate' field.
	 */
	public java.util.Date getDtmCreateDate()
	{
		return dtmCreateDate;
	}

	/**
	 * Sets the value of the 'dtmCreateDate' field.
	 */
	public void setDtmCreateDate(java.util.Date dtmCreateDate)
	{
		this.dtmCreateDate = dtmCreateDate;
	}

	/**
	 * Gets the value of the 'dtmUpdatedDate' field.
	 */
	public java.util.Date getDtmUpdatedDate()
	{
		return dtmUpdatedDate;
	}

	/**
	 * Sets the value of the 'dtmUpdatedDate' field.
	 */
	public void setDtmUpdatedDate(java.util.Date dtmUpdatedDate)
	{
		this.dtmUpdatedDate = dtmUpdatedDate;
	}

	/**
	 * Gets the value of the 'intMaintenanceTypeID' field.
	 */
	public java.lang.Long getIntMaintenanceTypeID()
	{
		return intMaintenanceTypeID;
	}

	/**
	 * Sets the value of the 'intMaintenanceTypeID' field.
	 */
	public void setIntMaintenanceTypeID(java.lang.Long intMaintenanceTypeID)
	{
		this.intMaintenanceTypeID = intMaintenanceTypeID;
	}

	/**
	 * Gets the value of the 'intPriorityID' field.
	 */
	public java.lang.Long getIntPriorityID()
	{
		return intPriorityID;
	}

	/**
	 * Sets the value of the 'intPriorityID' field.
	 */
	public void setIntPriorityID(java.lang.Long intPriorityID)
	{
		this.intPriorityID = intPriorityID;
	}

	/**
	 * Gets the value of the 'intProjectID' field.
	 */
	public java.lang.Long getIntProjectID()
	{
		return intProjectID;
	}

	/**
	 * Sets the value of the 'intProjectID' field.
	 */
	public void setIntProjectID(java.lang.Long intProjectID)
	{
		this.intProjectID = intProjectID;
	}

	/**
	 * Gets the value of the 'intRequestorUserID' field.
	 */
	public java.lang.Long getIntRequestorUserID()
	{
		return intRequestorUserID;
	}

	/**
	 * Sets the value of the 'intRequestorUserID' field.
	 */
	public void setIntRequestorUserID(java.lang.Long intRequestorUserID)
	{
		this.intRequestorUserID = intRequestorUserID;
	}

	/**
	 * Gets the value of the 'intScheduledMaintenanceStatusID' field.
	 */
	public java.lang.Long getIntScheduledMaintenanceStatusID()
	{
		return intScheduledMaintenanceStatusID;
	}

	/**
	 * Sets the value of the 'intScheduledMaintenanceStatusID' field.
	 */
	public void setIntScheduledMaintenanceStatusID(java.lang.Long intScheduledMaintenanceStatusID)
	{
		this.intScheduledMaintenanceStatusID = intScheduledMaintenanceStatusID;
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
	 * Gets the value of the 'intStartAsWorkOrderStatusID' field.
	 */
	public java.lang.Long getIntStartAsWorkOrderStatusID()
	{
		return intStartAsWorkOrderStatusID;
	}

	/**
	 * Sets the value of the 'intStartAsWorkOrderStatusID' field.
	 */
	public void setIntStartAsWorkOrderStatusID(java.lang.Long intStartAsWorkOrderStatusID)
	{
		this.intStartAsWorkOrderStatusID = intStartAsWorkOrderStatusID;
	}

	/**
	 * Gets the value of the 'intSuggestedCompletion' field.
	 */
	public java.lang.Long getIntSuggestedCompletion()
	{
		return intSuggestedCompletion;
	}

	/**
	 * Sets the value of the 'intSuggestedCompletion' field.
	 */
	public void setIntSuggestedCompletion(java.lang.Long intSuggestedCompletion)
	{
		this.intSuggestedCompletion = intSuggestedCompletion;
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
	 * Gets the value of the 'strCompletionNotes' field.
	 */
	public java.lang.String getStrCompletionNotes()
	{
		return strCompletionNotes;
	}

	/**
	 * Sets the value of the 'strCompletionNotes' field.
	 */
	public void setStrCompletionNotes(java.lang.String strCompletionNotes)
	{
		this.strCompletionNotes = strCompletionNotes;
	}

	/**
	 * Gets the value of the 'strCustomerIds' field.
	 */
	public java.lang.String getStrCustomerIds()
	{
		return strCustomerIds;
	}

	/**
	 * Sets the value of the 'strCustomerIds' field.
	 */
	public void setStrCustomerIds(java.lang.String strCustomerIds)
	{
		this.strCustomerIds = strCustomerIds;
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
	 * Gets the value of the 'strVendorIds' field.
	 */
	public java.lang.String getStrVendorIds()
	{
		return strVendorIds;
	}

	/**
	 * Sets the value of the 'strVendorIds' field.
	 */
	public void setStrVendorIds(java.lang.String strVendorIds)
	{
		this.strVendorIds = strVendorIds;
	}
}
