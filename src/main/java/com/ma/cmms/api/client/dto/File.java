package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'File' table.
 * @generated
 */
public class File extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intFileContentsID;
	private java.lang.Long intFileTypeID;
	private java.lang.Long intSize;
	private java.lang.Long intWorkOrderID;
	private java.lang.String strLink;
	private java.lang.String strName;
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
	 * Gets the value of the 'intFileContentsID' field.
	 */
	public java.lang.Long getIntFileContentsID()
	{
		return intFileContentsID;
	}

	/**
	 * Sets the value of the 'intFileContentsID' field.
	 */
	public void setIntFileContentsID(java.lang.Long intFileContentsID)
	{
		this.intFileContentsID = intFileContentsID;
	}

	/**
	 * Gets the value of the 'intFileTypeID' field.
	 */
	public java.lang.Long getIntFileTypeID()
	{
		return intFileTypeID;
	}

	/**
	 * Sets the value of the 'intFileTypeID' field.
	 */
	public void setIntFileTypeID(java.lang.Long intFileTypeID)
	{
		this.intFileTypeID = intFileTypeID;
	}

	/**
	 * Gets the value of the 'intSize' field.
	 */
	public java.lang.Long getIntSize()
	{
		return intSize;
	}

	/**
	 * Sets the value of the 'intSize' field.
	 */
	public void setIntSize(java.lang.Long intSize)
	{
		this.intSize = intSize;
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
	 * Gets the value of the 'strLink' field.
	 */
	public java.lang.String getStrLink()
	{
		return strLink;
	}

	/**
	 * Sets the value of the 'strLink' field.
	 */
	public void setStrLink(java.lang.String strLink)
	{
		this.strLink = strLink;
	}

	/**
	 * Gets the value of the 'strName' field.
	 */
	public java.lang.String getStrName()
	{
		return strName;
	}

	/**
	 * Sets the value of the 'strName' field.
	 */
	public void setStrName(java.lang.String strName)
	{
		this.strName = strName;
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
