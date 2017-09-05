package com.ma.cmms.api.client.dto;

import com.ma.cmms.api.client.ClientCmmsDto;

/**
 * Represents a record in the 'Tenant' table.
 * @generated
 */
public class Tenant extends ClientCmmsDto
{
	private java.lang.Long id;
	private java.lang.Long bolOptGuestRequestor;
		

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
	 * Gets the value of the 'bolOptGuestRequestor' field.
	 */
	public java.lang.Long getBolOptGuestRequestor()
	{
		return bolOptGuestRequestor;
	}

	/**
	 * Sets the value of the 'bolOptGuestRequestor' field.
	 */
	public void setBolOptGuestRequestor(java.lang.Long bolOptGuestRequestor)
	{
		this.bolOptGuestRequestor = bolOptGuestRequestor;
	}
}
