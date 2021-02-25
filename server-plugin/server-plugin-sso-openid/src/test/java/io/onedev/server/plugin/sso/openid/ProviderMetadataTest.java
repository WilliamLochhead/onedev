package io.onedev.server.plugin.sso.openid;

public class ProviderMetadataTest  {
	
	ProviderMetadata pm = new ProviderMetadata("test", "test", "test", "test");
	
	@org.junit.Test
	public void testGetIssuer() {		
		assert(pm.getIssuer()=="test");
	}	
	
	@org.junit.Test
	public void testGetAuthorizationEndpoint() {		
		assert(pm.getAuthorizationEndpoint()=="test");
	}
	
	@org.junit.Test
	public void testGetTokenEndpoint() {		
		assert(pm.getTokenEndpoint()=="test");
	}
	
	@org.junit.Test
	public void testGetUserInfoEndpoint() {		
		assert(pm.getUserInfoEndpoint()=="test");
	}

}