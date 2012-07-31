/**
 * This class implements the Event Listener and check for Chat events
 */
package net.aocraft.plugins.AOChat;

import org.spout.api.entity.Entity;
import org.spout.api.event.EventHandler;
import org.spout.api.event.Listener;
import org.spout.api.event.Order;
import org.spout.api.event.player.PlayerLoginEvent;
import org.spout.api.player.Player;

/**
 * @author Ducky
 *
 */
public class ChatListener implements Listener {
	private final AOChat plugin;
	
	public ChatListener(AOChat plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler(order = Order.LATEST)
	public void onPlayerLogin(PlayerLoginEvent event) {
		if (!event.isAllowed()) {
			return;
		}
		// Player login, load user personal channels and chat configuration
		Player player = event.getPlayer();
		Entity playerEntity = player.getEntity();
		
	}
}
