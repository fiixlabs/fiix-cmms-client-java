package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'AssetCategory' table.
 * @generated
 */
public class AssetCategory extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intSysCode;
	private java.lang.Long bolOverrideRules;
	private java.lang.Long intParentID;
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
	 * Gets the value of the 'intSysCode' field.
	 */
	public java.lang.Long getIntSysCode()
	{
		return intSysCode;
	}

	/**
	 * Sets the value of the 'intSysCode' field.
	 */
	public void setIntSysCode(java.lang.Long intSysCode)
	{
		this.intSysCode = intSysCode;
	}

	/**
	 * Gets the value of the 'bolOverrideRules' field.
	 */
	public java.lang.Long getBolOverrideRules()
	{
		return bolOverrideRules;
	}

	/**
	 * Sets the value of the 'bolOverrideRules' field.
	 */
	public void setBolOverrideRules(java.lang.Long bolOverrideRules)
	{
		this.bolOverrideRules = bolOverrideRules;
	}

	/**
	 * Gets the value of the 'intParentID' field.
	 */
	public java.lang.Long getIntParentID()
	{
		return intParentID;
	}

	/**
	 * Sets the value of the 'intParentID' field.
	 */
	public void setIntParentID(java.lang.Long intParentID)
	{
		this.intParentID = intParentID;
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
