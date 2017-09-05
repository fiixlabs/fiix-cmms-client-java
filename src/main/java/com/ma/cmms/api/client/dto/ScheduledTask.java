package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ScheduledTask' table.
 * @generated
 */
public class ScheduledTask extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblTimeEstimatedHours;
	private java.lang.Long intAssetID;
	private java.lang.Long intAssignedToUserID;
	private java.lang.Long intMeterReadingUnitID;
	private java.lang.Long intOrder;
	private java.lang.Long intParentScheduledTaskID;
	private java.lang.Long intScheduledMaintenanceID;
	private java.lang.Long intTaskType;
	private java.lang.String strDescription;
		

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
	 * Gets the value of the 'intParentScheduledTaskID' field.
	 */
	public java.lang.Long getIntParentScheduledTaskID()
	{
		return intParentScheduledTaskID;
	}

	/**
	 * Sets the value of the 'intParentScheduledTaskID' field.
	 */
	public void setIntParentScheduledTaskID(java.lang.Long intParentScheduledTaskID)
	{
		this.intParentScheduledTaskID = intParentScheduledTaskID;
	}

	/**
	 * Gets the value of the 'intScheduledMaintenanceID' field.
	 */
	public java.lang.Long getIntScheduledMaintenanceID()
	{
		return intScheduledMaintenanceID;
	}

	/**
	 * Sets the value of the 'intScheduledMaintenanceID' field.
	 */
	public void setIntScheduledMaintenanceID(java.lang.Long intScheduledMaintenanceID)
	{
		this.intScheduledMaintenanceID = intScheduledMaintenanceID;
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
}
