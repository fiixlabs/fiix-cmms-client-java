package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'WorkOrderUser' table.
 * @generated
 */
public class WorkOrderUser extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolNotifyOnAssignment;
	private java.lang.Long bolNotifyOnCompletion;
	private java.lang.Long bolNotifyOnOnlineOffline;
	private java.lang.Long bolNotifyOnStatusChange;
	private java.lang.Long bolNotifyOnTaskCompleted;
	private java.lang.Long intUserID;
	private java.lang.Long intWorkOrderID;
		

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
	 * Gets the value of the 'bolNotifyOnAssignment' field.
	 */
	public java.lang.Long getBolNotifyOnAssignment()
	{
		return bolNotifyOnAssignment;
	}

	/**
	 * Sets the value of the 'bolNotifyOnAssignment' field.
	 */
	public void setBolNotifyOnAssignment(java.lang.Long bolNotifyOnAssignment)
	{
		this.bolNotifyOnAssignment = bolNotifyOnAssignment;
	}

	/**
	 * Gets the value of the 'bolNotifyOnCompletion' field.
	 */
	public java.lang.Long getBolNotifyOnCompletion()
	{
		return bolNotifyOnCompletion;
	}

	/**
	 * Sets the value of the 'bolNotifyOnCompletion' field.
	 */
	public void setBolNotifyOnCompletion(java.lang.Long bolNotifyOnCompletion)
	{
		this.bolNotifyOnCompletion = bolNotifyOnCompletion;
	}

	/**
	 * Gets the value of the 'bolNotifyOnOnlineOffline' field.
	 */
	public java.lang.Long getBolNotifyOnOnlineOffline()
	{
		return bolNotifyOnOnlineOffline;
	}

	/**
	 * Sets the value of the 'bolNotifyOnOnlineOffline' field.
	 */
	public void setBolNotifyOnOnlineOffline(java.lang.Long bolNotifyOnOnlineOffline)
	{
		this.bolNotifyOnOnlineOffline = bolNotifyOnOnlineOffline;
	}

	/**
	 * Gets the value of the 'bolNotifyOnStatusChange' field.
	 */
	public java.lang.Long getBolNotifyOnStatusChange()
	{
		return bolNotifyOnStatusChange;
	}

	/**
	 * Sets the value of the 'bolNotifyOnStatusChange' field.
	 */
	public void setBolNotifyOnStatusChange(java.lang.Long bolNotifyOnStatusChange)
	{
		this.bolNotifyOnStatusChange = bolNotifyOnStatusChange;
	}

	/**
	 * Gets the value of the 'bolNotifyOnTaskCompleted' field.
	 */
	public java.lang.Long getBolNotifyOnTaskCompleted()
	{
		return bolNotifyOnTaskCompleted;
	}

	/**
	 * Sets the value of the 'bolNotifyOnTaskCompleted' field.
	 */
	public void setBolNotifyOnTaskCompleted(java.lang.Long bolNotifyOnTaskCompleted)
	{
		this.bolNotifyOnTaskCompleted = bolNotifyOnTaskCompleted;
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
}
