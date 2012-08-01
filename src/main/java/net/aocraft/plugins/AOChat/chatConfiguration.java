/**
 * 
 */
package net.aocraft.plugins.AOChat;

import java.io.File;

import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.ConfigurationHolder;
import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;



/**
 * @author Ducky
 *
 */
public class chatConfiguration extends ConfigurationHolderConfiguration {
	
	// General
	public static final ConfigurationHolder BROADCAST = new ConfigurationHolder(true, "general", "broadcast");					// Broadcast channel entry/leaves
	public static final ConfigurationHolder USERCHANNELS = new ConfigurationHolder(true, "general", "userchannels");			// Users can create channels
	public static final ConfigurationHolder PRIVATEMESSAGES = new ConfigurationHolder(true, "general", "privatemessages");		// Users can send PMs
	public static final ConfigurationHolder DEFAULTCHANNEL = new ConfigurationHolder("default", "general", "defaultchannel");   // Default channel name
	public static final ConfigurationHolder LOCALCHAT = new ConfigurationHolder(true, "general", "localchat");					// Local (say) chat enabled
	
	
	public chatConfiguration(File dataFolder) {
        super(new YamlConfiguration(new File(dataFolder, "config.yml")));
    }
	
	@Override
	public void load() throws ConfigurationException {
		super.load();
		super.save();
	}

	@Override
	public void save() throws ConfigurationException {
		super.save();
	}
}