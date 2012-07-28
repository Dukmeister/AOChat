package net.aocraft.plugins.AOChat;

import java.util.HashMap;

import junit.framework.TestCase;

public class viewPortTest extends TestCase {

	viewPort viewPort1;
	ChannelView view1;
	ChannelView view2;
	String channelName1;
	String channelName2;
	
	
	public void setup() {
		viewPort1 = new viewPort(10, 20, 200, 210, 12);
		view1 = new ChannelView("Verdana", "white", false, false);
		view2 = new ChannelView("Times New Roman", "red", false, false);
		channelName1 = "Genenal";
		channelName2 = "Group";
	}

	public void testViewPort() {
		viewPort aViewPort;
		aViewPort = new viewPort(10, 20, 200, 210, 12);
		assertEquals(0, aViewPort.chViews.size());								// ChannelViews should be empty at initial
		assertTrue(aViewPort.getViewPortTopLeftX() == 10);						// Check that the Top Left corner of window is set properly
		assertTrue(aViewPort.getViewPortTopLeftY() == 20);						
		assertTrue(aViewPort.getViewPortBottomRightX() == 200);					// Check that the Bottom Right corner of window is set properly
		assertTrue(aViewPort.getViewPortBottomRightY() == 210);					
		assertTrue(aViewPort.getViewPortFontSize() == 12);						// Check that the Font Size of window is set properly
	}
	
	public void testSetChannelView() {
		setup();
		assertEquals(0, viewPort1.chViews.size());								// ChannelViews should be empty at initial
		viewPort1.setChannelView(channelName1, view1);
		assertEquals(1, viewPort1.chViews.size());								// ChannelViews should be 1 after adding a view
		assertEquals(view1, viewPort1.chViews.get(channelName1));				// view1 should be set as the view for channelName1	
		viewPort1.setChannelView(channelName2, view2);
		assertEquals(2, viewPort1.chViews.size());								// Size should be 2 after adding second channel view		
		assertEquals(view2, viewPort1.chViews.get(channelName2));				// view2 should be set as the view for channelName2
		viewPort1.setChannelView(channelName2, view1);
		assertEquals(2, viewPort1.chViews.size());								// Size should still be 2 after changing a view		
		assertEquals(view1, viewPort1.chViews.get(channelName2));				// view1 should be set as the view for channelName2
		
		}
	
	public void testGetChannelView() {
		setup();
		assertEquals(0, viewPort1.chViews.size());								// ChannelViews should be empty at initial
		viewPort1.setChannelView(channelName1, view1);
		viewPort1.setChannelView(channelName2, view2);
		assertEquals(2, viewPort1.chViews.size());								// Size should be 2 after adding second channel view		
		assertEquals(view1, viewPort1.getChannelView(channelName1));			// ChannelName1 should have been set to View1
		assertEquals(view2, viewPort1.getChannelView(channelName2));			// ChannelName2 should have been set to View2
			
	}
	
	public void testGetViews() {
		HashMap<String, ChannelView> Views ;
		setup();
		viewPort1.setChannelView(channelName1, view1);
		viewPort1.setChannelView(channelName2, view2);
		assertEquals(2, viewPort1.chViews.size());								// Size should be 2 after adding second channel
		Views = viewPort1.getViews();
		assertEquals(2, Views.size());											// Views should be same size as set in ViewPort
        assertEquals(view1, Views.get(channelName1)); 
        assertEquals(view2, Views.get(channelName2)); 
        
	}
	
}
