package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'CycleCount' table.
 * @generated
 */
public class CycleCount extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolComplete;
	private java.lang.Long bolIncludeClassA;
	private java.lang.Long bolIncludeClassB;
	private java.lang.Long bolIncludeClassC;
	private java.lang.Long bolIncludeNotClassified;
	private java.lang.Double dblGrossVariance;
	private java.lang.Double dblNetVariance;
	private java.lang.Double dblTotalValueCounted;
	private java.lang.Double dblTotalValueExpected;
	private java.util.Date dtmCompleted;
	private java.util.Date dtmCreated;
	private java.lang.Long intCompletedBy;
	private java.lang.Long intCreatedBy;
	private java.lang.Long intSiteID;
		

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
	 * Gets the value of the 'bolComplete' field.
	 */
	public java.lang.Long getBolComplete()
	{
		return bolComplete;
	}

	/**
	 * Sets the value of the 'bolComplete' field.
	 */
	public void setBolComplete(java.lang.Long bolComplete)
	{
		this.bolComplete = bolComplete;
	}

	/**
	 * Gets the value of the 'bolIncludeClassA' field.
	 */
	public java.lang.Long getBolIncludeClassA()
	{
		return bolIncludeClassA;
	}

	/**
	 * Sets the value of the 'bolIncludeClassA' field.
	 */
	public void setBolIncludeClassA(java.lang.Long bolIncludeClassA)
	{
		this.bolIncludeClassA = bolIncludeClassA;
	}

	/**
	 * Gets the value of the 'bolIncludeClassB' field.
	 */
	public java.lang.Long getBolIncludeClassB()
	{
		return bolIncludeClassB;
	}

	/**
	 * Sets the value of the 'bolIncludeClassB' field.
	 */
	public void setBolIncludeClassB(java.lang.Long bolIncludeClassB)
	{
		this.bolIncludeClassB = bolIncludeClassB;
	}

	/**
	 * Gets the value of the 'bolIncludeClassC' field.
	 */
	public java.lang.Long getBolIncludeClassC()
	{
		return bolIncludeClassC;
	}

	/**
	 * Sets the value of the 'bolIncludeClassC' field.
	 */
	public void setBolIncludeClassC(java.lang.Long bolIncludeClassC)
	{
		this.bolIncludeClassC = bolIncludeClassC;
	}

	/**
	 * Gets the value of the 'bolIncludeNotClassified' field.
	 */
	public java.lang.Long getBolIncludeNotClassified()
	{
		return bolIncludeNotClassified;
	}

	/**
	 * Sets the value of the 'bolIncludeNotClassified' field.
	 */
	public void setBolIncludeNotClassified(java.lang.Long bolIncludeNotClassified)
	{
		this.bolIncludeNotClassified = bolIncludeNotClassified;
	}

	/**
	 * Gets the value of the 'dblGrossVariance' field.
	 */
	public java.lang.Double getDblGrossVariance()
	{
		return dblGrossVariance;
	}

	/**
	 * Sets the value of the 'dblGrossVariance' field.
	 */
	public void setDblGrossVariance(java.lang.Double dblGrossVariance)
	{
		this.dblGrossVariance = dblGrossVariance;
	}

	/**
	 * Gets the value of the 'dblNetVariance' field.
	 */
	public java.lang.Double getDblNetVariance()
	{
		return dblNetVariance;
	}

	/**
	 * Sets the value of the 'dblNetVariance' field.
	 */
	public void setDblNetVariance(java.lang.Double dblNetVariance)
	{
		this.dblNetVariance = dblNetVariance;
	}

	/**
	 * Gets the value of the 'dblTotalValueCounted' field.
	 */
	public java.lang.Double getDblTotalValueCounted()
	{
		return dblTotalValueCounted;
	}

	/**
	 * Sets the value of the 'dblTotalValueCounted' field.
	 */
	public void setDblTotalValueCounted(java.lang.Double dblTotalValueCounted)
	{
		this.dblTotalValueCounted = dblTotalValueCounted;
	}

	/**
	 * Gets the value of the 'dblTotalValueExpected' field.
	 */
	public java.lang.Double getDblTotalValueExpected()
	{
		return dblTotalValueExpected;
	}

	/**
	 * Sets the value of the 'dblTotalValueExpected' field.
	 */
	public void setDblTotalValueExpected(java.lang.Double dblTotalValueExpected)
	{
		this.dblTotalValueExpected = dblTotalValueExpected;
	}

	/**
	 * Gets the value of the 'dtmCompleted' field.
	 */
	public java.util.Date getDtmCompleted()
	{
		return dtmCompleted;
	}

	/**
	 * Sets the value of the 'dtmCompleted' field.
	 */
	public void setDtmCompleted(java.util.Date dtmCompleted)
	{
		this.dtmCompleted = dtmCompleted;
	}

	/**
	 * Gets the value of the 'dtmCreated' field.
	 */
	public java.util.Date getDtmCreated()
	{
		return dtmCreated;
	}

	/**
	 * Sets the value of the 'dtmCreated' field.
	 */
	public void setDtmCreated(java.util.Date dtmCreated)
	{
		this.dtmCreated = dtmCreated;
	}

	/**
	 * Gets the value of the 'intCompletedBy' field.
	 */
	public java.lang.Long getIntCompletedBy()
	{
		return intCompletedBy;
	}

	/**
	 * Sets the value of the 'intCompletedBy' field.
	 */
	public void setIntCompletedBy(java.lang.Long intCompletedBy)
	{
		this.intCompletedBy = intCompletedBy;
	}

	/**
	 * Gets the value of the 'intCreatedBy' field.
	 */
	public java.lang.Long getIntCreatedBy()
	{
		return intCreatedBy;
	}

	/**
	 * Sets the value of the 'intCreatedBy' field.
	 */
	public void setIntCreatedBy(java.lang.Long intCreatedBy)
	{
		this.intCreatedBy = intCreatedBy;
	}

	/**
	 * Gets the value of the 'intSiteID' field.
	 */
	public java.lang.Long getIntSiteID()
	{
		return intSiteID;
	}

	/**
	 * Sets the value of the 'intSiteID' field.
	 */
	public void setIntSiteID(java.lang.Long intSiteID)
	{
		this.intSiteID = intSiteID;
	}
}
