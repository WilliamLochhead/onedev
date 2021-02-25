package io.onedev.server.plugin.sso.openid;

import java.net.MalformedURLException;
import java.net.URL;

import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.http.HTTPRequest.Method;

public class HTTPRequestTest  {
	
	HTTPRequest hr;
	
	URL url = new URL("http://www.test.com");
	
	public HTTPRequestTest() throws MalformedURLException {
		hr = new HTTPRequest(Method.GET, url);
	}
	
	@org.junit.Test
	public void testGetMethod() {		
		assert(hr.getMethod()==Method.GET);
	}	
	
	@org.junit.Test
	public void testGetURL() {		
		assert(hr.getURL()==url);
	}
	
	@org.junit.Test
	public void testGetSetAuthorization() {		
		hr.setAuthorization("test");
		assert(hr.getAuthorization()=="test");
	}
	
	@org.junit.Test
	public void testGetSetQuery() {		
		hr.setQuery("test");
		assert(hr.getQuery()=="test");
	}

}