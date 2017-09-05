package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'KpiResult' table.
 * @generated
 */
public class KpiResult extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolBase;
	private java.lang.Double dblValue;
	private java.util.Date dtmTime;
	private java.lang.Long intErrorCode;
	private java.lang.Integer intQueryHash;
	private java.lang.Long intWidgetPositionID;
	private java.lang.String strQuery;
		

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
	 * Gets the value of the 'bolBase' field.
	 */
	public java.lang.Long getBolBase()
	{
		return bolBase;
	}

	/**
	 * Sets the value of the 'bolBase' field.
	 */
	public void setBolBase(java.lang.Long bolBase)
	{
		this.bolBase = bolBase;
	}

	/**
	 * Gets the value of the 'dblValue' field.
	 */
	public java.lang.Double getDblValue()
	{
		return dblValue;
	}

	/**
	 * Sets the value of the 'dblValue' field.
	 */
	public void setDblValue(java.lang.Double dblValue)
	{
		this.dblValue = dblValue;
	}

	/**
	 * Gets the value of the 'dtmTime' field.
	 */
	public java.util.Date getDtmTime()
	{
		return dtmTime;
	}

	/**
	 * Sets the value of the 'dtmTime' field.
	 */
	public void setDtmTime(java.util.Date dtmTime)
	{
		this.dtmTime = dtmTime;
	}

	/**
	 * Gets the value of the 'intErrorCode' field.
	 */
	public java.lang.Long getIntErrorCode()
	{
		return intErrorCode;
	}

	/**
	 * Sets the value of the 'intErrorCode' field.
	 */
	public void setIntErrorCode(java.lang.Long intErrorCode)
	{
		this.intErrorCode = intErrorCode;
	}

	/**
	 * Gets the value of the 'intQueryHash' field.
	 */
	public java.lang.Integer getIntQueryHash()
	{
		return intQueryHash;
	}

	/**
	 * Sets the value of the 'intQueryHash' field.
	 */
	public void setIntQueryHash(java.lang.Integer intQueryHash)
	{
		this.intQueryHash = intQueryHash;
	}

	/**
	 * Gets the value of the 'intWidgetPositionID' field.
	 */
	public java.lang.Long getIntWidgetPositionID()
	{
		return intWidgetPositionID;
	}

	/**
	 * Sets the value of the 'intWidgetPositionID' field.
	 */
	public void setIntWidgetPositionID(java.lang.Long intWidgetPositionID)
	{
		this.intWidgetPositionID = intWidgetPositionID;
	}

	/**
	 * Gets the value of the 'strQuery' field.
	 */
	public java.lang.String getStrQuery()
	{
		return strQuery;
	}

	/**
	 * Sets the value of the 'strQuery' field.
	 */
	public void setStrQuery(java.lang.String strQuery)
	{
		this.strQuery = strQuery;
	}
}
