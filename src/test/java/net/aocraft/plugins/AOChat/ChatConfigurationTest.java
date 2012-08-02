package net.aocraft.plugins.AOChat;

import junit.framework.TestCase;

public class ChatConfigurationTest extends TestCase {
	
	@SuppressWarnings("static-access")
	public void testChatConfiguration() {
		
		ChatConfiguration config1 = new ChatConfiguration(null);			
		assertNotNull(config1);									// Object should be instantiated
		assertNotNull(config1.BROADCAST);						// Field BROADCAST should not be null						
		
	}

}
