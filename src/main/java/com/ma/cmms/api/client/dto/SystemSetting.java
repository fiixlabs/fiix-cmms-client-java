package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'SystemSetting' table.
 * @generated
 */
public class SystemSetting extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolEnableAllowNegativeStocks;
	private java.lang.Long bolEnableBlockWhenOutOfStock;
	private java.lang.Long bolEnablePromptWhenOutOfStock;
	private java.lang.Long bolRequiredContactInfo;
	private java.lang.String strShowContactInfoInputs;
		

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
	 * Gets the value of the 'bolEnableAllowNegativeStocks' field.
	 */
	public java.lang.Long getBolEnableAllowNegativeStocks()
	{
		return bolEnableAllowNegativeStocks;
	}

	/**
	 * Sets the value of the 'bolEnableAllowNegativeStocks' field.
	 */
	public void setBolEnableAllowNegativeStocks(java.lang.Long bolEnableAllowNegativeStocks)
	{
		this.bolEnableAllowNegativeStocks = bolEnableAllowNegativeStocks;
	}

	/**
	 * Gets the value of the 'bolEnableBlockWhenOutOfStock' field.
	 */
	public java.lang.Long getBolEnableBlockWhenOutOfStock()
	{
		return bolEnableBlockWhenOutOfStock;
	}

	/**
	 * Sets the value of the 'bolEnableBlockWhenOutOfStock' field.
	 */
	public void setBolEnableBlockWhenOutOfStock(java.lang.Long bolEnableBlockWhenOutOfStock)
	{
		this.bolEnableBlockWhenOutOfStock = bolEnableBlockWhenOutOfStock;
	}

	/**
	 * Gets the value of the 'bolEnablePromptWhenOutOfStock' field.
	 */
	public java.lang.Long getBolEnablePromptWhenOutOfStock()
	{
		return bolEnablePromptWhenOutOfStock;
	}

	/**
	 * Sets the value of the 'bolEnablePromptWhenOutOfStock' field.
	 */
	public void setBolEnablePromptWhenOutOfStock(java.lang.Long bolEnablePromptWhenOutOfStock)
	{
		this.bolEnablePromptWhenOutOfStock = bolEnablePromptWhenOutOfStock;
	}

	/**
	 * Gets the value of the 'bolRequiredContactInfo' field.
	 */
	public java.lang.Long getBolRequiredContactInfo()
	{
		return bolRequiredContactInfo;
	}

	/**
	 * Sets the value of the 'bolRequiredContactInfo' field.
	 */
	public void setBolRequiredContactInfo(java.lang.Long bolRequiredContactInfo)
	{
		this.bolRequiredContactInfo = bolRequiredContactInfo;
	}

	/**
	 * Gets the value of the 'strShowContactInfoInputs' field.
	 */
	public java.lang.String getStrShowContactInfoInputs()
	{
		return strShowContactInfoInputs;
	}

	/**
	 * Sets the value of the 'strShowContactInfoInputs' field.
	 */
	public void setStrShowContactInfoInputs(java.lang.String strShowContactInfoInputs)
	{
		this.strShowContactInfoInputs = strShowContactInfoInputs;
	}
}
