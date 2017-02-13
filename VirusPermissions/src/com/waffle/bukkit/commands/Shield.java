package com.waffle.bukkit.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Shield implements CommandExecutor{
	
	
		

	ItemStack god;
	{
	god = new ItemStack(Material.STICK);
	god.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10000);		
	}
	
	

	
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Player player = (Player) sender;
    	
    	if(player.hasPermission("shield")){
    		player.getInventory().addItem(new ItemStack[] {god});
            return true;
        	
        }
           
        	
        return false;   
        
        
    }
}



