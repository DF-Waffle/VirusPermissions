package com.waffle.bukkit.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminMode implements CommandExecutor {
	
	
		
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args){
		Player player = (Player) sender;
		
		if(command.getName().equalsIgnoreCase("adminmode") && sender instanceof Player){
			if(player.hasPermission("adminmode.admin"))
				player.setGameMode(GameMode.CREATIVE);
				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You are now in ADMIN mode and invisible from normal players");
			for(Player p : Bukkit.getServer().getOnlinePlayers()){
				if (p != player)
				p.hidePlayer(player);
			}
			
		}
		
		//TODO: Known issue: players dont reappear sometimes FIX
		if (command.getName().equalsIgnoreCase("playermode") && sender instanceof Player){
			if(player.hasPermission("adminmode.player"))
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You are now in PLAYER mode and now visable");
			for (Player p : Bukkit.getServer().getOnlinePlayers()){
				if (p != player)
			player.showPlayer(player);
			}
		}	
		
		
		return false;
	}

}
