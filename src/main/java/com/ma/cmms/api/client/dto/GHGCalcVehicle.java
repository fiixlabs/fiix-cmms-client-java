package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'GHGCalcVehicle' table.
 * @generated
 */
public class GHGCalcVehicle extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolIsOnRoad;
	private java.lang.Double dblGramsCHFourPerPrimaryUnit;
	private java.lang.Double dblGramsNTwoOPerPrimaryUnit;
	private java.lang.String strName;
	private java.lang.String strSubNameLabel;
		

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
	 * Gets the value of the 'bolIsOnRoad' field.
	 */
	public java.lang.Long getBolIsOnRoad()
	{
		return bolIsOnRoad;
	}

	/**
	 * Sets the value of the 'bolIsOnRoad' field.
	 */
	public void setBolIsOnRoad(java.lang.Long bolIsOnRoad)
	{
		this.bolIsOnRoad = bolIsOnRoad;
	}

	/**
	 * Gets the value of the 'dblGramsCHFourPerPrimaryUnit' field.
	 */
	public java.lang.Double getDblGramsCHFourPerPrimaryUnit()
	{
		return dblGramsCHFourPerPrimaryUnit;
	}

	/**
	 * Sets the value of the 'dblGramsCHFourPerPrimaryUnit' field.
	 */
	public void setDblGramsCHFourPerPrimaryUnit(java.lang.Double dblGramsCHFourPerPrimaryUnit)
	{
		this.dblGramsCHFourPerPrimaryUnit = dblGramsCHFourPerPrimaryUnit;
	}

	/**
	 * Gets the value of the 'dblGramsNTwoOPerPrimaryUnit' field.
	 */
	public java.lang.Double getDblGramsNTwoOPerPrimaryUnit()
	{
		return dblGramsNTwoOPerPrimaryUnit;
	}

	/**
	 * Sets the value of the 'dblGramsNTwoOPerPrimaryUnit' field.
	 */
	public void setDblGramsNTwoOPerPrimaryUnit(java.lang.Double dblGramsNTwoOPerPrimaryUnit)
	{
		this.dblGramsNTwoOPerPrimaryUnit = dblGramsNTwoOPerPrimaryUnit;
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
	 * Gets the value of the 'strSubNameLabel' field.
	 */
	public java.lang.String getStrSubNameLabel()
	{
		return strSubNameLabel;
	}

	/**
	 * Sets the value of the 'strSubNameLabel' field.
	 */
	public void setStrSubNameLabel(java.lang.String strSubNameLabel)
	{
		this.strSubNameLabel = strSubNameLabel;
	}
}
