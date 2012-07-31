/**
 *  Needed to hold ignore list and user status (muted, etc)
 */
package net.aocraft.plugins.AOChat;

import java.util.ArrayList;

import org.spout.api.player.Player;


/**
 * @author Ducky
 *
 */
public class ChatUser {
	// Class fields
	String chUserName;
	Player chPlayer;
	ArrayList<viewPort> chViewPorts;
	

	// Class Constructor
	public ChatUser(Player pPlayer){
		chPlayer = pPlayer;
		chUserName = pPlayer.getName();
		chViewPorts = new ArrayList<viewPort>();
	}

	// Class Methods
	public void removeViewPort(viewPort pViewPort) {
	   for (int i = 0; i < chViewPorts.size(); i++) {
		 if (chViewPorts.get(i) == pViewPort) {
			chViewPorts.remove(i);
			return;
		}
	   }
	}
	
	public void addViewPort(viewPort pViewPort) {
		chViewPorts.add(pViewPort);
	}
	
	 

	// Class getters and setters

	public String getChUserName() {
		return chUserName;
	}

	public void setChUserName(String chUserName) {
		this.chUserName = chUserName;
	}

	public ArrayList<viewPort> getViewPorts() {
		return chViewPorts;
	}



	

	
 
}
