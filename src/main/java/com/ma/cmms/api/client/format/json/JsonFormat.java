package com.ma.cmms.api.client.format.json;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.PolymorphicApiObject;
import com.ma.cmms.api.Request;
import com.ma.cmms.api.Response;
import com.ma.cmms.api.client.format.Format;

public class JsonFormat implements Format
{
	/**
	 * From http://wiki.fasterxml.com/JacksonBestPracticesPerformance
	 * - ObjectMapper is expensive to create.
	 * - ObjecMapper is fully thread-safe.
	 */
	private ObjectMapper mapper;

	public JsonFormat()
	{
		mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.addMixInAnnotations(PolymorphicApiObject.class, PolymorphicApiObjectMixin.class);
		mapper.addMixInAnnotations(CmmsDto.class, PolymorphicCmmsDtoMixin.class);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	public String requestToString(Request request) throws Exception
	{
		String ret = mapper.writeValueAsString(request);
		return ret;
	}

	public Request stringToRequest(String str, Class<?> targetClass) throws Exception
	{
		Request ret = (Request) mapper.readValue(str, targetClass);
		return ret;
	}

	public String responseToString(Response response) throws Exception
	{
		String ret = mapper.writeValueAsString(response);
		return ret;
	}

	public Response stringToResponse(String str, Class<?> targetClass) throws Exception
	{
		Response ret = (Response) mapper.readValue(str, targetClass);
		return ret;
	}
}
