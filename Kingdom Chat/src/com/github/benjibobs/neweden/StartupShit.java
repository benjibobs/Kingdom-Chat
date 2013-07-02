package com.github.benjibobs.neweden;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;

public class StartupShit {
	
	public static Main plugin;
	public StartupShit(Main instance){
		plugin = instance;
	}
	public final Logger logger = Logger.getLogger("Minecraft");	
	
	public void enabled(boolean enabled){
		if(enabled){
			PluginDescriptionFile pdfFile = plugin.getDescription();
			this.logger.info("[KingdomChat] " + pdfFile.getName() + " v." + pdfFile.getVersion() + " has been enabled");
			
		}else{
			PluginDescriptionFile pdfFile = plugin.getDescription();
			this.logger.info("[KingdomChat] " + pdfFile.getName() + " v." + pdfFile.getVersion() + " has been disabled");
		}
		
	}

}

