package com.waffle.bukkit.commands;

import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class NightVis implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		Player player = (Player) sender;
		World w = player.getWorld();
		if(command.getName().equalsIgnoreCase("nightvis") && sender instanceof Player){
		
		if(player.hasPermission("nightvis"))
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2000000, 0));
			w.playSound(player.getLocation(), Sound.ENTITY_WITCH_DRINK, 10, 1);
		return false;
	}
		return false;
	}

}
