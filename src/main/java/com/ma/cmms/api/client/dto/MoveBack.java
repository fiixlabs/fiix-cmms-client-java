package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'MoveBack' table.
 * @generated
 */
public class MoveBack extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateCanceled;
	private java.util.Date dtmDateConfirmed;
	private java.util.Date dtmDateCreated;
	private java.util.Date dtmDateRequested;
	private java.util.Date dtmMoveBackDate;
	private java.lang.Long intConfirmedByID;
	private java.lang.Long intFromSiteID;
	private java.lang.Long intMoveStatusID;
	private java.lang.Long intMovedBackByUserID;
	private java.lang.Long intRejectedByID;
	private java.lang.Long intRequestedByID;
	private java.lang.Long intSiteID;
	private java.lang.String strNotes;
		

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
	 * Gets the value of the 'dtmDateCanceled' field.
	 */
	public java.util.Date getDtmDateCanceled()
	{
		return dtmDateCanceled;
	}

	/**
	 * Sets the value of the 'dtmDateCanceled' field.
	 */
	public void setDtmDateCanceled(java.util.Date dtmDateCanceled)
	{
		this.dtmDateCanceled = dtmDateCanceled;
	}

	/**
	 * Gets the value of the 'dtmDateConfirmed' field.
	 */
	public java.util.Date getDtmDateConfirmed()
	{
		return dtmDateConfirmed;
	}

	/**
	 * Sets the value of the 'dtmDateConfirmed' field.
	 */
	public void setDtmDateConfirmed(java.util.Date dtmDateConfirmed)
	{
		this.dtmDateConfirmed = dtmDateConfirmed;
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
	 * Gets the value of the 'dtmDateRequested' field.
	 */
	public java.util.Date getDtmDateRequested()
	{
		return dtmDateRequested;
	}

	/**
	 * Sets the value of the 'dtmDateRequested' field.
	 */
	public void setDtmDateRequested(java.util.Date dtmDateRequested)
	{
		this.dtmDateRequested = dtmDateRequested;
	}

	/**
	 * Gets the value of the 'dtmMoveBackDate' field.
	 */
	public java.util.Date getDtmMoveBackDate()
	{
		return dtmMoveBackDate;
	}

	/**
	 * Sets the value of the 'dtmMoveBackDate' field.
	 */
	public void setDtmMoveBackDate(java.util.Date dtmMoveBackDate)
	{
		this.dtmMoveBackDate = dtmMoveBackDate;
	}

	/**
	 * Gets the value of the 'intConfirmedByID' field.
	 */
	public java.lang.Long getIntConfirmedByID()
	{
		return intConfirmedByID;
	}

	/**
	 * Sets the value of the 'intConfirmedByID' field.
	 */
	public void setIntConfirmedByID(java.lang.Long intConfirmedByID)
	{
		this.intConfirmedByID = intConfirmedByID;
	}

	/**
	 * Gets the value of the 'intFromSiteID' field.
	 */
	public java.lang.Long getIntFromSiteID()
	{
		return intFromSiteID;
	}

	/**
	 * Sets the value of the 'intFromSiteID' field.
	 */
	public void setIntFromSiteID(java.lang.Long intFromSiteID)
	{
		this.intFromSiteID = intFromSiteID;
	}

	/**
	 * Gets the value of the 'intMoveStatusID' field.
	 */
	public java.lang.Long getIntMoveStatusID()
	{
		return intMoveStatusID;
	}

	/**
	 * Sets the value of the 'intMoveStatusID' field.
	 */
	public void setIntMoveStatusID(java.lang.Long intMoveStatusID)
	{
		this.intMoveStatusID = intMoveStatusID;
	}

	/**
	 * Gets the value of the 'intMovedBackByUserID' field.
	 */
	public java.lang.Long getIntMovedBackByUserID()
	{
		return intMovedBackByUserID;
	}

	/**
	 * Sets the value of the 'intMovedBackByUserID' field.
	 */
	public void setIntMovedBackByUserID(java.lang.Long intMovedBackByUserID)
	{
		this.intMovedBackByUserID = intMovedBackByUserID;
	}

	/**
	 * Gets the value of the 'intRejectedByID' field.
	 */
	public java.lang.Long getIntRejectedByID()
	{
		return intRejectedByID;
	}

	/**
	 * Sets the value of the 'intRejectedByID' field.
	 */
	public void setIntRejectedByID(java.lang.Long intRejectedByID)
	{
		this.intRejectedByID = intRejectedByID;
	}

	/**
	 * Gets the value of the 'intRequestedByID' field.
	 */
	public java.lang.Long getIntRequestedByID()
	{
		return intRequestedByID;
	}

	/**
	 * Sets the value of the 'intRequestedByID' field.
	 */
	public void setIntRequestedByID(java.lang.Long intRequestedByID)
	{
		this.intRequestedByID = intRequestedByID;
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
	 * Gets the value of the 'strNotes' field.
	 */
	public java.lang.String getStrNotes()
	{
		return strNotes;
	}

	/**
	 * Sets the value of the 'strNotes' field.
	 */
	public void setStrNotes(java.lang.String strNotes)
	{
		this.strNotes = strNotes;
	}
}
