/**
 * 
 */
package net.aocraft.plugins.AOChat;

import java.util.HashMap;

import org.spout.api.plugin.CommonPlugin;

/**
 * @author Ducky
 *
 */

public class Chat extends CommonPlugin {
	// Declare global variables and constants
	public static String pluginID = "[AO_Chat] ";
	public enum channelType {
	    LOCAL, REMOTE, SYSTEM, PRIVATE 
	}
	// Map of channels currently loaded, key = channel name
	public static HashMap<String, ChatChannel> chChannels = new HashMap<String, ChatChannel>();
	
	@Override
	public void onDisable() {
		
			System.out.println(pluginID + "v" + getDescription().getVersion() + " has been disabled.");
	}

	@Override
	public void onEnable() {
			System.out.println(pluginID + "v" + getDescription().getVersion() + " has been enabled.");
	}
	
	
}
