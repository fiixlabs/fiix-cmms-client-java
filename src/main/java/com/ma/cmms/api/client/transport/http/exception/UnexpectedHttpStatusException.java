package com.ma.cmms.api.client.transport.http.exception;

public class UnexpectedHttpStatusException extends Exception
{
	private static final long serialVersionUID = 1L;

	public UnexpectedHttpStatusException(String msg)
	{
		super(msg);
	}
}
