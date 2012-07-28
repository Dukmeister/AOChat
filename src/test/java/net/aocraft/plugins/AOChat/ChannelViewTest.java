/**
 * 
 */
package net.aocraft.plugins.AOChat;


import junit.framework.TestCase;

/**
 * @author Ducky
 *
 */
public class ChannelViewTest extends TestCase {
	
	private ChannelView view1;

	public void testChannelView() {
		view1 = new ChannelView("Verdana", "white", false, false);
		assertNotNull(view1);									// Make sure the object is not null;
		assertEquals("Verdana", view1.getViewFontFamily());		// Font-family should be Verdana
		assertEquals("white", view1.getViewFontColor());		// Color should be white 
		assertFalse(view1.getViewFontBold());
		assertFalse(view1.getViewFontItalic());
	}
	

}
