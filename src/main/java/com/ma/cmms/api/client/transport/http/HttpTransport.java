package com.ma.cmms.api.client.transport.http;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

import com.ma.cmms.api.client.FiixCmmsClient.TransportParameters;
import com.ma.cmms.api.client.transport.Transport;
import com.ma.cmms.api.client.transport.http.exception.UnexpectedHttpStatusException;

public class HttpTransport implements Transport
{
	static final private String TEXT_PLAIN = "text/plain";
	static final private String UTF8 = "UTF-8";
	static final private int SC_OK = 200;
	static final private int SC_TOO_MANY_REQUESTS = 429;

	static private MultiThreadedHttpConnectionManager connectionManager;

	private HttpClient httpClient;

	static
	{
		//	See this https://hc.apache.org/httpclient-3.x/apidocs/org/apache/commons/httpclient/params/HttpConnectionParams.html
		HttpConnectionManagerParams params = new HttpConnectionManagerParams();
		params.setDefaultMaxConnectionsPerHost(30);
		params.setMaxTotalConnections(25);
		params.setSendBufferSize(4 * 1024);
		params.setReceiveBufferSize(8 * 1024);
		params.setStaleCheckingEnabled(false);

		connectionManager = new MultiThreadedHttpConnectionManager();
		connectionManager.setParams(params);
	}

	public HttpTransport()
	{
		httpClient = new HttpClient(connectionManager);

		//	The below setting addresses the following error/warning:
		//	WARNING: Cookie rejected: "yyy". Domain attribute "xxx.com" violates RFC 2109: domain must start with a dot
		//	See here: https://hc.apache.org/httpclient-3.x/apidocs/ under org.apache.commons.httpclient.cookie.CookiePolicy
		httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
	}

	@Override
	public String send(TransportParameters tp, String requestString) throws Exception
	{
		PostMethod method = new PostMethod(tp.uri);
		for (String hn : tp.headers.keySet())
		{
			String hv = tp.headers.get(hn);
			method.addRequestHeader(hn, hv);
		}
		method.setRequestEntity(new StringRequestEntity(requestString, TEXT_PLAIN, UTF8));

		int statusCode = httpClient.executeMethod(method);
		if (statusCode != SC_OK && statusCode != SC_TOO_MANY_REQUESTS)
		{
			throw new UnexpectedHttpStatusException("HttpClient returned status code " + statusCode);
		}

		String responseString = method.getResponseBodyAsString();
		return responseString;
	}
}
