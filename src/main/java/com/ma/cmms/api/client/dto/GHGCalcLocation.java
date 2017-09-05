package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'GHGCalcLocation' table.
 * @generated
 */
public class GHGCalcLocation extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblGramsPerkWh;
	private java.lang.String strName;
	private java.lang.String strRegionLabel;
	private java.lang.String strZIPPostalCode;
		

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
	 * Gets the value of the 'dblGramsPerkWh' field.
	 */
	public java.lang.Double getDblGramsPerkWh()
	{
		return dblGramsPerkWh;
	}

	/**
	 * Sets the value of the 'dblGramsPerkWh' field.
	 */
	public void setDblGramsPerkWh(java.lang.Double dblGramsPerkWh)
	{
		this.dblGramsPerkWh = dblGramsPerkWh;
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
	 * Gets the value of the 'strRegionLabel' field.
	 */
	public java.lang.String getStrRegionLabel()
	{
		return strRegionLabel;
	}

	/**
	 * Sets the value of the 'strRegionLabel' field.
	 */
	public void setStrRegionLabel(java.lang.String strRegionLabel)
	{
		this.strRegionLabel = strRegionLabel;
	}

	/**
	 * Gets the value of the 'strZIPPostalCode' field.
	 */
	public java.lang.String getStrZIPPostalCode()
	{
		return strZIPPostalCode;
	}

	/**
	 * Sets the value of the 'strZIPPostalCode' field.
	 */
	public void setStrZIPPostalCode(java.lang.String strZIPPostalCode)
	{
		this.strZIPPostalCode = strZIPPostalCode;
	}
}
