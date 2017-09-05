package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'Move' table.
 * @generated
 */
public class Move extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.util.Date dtmDateConfirmed;
	private java.util.Date dtmDateRejected;
	private java.util.Date dtmDateRequested;
	private java.util.Date dtmMoveDate;
	private java.lang.Long intAssetDestinationID;
	private java.lang.Long intBusinessDestinationID;
	private java.lang.Long intConfirmedByID;
	private java.lang.Long intDestinationTypeID;
	private java.lang.Long intFromSiteID;
	private java.lang.Long intMoveStatusID;
	private java.lang.Long intMovedByID;
	private java.lang.Long intProjectDestinationID;
	private java.lang.Long intRejectedByID;
	private java.lang.Long intRequestedByID;
	private java.lang.Long intSiteID;
	private java.lang.Long intUserDestinationID;
	private java.lang.Long intWorkOrderDestinationID;
	private java.lang.String strAisle;
	private java.lang.String strBin;
	private java.lang.String strNotes;
	private java.lang.String strRow;
		

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
	 * Gets the value of the 'dtmDateRejected' field.
	 */
	public java.util.Date getDtmDateRejected()
	{
		return dtmDateRejected;
	}

	/**
	 * Sets the value of the 'dtmDateRejected' field.
	 */
	public void setDtmDateRejected(java.util.Date dtmDateRejected)
	{
		this.dtmDateRejected = dtmDateRejected;
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
	 * Gets the value of the 'dtmMoveDate' field.
	 */
	public java.util.Date getDtmMoveDate()
	{
		return dtmMoveDate;
	}

	/**
	 * Sets the value of the 'dtmMoveDate' field.
	 */
	public void setDtmMoveDate(java.util.Date dtmMoveDate)
	{
		this.dtmMoveDate = dtmMoveDate;
	}

	/**
	 * Gets the value of the 'intAssetDestinationID' field.
	 */
	public java.lang.Long getIntAssetDestinationID()
	{
		return intAssetDestinationID;
	}

	/**
	 * Sets the value of the 'intAssetDestinationID' field.
	 */
	public void setIntAssetDestinationID(java.lang.Long intAssetDestinationID)
	{
		this.intAssetDestinationID = intAssetDestinationID;
	}

	/**
	 * Gets the value of the 'intBusinessDestinationID' field.
	 */
	public java.lang.Long getIntBusinessDestinationID()
	{
		return intBusinessDestinationID;
	}

	/**
	 * Sets the value of the 'intBusinessDestinationID' field.
	 */
	public void setIntBusinessDestinationID(java.lang.Long intBusinessDestinationID)
	{
		this.intBusinessDestinationID = intBusinessDestinationID;
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
	 * Gets the value of the 'intDestinationTypeID' field.
	 */
	public java.lang.Long getIntDestinationTypeID()
	{
		return intDestinationTypeID;
	}

	/**
	 * Sets the value of the 'intDestinationTypeID' field.
	 */
	public void setIntDestinationTypeID(java.lang.Long intDestinationTypeID)
	{
		this.intDestinationTypeID = intDestinationTypeID;
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
	 * Gets the value of the 'intMovedByID' field.
	 */
	public java.lang.Long getIntMovedByID()
	{
		return intMovedByID;
	}

	/**
	 * Sets the value of the 'intMovedByID' field.
	 */
	public void setIntMovedByID(java.lang.Long intMovedByID)
	{
		this.intMovedByID = intMovedByID;
	}

	/**
	 * Gets the value of the 'intProjectDestinationID' field.
	 */
	public java.lang.Long getIntProjectDestinationID()
	{
		return intProjectDestinationID;
	}

	/**
	 * Sets the value of the 'intProjectDestinationID' field.
	 */
	public void setIntProjectDestinationID(java.lang.Long intProjectDestinationID)
	{
		this.intProjectDestinationID = intProjectDestinationID;
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
	 * Gets the value of the 'intUserDestinationID' field.
	 */
	public java.lang.Long getIntUserDestinationID()
	{
		return intUserDestinationID;
	}

	/**
	 * Sets the value of the 'intUserDestinationID' field.
	 */
	public void setIntUserDestinationID(java.lang.Long intUserDestinationID)
	{
		this.intUserDestinationID = intUserDestinationID;
	}

	/**
	 * Gets the value of the 'intWorkOrderDestinationID' field.
	 */
	public java.lang.Long getIntWorkOrderDestinationID()
	{
		return intWorkOrderDestinationID;
	}

	/**
	 * Sets the value of the 'intWorkOrderDestinationID' field.
	 */
	public void setIntWorkOrderDestinationID(java.lang.Long intWorkOrderDestinationID)
	{
		this.intWorkOrderDestinationID = intWorkOrderDestinationID;
	}

	/**
	 * Gets the value of the 'strAisle' field.
	 */
	public java.lang.String getStrAisle()
	{
		return strAisle;
	}

	/**
	 * Sets the value of the 'strAisle' field.
	 */
	public void setStrAisle(java.lang.String strAisle)
	{
		this.strAisle = strAisle;
	}

	/**
	 * Gets the value of the 'strBin' field.
	 */
	public java.lang.String getStrBin()
	{
		return strBin;
	}

	/**
	 * Sets the value of the 'strBin' field.
	 */
	public void setStrBin(java.lang.String strBin)
	{
		this.strBin = strBin;
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

	/**
	 * Gets the value of the 'strRow' field.
	 */
	public java.lang.String getStrRow()
	{
		return strRow;
	}

	/**
	 * Sets the value of the 'strRow' field.
	 */
	public void setStrRow(java.lang.String strRow)
	{
		this.strRow = strRow;
	}
}
