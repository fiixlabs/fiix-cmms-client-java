package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'MoveAsset' table.
 * @generated
 */
public class MoveAsset extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolAway;
	private java.lang.Long bolExclude;
	private java.lang.Long bolPending;
	private java.lang.Long bolSetOffline;
	private java.lang.Long bolSetOnline;
	private java.util.Date dtmDateReturned;
	private java.util.Date dtmReturnDate;
	private java.lang.Long intAssetID;
	private java.lang.Long intMoveID;
	private java.lang.Long intMovedFromID;
	private java.lang.Long intReasonOfflineID;
	private java.lang.Long intReasonOnlineID;
	private java.lang.Long intSiteID;
	private java.lang.String strFromAisle;
	private java.lang.String strFromBin;
	private java.lang.String strFromRow;
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
	 * Gets the value of the 'bolAway' field.
	 */
	public java.lang.Long getBolAway()
	{
		return bolAway;
	}

	/**
	 * Sets the value of the 'bolAway' field.
	 */
	public void setBolAway(java.lang.Long bolAway)
	{
		this.bolAway = bolAway;
	}

	/**
	 * Gets the value of the 'bolExclude' field.
	 */
	public java.lang.Long getBolExclude()
	{
		return bolExclude;
	}

	/**
	 * Sets the value of the 'bolExclude' field.
	 */
	public void setBolExclude(java.lang.Long bolExclude)
	{
		this.bolExclude = bolExclude;
	}

	/**
	 * Gets the value of the 'bolPending' field.
	 */
	public java.lang.Long getBolPending()
	{
		return bolPending;
	}

	/**
	 * Sets the value of the 'bolPending' field.
	 */
	public void setBolPending(java.lang.Long bolPending)
	{
		this.bolPending = bolPending;
	}

	/**
	 * Gets the value of the 'bolSetOffline' field.
	 */
	public java.lang.Long getBolSetOffline()
	{
		return bolSetOffline;
	}

	/**
	 * Sets the value of the 'bolSetOffline' field.
	 */
	public void setBolSetOffline(java.lang.Long bolSetOffline)
	{
		this.bolSetOffline = bolSetOffline;
	}

	/**
	 * Gets the value of the 'bolSetOnline' field.
	 */
	public java.lang.Long getBolSetOnline()
	{
		return bolSetOnline;
	}

	/**
	 * Sets the value of the 'bolSetOnline' field.
	 */
	public void setBolSetOnline(java.lang.Long bolSetOnline)
	{
		this.bolSetOnline = bolSetOnline;
	}

	/**
	 * Gets the value of the 'dtmDateReturned' field.
	 */
	public java.util.Date getDtmDateReturned()
	{
		return dtmDateReturned;
	}

	/**
	 * Sets the value of the 'dtmDateReturned' field.
	 */
	public void setDtmDateReturned(java.util.Date dtmDateReturned)
	{
		this.dtmDateReturned = dtmDateReturned;
	}

	/**
	 * Gets the value of the 'dtmReturnDate' field.
	 */
	public java.util.Date getDtmReturnDate()
	{
		return dtmReturnDate;
	}

	/**
	 * Sets the value of the 'dtmReturnDate' field.
	 */
	public void setDtmReturnDate(java.util.Date dtmReturnDate)
	{
		this.dtmReturnDate = dtmReturnDate;
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
	 * Gets the value of the 'intMoveID' field.
	 */
	public java.lang.Long getIntMoveID()
	{
		return intMoveID;
	}

	/**
	 * Sets the value of the 'intMoveID' field.
	 */
	public void setIntMoveID(java.lang.Long intMoveID)
	{
		this.intMoveID = intMoveID;
	}

	/**
	 * Gets the value of the 'intMovedFromID' field.
	 */
	public java.lang.Long getIntMovedFromID()
	{
		return intMovedFromID;
	}

	/**
	 * Sets the value of the 'intMovedFromID' field.
	 */
	public void setIntMovedFromID(java.lang.Long intMovedFromID)
	{
		this.intMovedFromID = intMovedFromID;
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
	 * Gets the value of the 'strFromAisle' field.
	 */
	public java.lang.String getStrFromAisle()
	{
		return strFromAisle;
	}

	/**
	 * Sets the value of the 'strFromAisle' field.
	 */
	public void setStrFromAisle(java.lang.String strFromAisle)
	{
		this.strFromAisle = strFromAisle;
	}

	/**
	 * Gets the value of the 'strFromBin' field.
	 */
	public java.lang.String getStrFromBin()
	{
		return strFromBin;
	}

	/**
	 * Sets the value of the 'strFromBin' field.
	 */
	public void setStrFromBin(java.lang.String strFromBin)
	{
		this.strFromBin = strFromBin;
	}

	/**
	 * Gets the value of the 'strFromRow' field.
	 */
	public java.lang.String getStrFromRow()
	{
		return strFromRow;
	}

	/**
	 * Sets the value of the 'strFromRow' field.
	 */
	public void setStrFromRow(java.lang.String strFromRow)
	{
		this.strFromRow = strFromRow;
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
