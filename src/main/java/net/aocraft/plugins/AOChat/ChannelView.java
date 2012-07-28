/**
 * 
 */
package net.aocraft.plugins.AOChat;


/**
 * @author Ducky
 *
 * Represents a user View of a channel and how to display information for that channel for a specific user/channel
 */
public class ChannelView {
	
	// Fields
	String viewFontFamily ;
	String viewFontName ;
	Boolean viewFontBold ;
	Boolean viewFontItalic ;
	
	String viewFontColor;
	String viewPrefix;
	String viewSuffix;
	
	viewPort viewWindow;
	
	// Constructor
	public ChannelView(String pFontFamily,
				       String pFontColor,
				       Boolean pFontBold,
				       Boolean pFontItalic) {
		setViewFontFamily(pFontFamily);
		setViewFontColor(pFontColor);
		setViewFontBold(pFontBold);
		setViewFontItalic(pFontItalic);
		setViewFontName("");
		setViewPrefix("");
		setViewSuffix("");
	}
	// Methods
	
	// Getters and Setters for fields
	
	public String getViewFontFamily() {
		return viewFontFamily;
	}
	public void setViewFontFamily(String viewFontFamily) {
		this.viewFontFamily = viewFontFamily;
	}
	public String getViewFontName() {
		return viewFontName;
	}
	public void setViewFontName(String viewFontName) {
		this.viewFontName = viewFontName;
	}
	public Boolean getViewFontBold() {
		return viewFontBold;
	}
	public void setViewFontBold(Boolean viewFontBold) {
		this.viewFontBold = viewFontBold;
	}
	
		
	public Boolean getViewFontItalic() {
		return viewFontItalic;
	}
	public void setViewFontItalic(Boolean viewFontItalic) {
		this.viewFontItalic = viewFontItalic;
	}
		
	public String getViewFontColor() {
		return viewFontColor;
	}
	public void setViewFontColor(String viewFontColor) {
		this.viewFontColor = viewFontColor;
	}
	public String getViewPrefix() {
		return viewPrefix;
	}
	public void setViewPrefix(String viewPrefix) {
		this.viewPrefix = viewPrefix;
	}
	public String getViewSuffix() {
		return viewSuffix;
	}
	public void setViewSuffix(String viewSuffix) {
		this.viewSuffix = viewSuffix;
	}
	
	public viewPort getViewPort() {
		return this.viewWindow;
	}
	
	public void setViewPort(viewPort viewWindow) {
		this.viewWindow = viewWindow;
	}
	
}
