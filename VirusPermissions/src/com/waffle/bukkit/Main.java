package com.waffle.bukkit;


import org.bukkit.plugin.java.JavaPlugin;

import com.waffle.bukkit.commands.AdminMode;
import com.waffle.bukkit.commands.IsItMe;
import com.waffle.bukkit.commands.NightVis;
import com.waffle.bukkit.commands.Shield;

public class Main extends JavaPlugin{
    //Required in all bukkit plugins
		
	
    @Override
    public void onEnable(){
        //fired when plugin is enabled
        getLogger().info("onEnable has beeen enabled");
        
        getCommand("isitme").setExecutor(new IsItMe());
        getCommand("adminmode").setExecutor(new AdminMode());
        getCommand("playermode").setExecutor(new AdminMode());
        getCommand("nightvis").setExecutor(new NightVis());
        getCommand("shield").setExecutor(new Shield());
    }

    @Override
    public void onDisable(){
        //fired when plugin is disabled

    }
   

 
}