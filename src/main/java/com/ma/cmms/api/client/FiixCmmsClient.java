package com.ma.cmms.api.client;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

import com.ma.cmms.api.CmmsDto;
import com.ma.cmms.api.Error;
import com.ma.cmms.api.Request;
import com.ma.cmms.api.Response;
import com.ma.cmms.api.Version;
import com.ma.cmms.api.batch.BatchRequest;
import com.ma.cmms.api.batch.BatchResponse;
import com.ma.cmms.api.client.format.Format;
import com.ma.cmms.api.client.format.json.JsonFormat;
import com.ma.cmms.api.client.transport.Transport;
import com.ma.cmms.api.client.transport.http.HttpTransport;
import com.ma.cmms.api.client.transport.http.exception.UnexpectedHttpStatusException;
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
import com.ma.cmms.api.rpc.RpcRequest;
import com.ma.cmms.api.rpc.RpcResponse;
import com.ma.cmms.api.transport.TransportConstants;

/**
 * 
 */
public class FiixCmmsClient
{
	private Credentials credentials;
	private Transport transport;
	private Format format;
	private AtomicLong currentRequestId = new AtomicLong(0);
	private String baseUri;

	/**
	 * If the server returns (429 - Too Many Requests) and indicates the time to wait before retrying the request,
	 * this is the maximum time the client will wait before giving up.
	 */
	private int maxWaitOnThrottleMs = 5000;

	public FiixCmmsClient(Credentials credentials, String baseUri)
	{
		this.credentials = credentials;

		transport = new HttpTransport();
		format = new JsonFormat();
		this.baseUri = baseUri;
	}

	public <T extends CmmsDto> FindByIdRequest<T> prepareFindById(Class<? extends CmmsDto> klass)
	{
		FindByIdRequest<T> ret = new FindByIdRequest<T>();
		ret.setClassName(klass.getSimpleName());
		return ret;
	}

	public <T extends CmmsDto> FindByIdResponse<T> findById(FindByIdRequest<T> req)
	{
		@SuppressWarnings("unchecked")
		FindByIdResponse<T> ret = (FindByIdResponse<T>) executeRequest(req, FindByIdResponse.class);

		return ret;
	}

	public <T extends CmmsDto> FindRequest<T> prepareFind(Class<? extends CmmsDto> klass)
	{
		FindRequest<T> ret = new FindRequest<T>();
		ret.setClassName(klass.getSimpleName());
		return ret;
	}

	public <T extends CmmsDto> FindResponse<T> find(FindRequest<T> req)
	{
		@SuppressWarnings("unchecked")
		FindResponse<T> ret = (FindResponse<T>) executeRequest(req, FindResponse.class);

		return ret;
	}

	public <T extends CmmsDto> AddRequest<T> prepareAdd(Class<? extends CmmsDto> klass)
	{
		AddRequest<T> ret = new AddRequest<T>();
		ret.setClassName(klass.getSimpleName());
		return ret;
	}

	public <T extends CmmsDto> AddResponse<T> add(AddRequest<T> req)
	{
		@SuppressWarnings("unchecked")
		AddResponse<T> ret = (AddResponse<T>) executeRequest(req, AddResponse.class);

		return ret;
	}

	public <T extends CmmsDto> ChangeRequest<T> prepareChange(Class<? extends CmmsDto> klass)
	{
		ChangeRequest<T> ret = new ChangeRequest<T>();
		ret.setClassName(klass.getSimpleName());
		return ret;
	}

	public <T extends CmmsDto> ChangeResponse<T> change(ChangeRequest<T> req)
	{
		@SuppressWarnings("unchecked")
		ChangeResponse<T> ret = (ChangeResponse<T>) executeRequest(req, ChangeResponse.class);

		return ret;
	}

	public <T extends CmmsDto> RemoveRequest<T> prepareRemove(Class<? extends CmmsDto> klass)
	{
		RemoveRequest<T> ret = new RemoveRequest<T>();
		ret.setClassName(klass.getSimpleName());
		return ret;
	}

	public <T extends CmmsDto> RemoveResponse<T> remove(RemoveRequest<T> req)
	{
		@SuppressWarnings("unchecked")
		RemoveResponse<T> ret = (RemoveResponse<T>) executeRequest(req, RemoveResponse.class);

		return ret;
	}

