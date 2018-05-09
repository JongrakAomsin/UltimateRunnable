package me.Nomad.RunnableP;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

public class Time {
	
	public static int time = 61; // Time for run escape HA HA HA
	public static int taskStartTime; //task start ID
	
	public static void startTime() {
		
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
		taskStartTime = scheduler.scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
			
			public void run() {
				time = time - 1;
				
				for(Player p : Bukkit.getOnlinePlayers()) {
					p.setLevel(time);
				}
				
				if(time >= 1) {
					Bukkit.broadcastMessage("TEST " + time);
					
				} else if (time == 0) {
					stopTime();
				}		
			}			
			
		}, 0L, 20L);
		
	}
	
	public static void stopTime() { //stop time = stop task and reset
		Bukkit.getScheduler().cancelTask(taskStartTime);
		resetTime();
		
	}
	
	public static void resetTime() { //reset time = reset time only
		time = 61;
		
	}

	

	
}
