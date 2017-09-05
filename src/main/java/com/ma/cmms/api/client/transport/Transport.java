package com.ma.cmms.api.client.transport;

import com.ma.cmms.api.client.FiixCmmsClient.TransportParameters;

public interface Transport
{
	String send(TransportParameters tp, String requestString) throws Exception;
}
