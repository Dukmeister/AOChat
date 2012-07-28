/**
 * 
 */
package net.aocraft.plugins.AOChat;


import java.util.HashMap;

/**
 * @author Ducky
 *
 * Represents a display area for chat channels messages
 * 
 */

public class viewPort {
	
	// Fields
	
	Boolean viewPortShowBox;
	Integer viewPortTopLeftX;
	Integer viewPortTopLeftY;
	Integer viewPortBottomRightX;
	Integer viewPortBottomRightY;
	Integer viewPortOpacity;
	Integer viewPortFontSize ;
	
	public HashMap<String, ChannelView> chViews ;
	
	// Constructors
	
	public viewPort(Integer pTopLeftX, Integer pTopLeftY, Integer pBottomRightX, Integer pBottomRightY, Integer pFontSize) {
		this.viewPortTopLeftX = pTopLeftX;				
		this.viewPortTopLeftY = pTopLeftY;
		this.viewPortBottomRightX = pBottomRightX ;
		this.viewPortBottomRightY = pBottomRightY ;
		this.viewPortFontSize = pFontSize;
		this.viewPortOpacity = 100;						// Default Opacity to 100%
		this.viewPortShowBox = false;					// Default to no border chat window
		chViews = new HashMap<String, ChannelView>();   // Initialize the channel views list
	}
	
	// Methods
	public void setChannelView(String pChannelName, ChannelView pView) {
		// the put() method of Hash map will replace the value by default if it already exists, otherwise will add it
		chViews.put(pChannelName, pView);
	}
	public ChannelView getChannelView(String pChannelName) {
		return chViews.get(pChannelName);
		
	}
	
	public HashMap<String, ChannelView> getViews() {
		return this.chViews;
	}

	
	// Getters and Setters
	public Boolean getViewPortShowBox() {
		return viewPortShowBox;
	}
	public void setViewPortShowBox(Boolean viewPortShowBox) {
		this.viewPortShowBox = viewPortShowBox;
	}
	public Integer getViewPortTopLeftX() {
		return viewPortTopLeftX;
	}
	public void setViewPortTopLeftX(Integer viewPortTopLeftX) {
		this.viewPortTopLeftX = viewPortTopLeftX;
	}
	public Integer getViewPortTopLeftY() {
		return viewPortTopLeftY;
	}
	public void setViewPortTopLeftY(Integer viewPortTopLeftY) {
		this.viewPortTopLeftY = viewPortTopLeftY;
	}
	public Integer getViewPortBottomRightX() {
		return viewPortBottomRightX;
	}
	public void setViewPortBottomRightX(Integer viewPortBottomRightX) {
		this.viewPortBottomRightX = viewPortBottomRightX;
	}
	public Integer getViewPortBottomRightY() {
		return viewPortBottomRightY;
	}
	public void setViewPortBottomRightY(Integer viewPortBottomRightY) {
		this.viewPortBottomRightY = viewPortBottomRightY;
	}
	public Integer getViewPortOpacity() {
		return viewPortOpacity;
	}
	public void setViewPortOpacity(Integer viewPortOpacity) {
		this.viewPortOpacity = viewPortOpacity;
	}
	public Integer getViewPortFontSize() {
		return viewPortFontSize;
	}
	public void setViewPortFontSize(Integer viewPortFontSize) {
		this.viewPortFontSize = viewPortFontSize;
	}
	
	
}
