package com.ma.cmms.api.client;

import com.ma.cmms.api.CmmsDto;

import java.util.Map;

abstract public class ClientCmmsDto implements CmmsDto
{
	private Map<String, Object> extraFields;

	public Map<String, Object> getExtraFields()
	{
		return extraFields;
	}

	public void setExtraFields(Map<String, Object> extraFields)
	{
		this.extraFields = extraFields;
	}
}