	public RpcRequest prepareRpc()
	{
		RpcRequest ret = new RpcRequest();
		return ret;
	}

	public RpcResponse rpc(RpcRequest req)
	{
		RpcResponse ret = (RpcResponse) executeRequest(req, RpcResponse.class);

		return ret;
	}

	public BatchRequest prepareBatch()
	{
		BatchRequest ret = new BatchRequest();
		return ret;
	}

	public BatchResponse batch(BatchRequest req)
	{
		BatchResponse ret = (BatchResponse) executeRequest(req, BatchResponse.class);

		return ret;
	}

	static public class TransportParameters
	{
		public String endpoint;
		public String queryString;
		public String uri;
		public Map<String, String> headers;
		public String signature;
	}

	private TransportParameters calcTransportParameters(Request request)
	{
		TransportParameters ret = new TransportParameters();

		ret.endpoint = getBaseUri();

		{
			StringBuilder sb = new StringBuilder();
			sb.append("action=").append(UrlEncodingHelper.encodeURIComponent(request.getClass().getSimpleName()));
			sb.append("&service=").append(UrlEncodingHelper.encodeURIComponent("cmms"));
			if (getCredentials() != null)
			{
				sb.append("&accessKey=").append(UrlEncodingHelper.encodeURIComponent(getCredentials().getAccessKey()));
				sb.append("&appKey=").append(UrlEncodingHelper.encodeURIComponent(getCredentials().getAppKey()));
				sb.append("&timestamp=").append(UrlEncodingHelper.encodeURIComponent(String.valueOf(new Date().getTime())));
				sb.append("&signatureVersion=1");
				sb.append("&signatureMethod=HmacSHA256");
			}

			ret.queryString = sb.toString();
		}

		ret.uri = ret.endpoint + "?" + ret.queryString;

		ret.headers = new HashMap<String, String>();
		ret.headers.put("Content-Type", "text/plain");

		if (getCredentials() != null)
		{
			ret.signature = calcSignature(ret);
			ret.headers.put("Authorization", ret.signature);
		}

		return ret;
	}

