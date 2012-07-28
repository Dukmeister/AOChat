package net.aocraft.plugins.AOChat;

import net.aocraft.plugins.AOChat.ChatChannel.channelType;
import junit.framework.TestCase;

public class ChatChannelTest extends TestCase {

	private ChatChannel ch1;
	private ChatUser user1;
	private ChatUser user2;
	private String userName1;
	private String userName2;
	private String channelName;
	
	private void setup() {
		// setup channel
		channelName="General";
		userName1 = "TestUser1";
		userName2 = "testuser2";
		channelType chType = channelType.LOCAL;
		ch1 = new ChatChannel(channelName, chType);
		// setup two users 
		user1 = new ChatUser(userName1);
		user2 = new ChatUser(userName2);

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
		ch1.addChannelUser(userName1,user1);
		assertEquals(1, ch1.chUsers.size());				// Number of users should be 1 after adding a user
		assertNotNull(ch1.chUsers.get(userName1));			// User1 should exist in the hash map			
		ch1.addChannelUser(userName2,user2);					
		assertNotNull(ch1.chUsers.get(userName2));			// User2 should exist in the hash map
		assertEquals(2, ch1.chUsers.size());				// Number of users should be 2 after adding another user
		
	}
	
	public void testRemoveUser() {
		// Setup test values
		setup();
		// Test the method
		assertEquals(0, ch1.chUsers.size());				// Channel should have no users on initialization
		ch1.addChannelUser(userName1,user1);
		ch1.addChannelUser(userName2,user2);				
		assertEquals(2, ch1.chUsers.size());				// Number of users should be 2 by now
		ch1.removeChannelUser(userName2);
		assertEquals(1, ch1.chUsers.size());				// Number of users should be 1 after remove
		assertNull(ch1.chUsers.get(userName2));				// User2 should not exist in the hash map anymore 
		assertNotNull(ch1.chUsers.get(userName1));			// User1 should still exist in the hash map

	

			
		
	}
}
