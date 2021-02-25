package io.onedev.server.plugin.sso.openid;

public class OpenIdConnectorTest  {
	
	OpenIdConnector oc = new OpenIdConnector();
	
	@org.junit.Test
	public void testIsManagingMemberships() {		
		assert(oc.isManagingMemberships()==false);
	}
	
	@org.junit.Test
	public void testGetSetName() {
		oc.setName("test");
		assert(oc.getName()=="test");
	}
	
	@org.junit.Test
	public void testGetSetIssuerURL() {
		oc.setIssuerUrl("test");
		assert(oc.getIssuerUrl()=="test");
	}
	
	@org.junit.Test
	public void testGetSetClientId() {
		oc.setClientId("test");
		assert(oc.getClientId()=="test");
	}

	@org.junit.Test
	public void testGetSetClientSecret() {
		oc.setClientSecret("test");
		assert(oc.getClientSecret()=="test");
	}
	
	@org.junit.Test
	public void testGetSetGroupsClaim() {
		oc.setGroupsClaim("test");
		assert(oc.getGroupsClaim()=="test");
	}
	
	@org.junit.Test
	public void testGetSetButtonImageURL() {
		oc.setButtonImageUrl("test");
		assert(oc.getButtonImageUrl()=="test");
	}
	
}