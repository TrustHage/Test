package me.trusthage.other;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import me.trusthage.commands.*;

public class Main extends JavaPlugin{
	
	Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	public void onEnable(){
		plugin = this;
		logger.info("The plugin has been enabled.");
		getCommand("enderchest").setExecutor(new Enderchest());
	}
	
	public void onDisable(){
		logger.info("The plugin has been disabled.");
	}

}
