package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'Dashboard' table.
 * @generated
 */
public class Dashboard extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long intSysCode;
	private java.lang.Long bolAvailable;
	private java.lang.Long intDashboardType;
	private java.lang.Long intUserID;
	private java.lang.String strDescription;
	private java.lang.String strSelectedSites;
	private java.lang.String strTitle;
		

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
	 * Gets the value of the 'bolAvailable' field.
	 */
	public java.lang.Long getBolAvailable()
	{
		return bolAvailable;
	}

	/**
	 * Sets the value of the 'bolAvailable' field.
	 */
	public void setBolAvailable(java.lang.Long bolAvailable)
	{
		this.bolAvailable = bolAvailable;
	}

	/**
	 * Gets the value of the 'intDashboardType' field.
	 */
	public java.lang.Long getIntDashboardType()
	{
		return intDashboardType;
	}

	/**
	 * Sets the value of the 'intDashboardType' field.
	 */
	public void setIntDashboardType(java.lang.Long intDashboardType)
	{
		this.intDashboardType = intDashboardType;
	}

	/**
	 * Gets the value of the 'intUserID' field.
	 */
	public java.lang.Long getIntUserID()
	{
		return intUserID;
	}

	/**
	 * Sets the value of the 'intUserID' field.
	 */
	public void setIntUserID(java.lang.Long intUserID)
	{
		this.intUserID = intUserID;
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
	 * Gets the value of the 'strSelectedSites' field.
	 */
	public java.lang.String getStrSelectedSites()
	{
		return strSelectedSites;
	}

	/**
	 * Sets the value of the 'strSelectedSites' field.
	 */
	public void setStrSelectedSites(java.lang.String strSelectedSites)
	{
		this.strSelectedSites = strSelectedSites;
	}

	/**
	 * Gets the value of the 'strTitle' field.
	 */
	public java.lang.String getStrTitle()
	{
		return strTitle;
	}

	/**
	 * Sets the value of the 'strTitle' field.
	 */
	public void setStrTitle(java.lang.String strTitle)
	{
		this.strTitle = strTitle;
	}
}
