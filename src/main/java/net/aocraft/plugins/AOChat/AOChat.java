/**
*
*/
package net.aocraft.plugins.AOChat;

import java.util.HashMap;

import org.spout.api.command.CommandRegistrationsFactory;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleAnnotatedCommandExecutorFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;

/**
* @author Ducky
*
*/

public class AOChat extends CommonPlugin {
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
		getLogger().info("disabled");
	}

	@Override
	public void onEnable() {
		// Load Config

		//Commands
		CommandRegistrationsFactory<Class<?>> commandRegFactory = new AnnotatedCommandRegistrationFactory(new SimpleInjector(this), new SimpleAnnotatedCommandExecutorFactory());
		engine.getRootCommand().addSubCommands(this, AdministrationCommands.class, commandRegFactory);
		if (engine.debugMode()) {
		engine.getRootCommand().addSubCommands(this, TestCommands.class, commandRegFactory);
		}


		
		System.out.println(pluginID + "v" + getDescription().getVersion() + " has been enabled.");
	}

}