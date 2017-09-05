package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'GHGCalcGWP' table.
 * @generated
 */
public class GHGCalcGWP extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intHundredYearGWP;
	private java.lang.String strDescription;
	private java.lang.String strName;
		

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
	 * Gets the value of the 'intHundredYearGWP' field.
	 */
	public java.lang.Long getIntHundredYearGWP()
	{
		return intHundredYearGWP;
	}

	/**
	 * Sets the value of the 'intHundredYearGWP' field.
	 */
	public void setIntHundredYearGWP(java.lang.Long intHundredYearGWP)
	{
		this.intHundredYearGWP = intHundredYearGWP;
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
}
