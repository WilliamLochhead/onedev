package io.onedev.server.plugin.authenticator.ldap;

public class SearchGroupsUsingFilterTest {
	
	SearchGroupsUsingFilter sguf = new SearchGroupsUsingFilter();

	@org.junit.Test
	public void testGetSetGroupSearchBase() {		
		sguf.setGroupSearchBase("test");
		assert(sguf.getGroupSearchBase()=="test");
	}	
	
	@org.junit.Test
	public void testGetSetGroupSearchFilter() {		
		sguf.setGroupSearchFilter("test");
		assert(sguf.getGroupSearchFilter()=="test");
	}
	
	@org.junit.Test
	public void testGetSetGroupNameAttribute() {		
		sguf.setGroupNameAttribute("test");
		assert(sguf.getGroupNameAttribute()=="test");
	}


}