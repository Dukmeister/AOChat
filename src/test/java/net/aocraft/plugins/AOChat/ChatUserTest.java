/**
 * 
 */
package net.aocraft.plugins.AOChat;

import junit.framework.TestCase;

/**
 * @author Ducky
 *
 */
public class ChatUserTest extends TestCase {
	private ChannelView view1;
	private ChannelView view2;
    private viewPort viewPort1;
    private viewPort viewPort2;
    
	private void setup() {
		// setup channel views
		view1 = new ChannelView("Verdana", "white", false, false);
		view2 = new ChannelView("Times New Roman", "red", false, false);
		viewPort1 = new viewPort(10, 10, 10, 200, 12);
		viewPort2 = new viewPort(210, 10, 210, 400,12);
		view1.setViewPort(viewPort1);
		view2.setViewPort(viewPort2);
	}
	
	public void testChatUser() {
		setup();
		ChatUser user1 = new ChatUser("TestUser1");			
		assertNotNull(user1);									// Object should be instantiated
		assertEquals("TestUser1", user1.getChUserName());		// User name should be set to passed parameter
		assertNotNull(user1.chViewPorts);							// User channels views should be instantiated
		assertEquals(0, user1.chViewPorts.size());					// List of channel views should be empty
	}
	
	public void testAddViewPort() {
		setup();
		ChatUser user1 = new ChatUser("TestUser1");	
		assertEquals(0, user1.chViewPorts.size());				// View ports should be empty on initialization
		user1.addViewPort(viewPort1);
		assertEquals(1, user1.chViewPorts.size());				// ViewPorts should be 1 after adding a viewPort
		assertNotNull(user1.chViewPorts.get(0));				// The viewPort should not be null after adding it
		assertEquals(viewPort1, user1.chViewPorts.get(0));		// The viewPort should be the same as the added viewPort
		user1.addViewPort(viewPort2);
		assertEquals(2, user1.chViewPorts.size());				// ViewPorts should be 2 after adding a second viewPort
		assertNotNull(user1.chViewPorts.get(1));				// The viewPort should not be null after adding it
		assertEquals(viewPort2, user1.chViewPorts.get(1));		// The viewPort should be the same as the added viewPort
		
		
	}
	
	public void testRemoveViewPort() {
		setup();
		ChatUser user1 = new ChatUser("TestUser1");	
		assertEquals(0, user1.chViewPorts.size());				// View ports should be empty on initialization
		user1.addViewPort(viewPort1);
		assertEquals(1, user1.chViewPorts.size());				// ViewPorts should be 1 after adding a viewPort
		assertNotNull(user1.chViewPorts.get(0));				// The viewPort should not be null after adding it
		assertEquals(viewPort1, user1.chViewPorts.get(0));		// The viewPort should be the same as the added viewPort
		user1.addViewPort(viewPort2);
		assertEquals(2, user1.chViewPorts.size());				// ViewPorts should be 2 after adding a second viewPort
		assertNotNull(user1.chViewPorts.get(1));				// The viewPort should not be null after adding it
		assertEquals(viewPort2, user1.chViewPorts.get(1));		// The viewPort should be the same as the added viewPort
		user1.removeViewPort(viewPort1);					
		assertEquals(1, user1.chViewPorts.size());				// ViewPorts should be 1 after removing the viewPort
		assertEquals(viewPort2, user1.chViewPorts.get(0));		// viewPort2 should be in position 0 of ArrayList now
	}
}
