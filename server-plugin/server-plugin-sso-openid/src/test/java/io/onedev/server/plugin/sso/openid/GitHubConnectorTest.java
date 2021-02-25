package io.onedev.server.plugin.sso.openid;

public class GitHubConnectorTest  {
	
	GitHubConnector ghc = new GitHubConnector();
	
	@org.junit.Test
	public void testIsManagingMemberships() {		
		assert(ghc.isManagingMemberships()==false);
	}

}