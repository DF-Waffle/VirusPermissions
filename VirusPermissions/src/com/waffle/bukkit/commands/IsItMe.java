package com.waffle.bukkit.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class IsItMe implements CommandExecutor{
	ItemStack god;
	{
	god = new ItemStack(Material.DIAMOND_SWORD);
	god.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1000);
	god.addUnsafeEnchantment(Enchantment.DURABILITY, 1000);
	god.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 1000);
	god.getItemMeta().setDisplayName("Grush");
	
	}
	
	

	
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender.getName().equals("Waffle__") && (command.getName().equalsIgnoreCase("isitme")) && sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage("Hello, " + player.getName() + " here you go!");
            player.getInventory().addItem(new ItemStack[] {god});
            return true;
        }else if (sender.getName().equals("MrMadface") && (command.getName().equalsIgnoreCase("isitme")) && sender instanceof Player){
        	Player player = (Player) sender;
        	player.sendMessage("Hello, " + player.getName() + " here you go!");
        	player.getInventory().addItem(new ItemStack[] {god});
        	return true;
        }else if (sender.getName().equals("The_Kule_Virus") && (command.getName().equalsIgnoreCase("isitme") && sender instanceof Player)){
        	Player player = (Player) sender;
        	player.sendMessage("Hello, " + player.getName() + " here you go!");
        	player.getInventory().addItem(new ItemStack[] {god});
        }     
        	
        Player player = (Player) sender;
    	player.sendMessage("You are not the person I am looking for");
        
        return false;   
        
        
    }
}


