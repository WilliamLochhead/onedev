package io.onedev.server.plugin.authenticator.ldap;

public class LdapAuthenticatorTest {
	
	LdapAuthenticator la = new LdapAuthenticator();

	@org.junit.Test
	public void testGetSetLdapUrl() {		
		la.setLdapUrl("test");
		assert(la.getLdapUrl()=="test");
	}	
	
	@org.junit.Test
	public void testGetSetManagerDN() {		
		la.setManagerDN("test");
		assert(la.getManagerDN()=="test");
	}
	
	@org.junit.Test
	public void testGetSetManagerPassword() {		
		la.setManagerPassword("test");
		assert(la.getManagerPassword()=="test");
	}
	
	@org.junit.Test
	public void testGetSetUserSearchBase() {		
		la.setUserSearchBase("test");
		assert(la.getUserSearchBase()=="test");
	}	
	
	@org.junit.Test
	public void testGetSetUserSearchFilter() {		
		la.setUserSearchFilter("test");
		assert(la.getUserSearchFilter()=="test");
	}
	
	@org.junit.Test
	public void testGetSetUserFullNameAttribute() {		
		la.setUserFullNameAttribute("test");
		assert(la.getUserFullNameAttribute()=="test");
	}
	
	@org.junit.Test
	public void testGetSetUserEmailAttribute() {		
		la.setUserEmailAttribute("test");
		assert(la.getUserEmailAttribute()=="test");
	}	
	
	@org.junit.Test
	public void testGetSetUserSshKeyAttribute() {		
		la.setUserSshKeyAttribute("test");
		assert(la.getUserSshKeyAttribute()=="test");
	}
}