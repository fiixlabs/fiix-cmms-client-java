package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetCycleCountClassificationLog' table.
 * @generated
 */
public class AssetCycleCountClassificationLog extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intCycleCountClassificationLogID;
	private java.lang.String strClassification;
		

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
	 * Gets the value of the 'intCycleCountClassificationLogID' field.
	 */
	public java.lang.Long getIntCycleCountClassificationLogID()
	{
		return intCycleCountClassificationLogID;
	}

	/**
	 * Sets the value of the 'intCycleCountClassificationLogID' field.
	 */
	public void setIntCycleCountClassificationLogID(java.lang.Long intCycleCountClassificationLogID)
	{
		this.intCycleCountClassificationLogID = intCycleCountClassificationLogID;
	}

	/**
	 * Gets the value of the 'strClassification' field.
	 */
	public java.lang.String getStrClassification()
	{
		return strClassification;
	}

	/**
	 * Sets the value of the 'strClassification' field.
	 */
	public void setStrClassification(java.lang.String strClassification)
	{
		this.strClassification = strClassification;
	}
}
