package me.Nomad.RunnableP;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("[Runnable] Enabled");
		getCommand("time").setExecutor(new Command());
		plugin = this;
		
		
		
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("[Runnable] Disabled");
		
	}

}
