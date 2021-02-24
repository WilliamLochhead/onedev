package io.onedev.server.plugin.authenticator.ldap;

public class ActiveDirectoryAuthenticatorTest {

	@org.junit.Test
	public void testGetGroupSearchBase() {		
		ActiveDirectoryAuthenticator ada = new ActiveDirectoryAuthenticator();
		ada.setGroupSearchBase("test");
		assert(ada.getGroupSearchBase()=="test");
	}		

}