package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'ChargeDepartment' table.
 * @generated
 */
public class ChargeDepartment extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intFacilityID;
	private java.lang.String strCode;
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
	 * Gets the value of the 'intFacilityID' field.
	 */
	public java.lang.Long getIntFacilityID()
	{
		return intFacilityID;
	}

	/**
	 * Sets the value of the 'intFacilityID' field.
	 */
	public void setIntFacilityID(java.lang.Long intFacilityID)
	{
		this.intFacilityID = intFacilityID;
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