	private String calcSignature(TransportParameters tp)
	{
		try
		{
			String message = tp.uri;
			if (message.indexOf("http://") == 0)
			{
				message = message.substring("http://".length());
			}
			else if (message.indexOf("https://") == 0)
			{
				message = message.substring("https://".length());
			}

			Mac mac = Mac.getInstance(TransportConstants.MAC_ALGORITHM);
			byte[] messageBytes = message.getBytes(TransportConstants.CHARSET_NAME);

			String credentialsSecretKey = getCredentials().getSecretKey();
			byte[] credentialsSecretKeyBytes = credentialsSecretKey.getBytes(TransportConstants.CHARSET_NAME);

			SecretKey signingKey = new SecretKeySpec(credentialsSecretKeyBytes, TransportConstants.MAC_ALGORITHM);
			mac.init(signingKey);

			byte[] hmac = mac.doFinal(messageBytes);
			String hmacString = new String(Hex.encodeHex(hmac)).toLowerCase();

			return hmacString;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	private Response executeRequest(Request req, Class<?> klass)
	{
		Format format = getFormat();

		/*
		 * Impl note.
		 * If we get an exception, a Response object with Error in it needs to be created.
		 * Now I can create it using klass.newInstance, but that could (in theory) fail.
		 * So rather than having error-during-error-processing, I ask callers to provide me
		 * with the empty response object of the appropriate type, which I return in case of error.
		 */
		Response ret;

		try
		{
			//
			req.setRequestId(currentRequestId.getAndIncrement());
			req.setClientVersion(Version.apiVersion);
			req.setRequestSentUnixTime(System.currentTimeMillis());

			//
			String requestString = format.requestToString(req);

			//
			try
			{
				TransportParameters tp = calcTransportParameters(req);
				//String requestSignature = getRequestSignature(req);

				try
				{
					long totalThrottleWaitMs = 0;

					//	Try sending... if throttled, try again
					//	http://tools.ietf.org/html/rfc6585#section-4
					while (true)
					{
						String responseString = getTransport().send(tp, requestString);

						if (responseString.isEmpty())
						{
							Error error = new Error(Error.Leg.SERVER_REQUEST_RECEIVE, Error.EMPTY_RESPONSE, null, null);
							return req.createResponse(error);
						}

						try
						{
							ret = format.stringToResponse(responseString, klass);
						}
						catch (Throwable t)
						{
							//	From-string failed
							Error error = new Error(Error.Leg.CLIENT_RESPONSE_UNPACK, Error.ERROR_PARSING_RESPONSE, null, t);
							ret = req.createResponse(error);
						}

						//	Throttled with auto-retry indicated?
						if (ret.getError() != null && ret.getError().getCode() == Error.THROTTLED_CLIENT_SHOULD_AUTO_RETRY)
						{
							//	
							int waitAdvisoryMs = 4000;
							if (ret.getError().getObject() != null && ret.getError().getObject().get(Error.P_CLIENT_AUTO_RETRY_WAIT_ADVISORY_MS) != null)
							{
								waitAdvisoryMs = ((Integer) ret.getError().getObject().get(Error.P_CLIENT_AUTO_RETRY_WAIT_ADVISORY_MS)).intValue();
							}

							//System.err.println("Wait advisory: " + waitAdvisoryMs);

							totalThrottleWaitMs += waitAdvisoryMs;
							if (totalThrottleWaitMs <= maxWaitOnThrottleMs)
							{
								//	Then, DO wait...
								//System.err.println("Sleep for " + waitAdvisoryMs);

								Thread.sleep(waitAdvisoryMs);

								continue; // !!!!! Try again
							}
							else
							{
								//	We've been waiting for too long... drop out of the loop
							}
						}

						//	No loops, unless client throttle auto-retry, which just uses 'continue'
						break;
					}
				}
				catch (UnexpectedHttpStatusException ex)
				{
					//	http status not 200
					Error error = new Error(Error.Leg.CLIENT_REQUEST_SEND_OR_RECEIVE, Error.UNEXPECTED_HTTP_STATUS, null, ex);
					ret = req.createResponse(error);
				}
				catch (java.net.SocketTimeoutException ex)
				{
					//	timeout
					Error error = new Error(Error.Leg.CLIENT_REQUEST_SEND_OR_RECEIVE, Error.TIMEOUT, null, ex);
					ret = req.createResponse(error);
				}
				catch (java.net.UnknownHostException ex)
				{
					// invalid URL
					Error error = new Error(Error.Leg.CLIENT_REQUEST_SEND_OR_RECEIVE, Error.INVALID_URI, null, ex);
					ret = req.createResponse(error);
				}
				catch (Throwable t)
				{
					//	transport failed
					Error error = new Error(Error.Leg.CLIENT_REQUEST_SEND_OR_RECEIVE, 0, null, t);
					ret = req.createResponse(error);
				}
			}
			catch (Throwable t)
			{
				//	getRequestSignature failed
				Error error = new Error(Error.Leg.CLIENT_REQUEST_SEND_OR_RECEIVE, 0, null, t);
				ret = req.createResponse(error);
			}
		}
		catch (Throwable t)
		{
			//	to-string failed
			Error error = new Error(Error.Leg.CLIENT_REQUEST_PACK, 0, null, t);
			ret = req.createResponse(error);
		}

		return ret;
	}

	public Transport getTransport()
	{
		return transport;
	}

	public void setTransport(Transport transport)
	{
		this.transport = transport;
	}

	public Format getFormat()
	{
		return format;
	}

	public void setFormat(Format format)
	{
		this.format = format;
	}

	public Credentials getCredentials()
	{
		return credentials;
	}

	public void setCredentials(Credentials credentials)
	{
		this.credentials = credentials;
	}

	public String getBaseUri()
	{
		return baseUri;
	}

	public void setBaseUri(String baseUri)
	{
		this.baseUri = baseUri;
	}

	public int getMaxWaitOnThrottleMs()
	{
		return maxWaitOnThrottleMs;
	}

	public void setMaxWaitOnThrottleMs(int maxWaitOnThrottleMs)
	{
		this.maxWaitOnThrottleMs = maxWaitOnThrottleMs;
	}
}
