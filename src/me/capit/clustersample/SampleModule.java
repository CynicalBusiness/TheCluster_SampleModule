package me.capit.clustersample;

import org.bukkit.ChatColor;
import org.clustermc.core.Module;

public class SampleModule extends Module {
	
	/**
	 * Calls when the module is loaded. Used to initialize data.
	 */
	@Override
	public void onLoad() {
		// Console can display color using the ChatColor class.
		getConsole().sendMessage(ChatColor.WHITE+"Sample module is loaded!");
	}
	
	/**
	 * Calls when the module is unloaded. Used to wrap up data.
	 */
	@Override
	public void onUnload() {
		getConsole().sendMessage(ChatColor.WHITE+"Sample module is unloaded!");
	}
	
}
