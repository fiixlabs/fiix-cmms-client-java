package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetPropertyValue' table.
 * @generated
 */
public class AssetPropertyValue extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Double dblElevation;
	private java.lang.Double dblLatitude;
	private java.lang.Double dblLongitude;
	private java.lang.Double dblValue;
	private java.util.Date dtmCreateDate;
	private java.util.Date dtmSourceDate;
	private java.lang.Long intAssetEventTypeId;
	private java.lang.Long intAssetPropertyDomainElementID;
	private java.lang.Long intAssetPropertyID;
		

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
	 * Gets the value of the 'dblElevation' field.
	 */
	public java.lang.Double getDblElevation()
	{
		return dblElevation;
	}

	/**
	 * Sets the value of the 'dblElevation' field.
	 */
	public void setDblElevation(java.lang.Double dblElevation)
	{
		this.dblElevation = dblElevation;
	}

	/**
	 * Gets the value of the 'dblLatitude' field.
	 */
	public java.lang.Double getDblLatitude()
	{
		return dblLatitude;
	}

	/**
	 * Sets the value of the 'dblLatitude' field.
	 */
	public void setDblLatitude(java.lang.Double dblLatitude)
	{
		this.dblLatitude = dblLatitude;
	}

	/**
	 * Gets the value of the 'dblLongitude' field.
	 */
	public java.lang.Double getDblLongitude()
	{
		return dblLongitude;
	}

	/**
	 * Sets the value of the 'dblLongitude' field.
	 */
	public void setDblLongitude(java.lang.Double dblLongitude)
	{
		this.dblLongitude = dblLongitude;
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
	 * Gets the value of the 'dtmCreateDate' field.
	 */
	public java.util.Date getDtmCreateDate()
	{
		return dtmCreateDate;
	}

	/**
	 * Sets the value of the 'dtmCreateDate' field.
	 */
	public void setDtmCreateDate(java.util.Date dtmCreateDate)
	{
		this.dtmCreateDate = dtmCreateDate;
	}

	/**
	 * Gets the value of the 'dtmSourceDate' field.
	 */
	public java.util.Date getDtmSourceDate()
	{
		return dtmSourceDate;
	}

	/**
	 * Sets the value of the 'dtmSourceDate' field.
	 */
	public void setDtmSourceDate(java.util.Date dtmSourceDate)
	{
		this.dtmSourceDate = dtmSourceDate;
	}

	/**
	 * Gets the value of the 'intAssetEventTypeId' field.
	 */
	public java.lang.Long getIntAssetEventTypeId()
	{
		return intAssetEventTypeId;
	}

	/**
	 * Sets the value of the 'intAssetEventTypeId' field.
	 */
	public void setIntAssetEventTypeId(java.lang.Long intAssetEventTypeId)
	{
		this.intAssetEventTypeId = intAssetEventTypeId;
	}

	/**
	 * Gets the value of the 'intAssetPropertyDomainElementID' field.
	 */
	public java.lang.Long getIntAssetPropertyDomainElementID()
	{
		return intAssetPropertyDomainElementID;
	}

	/**
	 * Sets the value of the 'intAssetPropertyDomainElementID' field.
	 */
	public void setIntAssetPropertyDomainElementID(java.lang.Long intAssetPropertyDomainElementID)
	{
		this.intAssetPropertyDomainElementID = intAssetPropertyDomainElementID;
	}

	/**
	 * Gets the value of the 'intAssetPropertyID' field.
	 */
	public java.lang.Long getIntAssetPropertyID()
	{
		return intAssetPropertyID;
	}

	/**
	 * Sets the value of the 'intAssetPropertyID' field.
	 */
	public void setIntAssetPropertyID(java.lang.Long intAssetPropertyID)
	{
		this.intAssetPropertyID = intAssetPropertyID;
	}
}
