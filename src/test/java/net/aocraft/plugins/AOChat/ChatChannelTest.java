package net.aocraft.plugins.AOChat;

import net.aocraft.plugins.AOChat.ChatChannel.channelType;
import junit.framework.TestCase;

public class ChatChannelTest extends TestCase {

	private ChatChannel ch1;
	private ChatUser user1;
	private ChatUser user2;
	private String channelName;
	private String username1;
	private String username2;
	
	private void setup() {
		// setup channel
		channelName="General";
		channelType chType = channelType.LOCAL;
		ch1 = new ChatChannel(channelName, chType);
		username1 = "TestUser1";
		username2 = "TestUser2";
			
		// setup two ChatUser objects
		user1 = new ChatUser(username1);
		user2 = new ChatUser(username2);
		
	}

	public void testChatChannel() {
		channelType chType = channelType.LOCAL;
		ChatChannel ch1 = new ChatChannel(channelName, chType);
		ch1.setChDescription("Default chat channel");
		ch1.setChPass("test");
		ch1.setChRange(100);
		assertEquals(channelName, ch1.getChName());
		assertEquals(channelType.LOCAL, ch1.getChType());
		assertEquals("Default chat channel", ch1.getChDescription());
		assertEquals("test", ch1.getChPass());
		assertEquals(0, ch1.chUsers.size());
			
	}
	
	public void testAddChannelUser() {
		// setup test values
		setup();
		
		// test method
		assertEquals(0, ch1.chUsers.size());				// Channel should have no users on initialization
		ch1.addChannelUser(username1,user1);
		assertEquals(1, ch1.chUsers.size());				// Number of users should be 1 after adding a user
		assertNotNull(ch1.chUsers.get(username1));			// User1 should exist in the hash map			
		ch1.addChannelUser(username2,user2);					
		assertNotNull(ch1.chUsers.get(username2));			// User2 should exist in the hash map
		assertEquals(2, ch1.chUsers.size());				// Number of users should be 2 after adding another user
		
	}
	
	public void testRemoveUser() {
		// Setup test values
		setup();
		// Test the method
		assertEquals(0, ch1.chUsers.size());				// Channel should have no users on initialization
		ch1.addChannelUser(username1,user1);
		ch1.addChannelUser(username2,user2);				
		assertEquals(2, ch1.chUsers.size());				// Number of users should be 2 by now
		ch1.removeChannelUser(username2);
		assertEquals(1, ch1.chUsers.size());				// Number of users should be 1 after remove
		assertNull(ch1.chUsers.get(username2));				// User2 should not exist in the hash map anymore 
		assertNotNull(ch1.chUsers.get(username1));			// User1 should still exist in the hash map

	

			
		
	}
}
