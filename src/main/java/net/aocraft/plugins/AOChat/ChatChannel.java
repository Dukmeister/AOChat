/**
 * 
 */
package net.aocraft.plugins.AOChat;
import java.util.HashMap;


/**
 * @author Ducky
 *
 */
public class ChatChannel {
	// Define fields
	public enum channelType {
	    LOCAL, REMOTE, SYSTEM, PRIVATE						// Valid values for channel type
	}														// LOCAL - local server chat
															// REMOTE - remote server chat using IRC protocol
															// SYSTEM - system messages
															// PRIVATE - private messages between two users (local and/or remote)
															
	channelType chType;										// Type of channel (local or remote)
	String chName ;											// Unique name of channel
	Integer chRange ;										// Range the channel can be heard, 0 for global
	String chPass ;											// Password for channel or null
	String chDescription ;									// Description of channel purpose
	// List of users currently registered to this channel and the View associated with that channel
	public HashMap<String, ChatUser> chUsers = new HashMap<String, ChatUser>();
	
	// Constructor
	public ChatChannel(String pName, channelType pType) {
		chName = pName;
		chType = pType;
	}
	
	// Methods
	public HashMap<String,ChatUser> getChannelUsers() {
		return chUsers;
		
	}
	
	public void addChannelUser(String pName, ChatUser pUser) {	// Adds a user to the channel
		chUsers.put(pName, pUser);
	}
	
	public void removeChannelUser(String pUserName) {		// Remove user from channel, small collection? could use HashMap maybe? 
		chUsers.remove(pUserName);
	}
	
	

	
	
	// Getters and Setters

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}
	public channelType getChType() {
		return chType;
	}

	public void setChType(channelType chType) {
		this.chType = chType;
	}

	public Integer getChRange() {
		return chRange;
	}

	public void setChRange(Integer chRange) {
		this.chRange = chRange;
	}

	public String getChPass() {
		return chPass;
	}

	public void setChPass(String chPass) {
		this.chPass = chPass;
	}

	public String getChDescription() {
		return chDescription;
	}

	public void setChDescription(String chDescription) {
		this.chDescription = chDescription;
	}
	
}
