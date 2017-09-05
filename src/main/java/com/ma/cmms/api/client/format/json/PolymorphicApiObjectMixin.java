package com.ma.cmms.api.client.format.json;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ma.cmms.api.batch.BatchRequest;
import com.ma.cmms.api.batch.BatchResponse;
import com.ma.cmms.api.crud.AddRequest;
import com.ma.cmms.api.crud.AddResponse;
import com.ma.cmms.api.crud.ChangeRequest;
import com.ma.cmms.api.crud.ChangeResponse;
import com.ma.cmms.api.crud.FindByIdRequest;
import com.ma.cmms.api.crud.FindByIdResponse;
import com.ma.cmms.api.crud.FindRequest;
import com.ma.cmms.api.crud.FindResponse;
import com.ma.cmms.api.crud.RemoveRequest;
import com.ma.cmms.api.crud.RemoveResponse;
import com.ma.cmms.api.format.json.JsonFormatConstants;
import com.ma.cmms.api.rpc.RpcRequest;
import com.ma.cmms.api.rpc.RpcResponse;

@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = JsonFormatConstants.MAGICK_API_OBJECT_JSON_FIELD_NAME)
@JsonSubTypes(
{
		@Type(value = FindByIdRequest.class, name = "FindByIdRequest"),
		@Type(value = FindRequest.class, name = "FindRequest"),
		@Type(value = AddRequest.class, name = "AddRequest"),
		@Type(value = ChangeRequest.class, name = "ChangeRequest"),
		@Type(value = RemoveRequest.class, name = "RemoveRequest"),
		@Type(value = RpcRequest.class, name = "RpcRequest"),
		@Type(value = BatchRequest.class, name = "BatchRequest"),

		@Type(value = FindByIdResponse.class, name = "FindByIdResponse"),
		@Type(value = FindResponse.class, name = "FindResponse"),
		@Type(value = AddResponse.class, name = "AddResponse"),
		@Type(value = ChangeResponse.class, name = "ChangeResponse"),
		@Type(value = RemoveResponse.class, name = "RemoveResponse"),
		@Type(value = RpcResponse.class, name = "RpcResponse"),
		@Type(value = BatchResponse.class, name = "BatchResponse")
})
abstract public class PolymorphicApiObjectMixin
{
}
