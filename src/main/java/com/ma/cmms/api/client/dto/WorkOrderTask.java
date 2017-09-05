package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'WorkOrderTask' table.
 * @generated
 */
public class WorkOrderTask extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblTimeEstimatedHours;
	private java.lang.Double dblTimeSpentHours;
	private java.util.Date dtmDateCompleted;
	private java.util.Date dtmStartDate;
	private java.lang.Long intAssetID;
	private java.lang.Long intAssignedToUserID;
	private java.lang.Long intCompletedByUserID;
	private java.lang.Long intMeterReadingUnitID;
	private java.lang.Long intOrder;
	private java.lang.Long intParentWorkOrderTaskID;
	private java.lang.Long intTaskGroupControlID;
	private java.lang.Long intTaskType;
	private java.lang.Long intUpdated;
	private java.lang.Long intWorkOrderID;
	private java.lang.String strDescription;
	private java.lang.String strResult;
	private java.lang.String strTaskNotesCompletion;
		

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
	 * Gets the value of the 'dblTimeEstimatedHours' field.
	 */
	public java.lang.Double getDblTimeEstimatedHours()
	{
		return dblTimeEstimatedHours;
	}

	/**
	 * Sets the value of the 'dblTimeEstimatedHours' field.
	 */
	public void setDblTimeEstimatedHours(java.lang.Double dblTimeEstimatedHours)
	{
		this.dblTimeEstimatedHours = dblTimeEstimatedHours;
	}

	/**
	 * Gets the value of the 'dblTimeSpentHours' field.
	 */
	public java.lang.Double getDblTimeSpentHours()
	{
		return dblTimeSpentHours;
	}

	/**
	 * Sets the value of the 'dblTimeSpentHours' field.
	 */
	public void setDblTimeSpentHours(java.lang.Double dblTimeSpentHours)
	{
		this.dblTimeSpentHours = dblTimeSpentHours;
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
	 * Gets the value of the 'dtmStartDate' field.
	 */
	public java.util.Date getDtmStartDate()
	{
		return dtmStartDate;
	}

	/**
	 * Sets the value of the 'dtmStartDate' field.
	 */
	public void setDtmStartDate(java.util.Date dtmStartDate)
	{
		this.dtmStartDate = dtmStartDate;
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
	 * Gets the value of the 'intAssignedToUserID' field.
	 */
	public java.lang.Long getIntAssignedToUserID()
	{
		return intAssignedToUserID;
	}

	/**
	 * Sets the value of the 'intAssignedToUserID' field.
	 */
	public void setIntAssignedToUserID(java.lang.Long intAssignedToUserID)
	{
		this.intAssignedToUserID = intAssignedToUserID;
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
	 * Gets the value of the 'intMeterReadingUnitID' field.
	 */
	public java.lang.Long getIntMeterReadingUnitID()
	{
		return intMeterReadingUnitID;
	}

	/**
	 * Sets the value of the 'intMeterReadingUnitID' field.
	 */
	public void setIntMeterReadingUnitID(java.lang.Long intMeterReadingUnitID)
	{
		this.intMeterReadingUnitID = intMeterReadingUnitID;
	}

	/**
	 * Gets the value of the 'intOrder' field.
	 */
	public java.lang.Long getIntOrder()
	{
		return intOrder;
	}

	/**
	 * Sets the value of the 'intOrder' field.
	 */
	public void setIntOrder(java.lang.Long intOrder)
	{
		this.intOrder = intOrder;
	}

	/**
	 * Gets the value of the 'intParentWorkOrderTaskID' field.
	 */
	public java.lang.Long getIntParentWorkOrderTaskID()
	{
		return intParentWorkOrderTaskID;
	}

	/**
	 * Sets the value of the 'intParentWorkOrderTaskID' field.
	 */
	public void setIntParentWorkOrderTaskID(java.lang.Long intParentWorkOrderTaskID)
	{
		this.intParentWorkOrderTaskID = intParentWorkOrderTaskID;
	}

	/**
	 * Gets the value of the 'intTaskGroupControlID' field.
	 */
	public java.lang.Long getIntTaskGroupControlID()
	{
		return intTaskGroupControlID;
	}

	/**
	 * Sets the value of the 'intTaskGroupControlID' field.
	 */
	public void setIntTaskGroupControlID(java.lang.Long intTaskGroupControlID)
	{
		this.intTaskGroupControlID = intTaskGroupControlID;
	}

	/**
	 * Gets the value of the 'intTaskType' field.
	 */
	public java.lang.Long getIntTaskType()
	{
		return intTaskType;
	}

	/**
	 * Sets the value of the 'intTaskType' field.
	 */
	public void setIntTaskType(java.lang.Long intTaskType)
	{
		this.intTaskType = intTaskType;
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
	 * Gets the value of the 'strResult' field.
	 */
	public java.lang.String getStrResult()
	{
		return strResult;
	}

	/**
	 * Sets the value of the 'strResult' field.
	 */
	public void setStrResult(java.lang.String strResult)
	{
		this.strResult = strResult;
	}

	/**
	 * Gets the value of the 'strTaskNotesCompletion' field.
	 */
	public java.lang.String getStrTaskNotesCompletion()
	{
		return strTaskNotesCompletion;
	}

	/**
	 * Sets the value of the 'strTaskNotesCompletion' field.
	 */
	public void setStrTaskNotesCompletion(java.lang.String strTaskNotesCompletion)
	{
		this.strTaskNotesCompletion = strTaskNotesCompletion;
	}
}
