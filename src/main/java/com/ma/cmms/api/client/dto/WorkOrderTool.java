package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'WorkOrderTool' table.
 * @generated
 */
public class WorkOrderTool extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmUsedFrom;
	private java.util.Date dtmUsedUntil;
	private java.lang.Long intAssetID;
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
	 * Gets the value of the 'dtmUsedFrom' field.
	 */
	public java.util.Date getDtmUsedFrom()
	{
		return dtmUsedFrom;
	}

	/**
	 * Sets the value of the 'dtmUsedFrom' field.
	 */
	public void setDtmUsedFrom(java.util.Date dtmUsedFrom)
	{
		this.dtmUsedFrom = dtmUsedFrom;
	}

	/**
	 * Gets the value of the 'dtmUsedUntil' field.
	 */
	public java.util.Date getDtmUsedUntil()
	{
		return dtmUsedUntil;
	}

	/**
	 * Sets the value of the 'dtmUsedUntil' field.
	 */
	public void setDtmUsedUntil(java.util.Date dtmUsedUntil)
	{
		this.dtmUsedUntil = dtmUsedUntil;
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
