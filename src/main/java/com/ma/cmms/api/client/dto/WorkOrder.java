package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'WorkOrder' table.
 * @generated
 */
public class WorkOrder extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateCompleted;
	private java.util.Date dtmDateCreated;
	private java.util.Date dtmDateLastModified;
	private java.util.Date dtmSuggestedCompletionDate;
	private java.lang.Long intCompletedByUserID;
	private java.lang.Long intMaintenanceTypeID;
	private java.lang.Long intPriorityID;
	private java.lang.Long intRCAActionID;
	private java.lang.Long intRCACauseID;
	private java.lang.Long intRCAProblemID;
	private java.lang.Long intRequestedByUserID;
	private java.lang.Long intSiteID;
	private java.lang.Long intUpdated;
	private java.lang.Long intWorkOrderStatusGroup;
	private java.lang.Long intWorkOrderStatusID;
	private java.lang.String strAdminNotes;
	private java.lang.String strAssetIds;
	private java.lang.String strAssets;
	private java.lang.String strAssignedUserIds;
	private java.lang.String strAssignedUsers;
	private java.lang.String strCode;
	private java.lang.String strCompletedByUserIds;
	private java.lang.String strCompletedByUsers;
	private java.lang.String strCompletionNotes;
	private java.lang.String strCustomerIds;
	private java.lang.String strDescription;
	private java.lang.String strEmailUserGuest;
	private java.lang.String strNameUserGuest;
	private java.lang.String strPhoneUserGuest;
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
	 * Gets the value of the 'dtmDateCompleted' field.
	 */
	public java.util.Date getDtmDateCompleted()
	{
		return dtmDateCompleted;
	}

	/**
	 * Sets the value of the 'dtmDateCompleted' field.
	 */
	public void setDtmDateCompleted(java.util.Date dtmDateCompleted)
	{
		this.dtmDateCompleted = dtmDateCompleted;
	}

	/**
	 * Gets the value of the 'dtmDateCreated' field.
	 */
	public java.util.Date getDtmDateCreated()
	{
		return dtmDateCreated;
	}

	/**
	 * Sets the value of the 'dtmDateCreated' field.
	 */
	public void setDtmDateCreated(java.util.Date dtmDateCreated)
	{
		this.dtmDateCreated = dtmDateCreated;
	}

	/**
	 * Gets the value of the 'dtmDateLastModified' field.
	 */
	public java.util.Date getDtmDateLastModified()
	{
		return dtmDateLastModified;
	}

	/**
	 * Sets the value of the 'dtmDateLastModified' field.
	 */
	public void setDtmDateLastModified(java.util.Date dtmDateLastModified)
	{
		this.dtmDateLastModified = dtmDateLastModified;
	}

	/**
	 * Gets the value of the 'dtmSuggestedCompletionDate' field.
	 */
	public java.util.Date getDtmSuggestedCompletionDate()
	{
		return dtmSuggestedCompletionDate;
	}

	/**
	 * Sets the value of the 'dtmSuggestedCompletionDate' field.
	 */
	public void setDtmSuggestedCompletionDate(java.util.Date dtmSuggestedCompletionDate)
	{
		this.dtmSuggestedCompletionDate = dtmSuggestedCompletionDate;
	}

	/**
	 * Gets the value of the 'intCompletedByUserID' field.
	 */
	public java.lang.Long getIntCompletedByUserID()
	{
		return intCompletedByUserID;
	}

	/**
	 * Sets the value of the 'intCompletedByUserID' field.
	 */
	public void setIntCompletedByUserID(java.lang.Long intCompletedByUserID)
	{
		this.intCompletedByUserID = intCompletedByUserID;
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
	 * Gets the value of the 'intRCAActionID' field.
	 */
	public java.lang.Long getIntRCAActionID()
	{
		return intRCAActionID;
	}

	/**
	 * Sets the value of the 'intRCAActionID' field.
	 */
	public void setIntRCAActionID(java.lang.Long intRCAActionID)
	{
		this.intRCAActionID = intRCAActionID;
	}

	/**
	 * Gets the value of the 'intRCACauseID' field.
	 */
	public java.lang.Long getIntRCACauseID()
	{
		return intRCACauseID;
	}

	/**
	 * Sets the value of the 'intRCACauseID' field.
	 */
	public void setIntRCACauseID(java.lang.Long intRCACauseID)
	{
		this.intRCACauseID = intRCACauseID;
	}

	/**
	 * Gets the value of the 'intRCAProblemID' field.
	 */
	public java.lang.Long getIntRCAProblemID()
	{
		return intRCAProblemID;
	}

	/**
	 * Sets the value of the 'intRCAProblemID' field.
	 */
	public void setIntRCAProblemID(java.lang.Long intRCAProblemID)
	{
		this.intRCAProblemID = intRCAProblemID;
	}

	/**
	 * Gets the value of the 'intRequestedByUserID' field.
	 */
	public java.lang.Long getIntRequestedByUserID()
	{
		return intRequestedByUserID;
	}

	/**
	 * Sets the value of the 'intRequestedByUserID' field.
	 */
	public void setIntRequestedByUserID(java.lang.Long intRequestedByUserID)
	{
		this.intRequestedByUserID = intRequestedByUserID;
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
	 * Gets the value of the 'intUpdated' field.
	 */
	public java.lang.Long getIntUpdated()
	{
		return intUpdated;
	}

	/**
	 * Sets the value of the 'intUpdated' field.
	 */
	public void setIntUpdated(java.lang.Long intUpdated)
	{
		this.intUpdated = intUpdated;
	}

	/**
	 * Gets the value of the 'intWorkOrderStatusGroup' field.
	 */
	public java.lang.Long getIntWorkOrderStatusGroup()
	{
		return intWorkOrderStatusGroup;
	}

	/**
	 * Sets the value of the 'intWorkOrderStatusGroup' field.
	 */
	public void setIntWorkOrderStatusGroup(java.lang.Long intWorkOrderStatusGroup)
	{
		this.intWorkOrderStatusGroup = intWorkOrderStatusGroup;
	}

	/**
	 * Gets the value of the 'intWorkOrderStatusID' field.
	 */
	public java.lang.Long getIntWorkOrderStatusID()
	{
		return intWorkOrderStatusID;
	}

	/**
	 * Sets the value of the 'intWorkOrderStatusID' field.
	 */
	public void setIntWorkOrderStatusID(java.lang.Long intWorkOrderStatusID)
	{
		this.intWorkOrderStatusID = intWorkOrderStatusID;
	}

	/**
	 * Gets the value of the 'strAdminNotes' field.
	 */
	public java.lang.String getStrAdminNotes()
	{
		return strAdminNotes;
	}

	/**
	 * Sets the value of the 'strAdminNotes' field.
	 */
	public void setStrAdminNotes(java.lang.String strAdminNotes)
	{
		this.strAdminNotes = strAdminNotes;
	}

	/**
	 * Gets the value of the 'strAssetIds' field.
	 */
	public java.lang.String getStrAssetIds()
	{
		return strAssetIds;
	}

	/**
	 * Sets the value of the 'strAssetIds' field.
	 */
	public void setStrAssetIds(java.lang.String strAssetIds)
	{
		this.strAssetIds = strAssetIds;
	}

	/**
	 * Gets the value of the 'strAssets' field.
	 */
	public java.lang.String getStrAssets()
	{
		return strAssets;
	}

	/**
	 * Sets the value of the 'strAssets' field.
	 */
	public void setStrAssets(java.lang.String strAssets)
	{
		this.strAssets = strAssets;
	}

	/**
	 * Gets the value of the 'strAssignedUserIds' field.
	 */
	public java.lang.String getStrAssignedUserIds()
	{
		return strAssignedUserIds;
	}

	/**
	 * Sets the value of the 'strAssignedUserIds' field.
	 */
	public void setStrAssignedUserIds(java.lang.String strAssignedUserIds)
	{
		this.strAssignedUserIds = strAssignedUserIds;
	}

	/**
	 * Gets the value of the 'strAssignedUsers' field.
	 */
	public java.lang.String getStrAssignedUsers()
	{
		return strAssignedUsers;
	}

	/**
	 * Sets the value of the 'strAssignedUsers' field.
	 */
	public void setStrAssignedUsers(java.lang.String strAssignedUsers)
	{
		this.strAssignedUsers = strAssignedUsers;
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
	 * Gets the value of the 'strCompletedByUserIds' field.
	 */
	public java.lang.String getStrCompletedByUserIds()
	{
		return strCompletedByUserIds;
	}

	/**
	 * Sets the value of the 'strCompletedByUserIds' field.
	 */
	public void setStrCompletedByUserIds(java.lang.String strCompletedByUserIds)
	{
		this.strCompletedByUserIds = strCompletedByUserIds;
	}

	/**
	 * Gets the value of the 'strCompletedByUsers' field.
	 */
	public java.lang.String getStrCompletedByUsers()
	{
		return strCompletedByUsers;
	}

	/**
	 * Sets the value of the 'strCompletedByUsers' field.
	 */
	public void setStrCompletedByUsers(java.lang.String strCompletedByUsers)
	{
		this.strCompletedByUsers = strCompletedByUsers;
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
	 * Gets the value of the 'strEmailUserGuest' field.
	 */
	public java.lang.String getStrEmailUserGuest()
	{
		return strEmailUserGuest;
	}

	/**
	 * Sets the value of the 'strEmailUserGuest' field.
	 */
	public void setStrEmailUserGuest(java.lang.String strEmailUserGuest)
	{
		this.strEmailUserGuest = strEmailUserGuest;
	}

	/**
	 * Gets the value of the 'strNameUserGuest' field.
	 */
	public java.lang.String getStrNameUserGuest()
	{
		return strNameUserGuest;
	}

	/**
	 * Sets the value of the 'strNameUserGuest' field.
	 */
	public void setStrNameUserGuest(java.lang.String strNameUserGuest)
	{
		this.strNameUserGuest = strNameUserGuest;
	}

	/**
	 * Gets the value of the 'strPhoneUserGuest' field.
	 */
	public java.lang.String getStrPhoneUserGuest()
	{
		return strPhoneUserGuest;
	}

	/**
	 * Sets the value of the 'strPhoneUserGuest' field.
	 */
	public void setStrPhoneUserGuest(java.lang.String strPhoneUserGuest)
	{
		this.strPhoneUserGuest = strPhoneUserGuest;
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
