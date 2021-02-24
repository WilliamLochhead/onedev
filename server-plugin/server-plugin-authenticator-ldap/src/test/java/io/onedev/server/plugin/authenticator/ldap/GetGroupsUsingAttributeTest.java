package io.onedev.server.plugin.authenticator.ldap;

public class GetGroupsUsingAttributeTest {
	
	GetGroupsUsingAttribute ggua = new GetGroupsUsingAttribute();

	@org.junit.Test
	public void testGetSetUserGroupsAttribute() {		
		ggua.setUserGroupsAttribute("test");
		assert(ggua.getUserGroupsAttribute()=="test");
	}	
	
	@org.junit.Test
	public void testGetSetGroupNameAttribute() {		
		ggua.setGroupNameAttribute("test");
		assert(ggua.getGroupNameAttribute()=="test");
	}

}