package io.onedev.server.product;

import static org.junit.Assert.assertNull;
import java.util.Properties;

public class DefaultServerConfigTest {
	Properties props = new Properties();    
	ServerProperties serverProps;
	DefaultServerConfig dsc;
	
	public DefaultServerConfigTest() {
		props.put("session_timeout","1800");
		props.put("http_port","6610");
		props.put("ssh_port","6611");
		serverProps = new ServerProperties(props);
		dsc = new DefaultServerConfig(serverProps);
	}

	@org.junit.Test
	public void testGetHttpPort() {
		assert(dsc.getHttpPort()==6610);
	}		
	
	@org.junit.Test
	public void testGetSessionTimeout() {
		assert(dsc.getSessionTimeout()==1800);
	}
	
	@org.junit.Test
	public void testGetHttpsPort() {
		assert(dsc.getHttpsPort()==0);
	}
	
	@org.junit.Test
	public void testGetKeystoreFile() {
		assertNull(dsc.getKeystoreFile());
	}
	
	@org.junit.Test
	public void testGetKeystorePassword() {
		assert(dsc.getKeystorePassword()=="");
	}
	
	@org.junit.Test
	public void testGetTrustCertsDir() {
		assertNull(dsc.getTrustCertsDir());
	}
	
	@org.junit.Test
	public void testGetSshPort() {
		assert(dsc.getSshPort()==6611);
	}

}