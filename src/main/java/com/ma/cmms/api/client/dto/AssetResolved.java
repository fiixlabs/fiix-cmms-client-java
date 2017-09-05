package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetResolved' table.
 * @generated
 */
public class AssetResolved extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intAncestorID;
	private java.lang.Long intDescendantID;
		

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
	 * Gets the value of the 'intAncestorID' field.
	 */
	public java.lang.Long getIntAncestorID()
	{
		return intAncestorID;
	}

	/**
	 * Sets the value of the 'intAncestorID' field.
	 */
	public void setIntAncestorID(java.lang.Long intAncestorID)
	{
		this.intAncestorID = intAncestorID;
	}

	/**
	 * Gets the value of the 'intDescendantID' field.
	 */
	public java.lang.Long getIntDescendantID()
	{
		return intDescendantID;
	}

	/**
	 * Sets the value of the 'intDescendantID' field.
	 */
	public void setIntDescendantID(java.lang.Long intDescendantID)
	{
		this.intDescendantID = intDescendantID;
	}
}
