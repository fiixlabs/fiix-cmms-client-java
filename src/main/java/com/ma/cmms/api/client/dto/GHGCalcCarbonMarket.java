package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'GHGCalcCarbonMarket' table.
 * @generated
 */
public class GHGCalcCarbonMarket extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblCarbonPrice;
	private java.lang.String strJurisdiction;
		

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
	 * Gets the value of the 'dblCarbonPrice' field.
	 */
	public java.lang.Double getDblCarbonPrice()
	{
		return dblCarbonPrice;
	}

	/**
	 * Sets the value of the 'dblCarbonPrice' field.
	 */
	public void setDblCarbonPrice(java.lang.Double dblCarbonPrice)
	{
		this.dblCarbonPrice = dblCarbonPrice;
	}

	/**
	 * Gets the value of the 'strJurisdiction' field.
	 */
	public java.lang.String getStrJurisdiction()
	{
		return strJurisdiction;
	}

	/**
	 * Sets the value of the 'strJurisdiction' field.
	 */
	public void setStrJurisdiction(java.lang.String strJurisdiction)
	{
		this.strJurisdiction = strJurisdiction;
	}
}
