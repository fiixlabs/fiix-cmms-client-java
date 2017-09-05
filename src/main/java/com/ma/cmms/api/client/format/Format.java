package com.ma.cmms.api.client.format;

import com.ma.cmms.api.Request;
import com.ma.cmms.api.Response;

public interface Format
{
	String requestToString(Request request) throws Exception;

	Request stringToRequest(String str, Class<?> targetClass) throws Exception;

	String responseToString(Response response) throws Exception;

	Response stringToResponse(String str, Class<?> targetClass) throws Exception;
}
