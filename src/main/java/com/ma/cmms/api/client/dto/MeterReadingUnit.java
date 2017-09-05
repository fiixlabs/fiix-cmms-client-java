package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'MeterReadingUnit' table.
 * @generated
 */
public class MeterReadingUnit extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intPrecision;
	private java.lang.String strName;
	private java.lang.String strSymbol;
		

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
	 * Gets the value of the 'intPrecision' field.
	 */
	public java.lang.Long getIntPrecision()
	{
		return intPrecision;
	}

	/**
	 * Sets the value of the 'intPrecision' field.
	 */
	public void setIntPrecision(java.lang.Long intPrecision)
	{
		this.intPrecision = intPrecision;
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
	 * Gets the value of the 'strSymbol' field.
	 */
	public java.lang.String getStrSymbol()
	{
		return strSymbol;
	}

	/**
	 * Sets the value of the 'strSymbol' field.
	 */
	public void setStrSymbol(java.lang.String strSymbol)
	{
		this.strSymbol = strSymbol;
	}
}
