package com.github.benjibobs.neweden;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	public final StartupShit starlogs = new StartupShit(this);
	public final KingdomChatListeners cl = new KingdomChatListeners(this);
	
	@Override
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(cl,this);
		starlogs.enabled(true);
	}
	
	@Override
	public void onDisable() {
		starlogs.enabled(false);
	}	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if(label.equalsIgnoreCase("alert")){
			
			if(sender instanceof Player){
				Player psend = (Player)sender;
			if(args.length == 0){
				
				sender.sendMessage("Wrong usage:");
				sender.sendMessage("/alert <message>");
				
			}else{
				StringBuilder sb = new StringBuilder();
		        for(int i = 0; i < args.length; i++) {
		            if (i > 0) sb.append(" ");
		            sb.append(args[i]);
		        }
		            cl.globalchat.put(psend.getName(), null);
		            psend.chat(ChatColor.DARK_RED + sb.toString());
		            cl.globalchat.remove(psend.getName());
			
			}
			}else{
				
				sender.sendMessage(ChatColor.DARK_RED + "You must be a player to do this :(");
				
			}
			
		}else if(label.equalsIgnoreCase("global")){
			if(sender instanceof Player){
				Player psend = (Player)sender;
				if(args.length == 0){
					if(cl.globalchat.containsKey(psend.getName())){
					
						cl.globalchat.remove(psend.getName());
						sender.sendMessage("");
						sender.sendMessage(ChatColor.GOLD + "You have switched to " + ChatColor.RED + "Global Chat" + ChatColor.GOLD + ".");
						sender.sendMessage("");
						
					
					}else{
						

						sender.sendMessage("");
						sender.sendMessage(ChatColor.GOLD + "You are already in " + ChatColor.RED + "Global Chat" + ChatColor.GOLD + ".");
						sender.sendMessage("");
						
					}
					
				}else{
					
					StringBuilder sb = new StringBuilder();
			        for(int i = 0; i < args.length; i++) {
			            if (i > 0) sb.append(" ");
			            sb.append(args[i]);
			        }
			        	cl.globalchat.remove(psend.getName());
			            psend.chat(sb.toString());
			            
			            cl.globalchat.put(psend.getName(), null);
					
				}
				
			}else{
				
				sender.sendMessage(ChatColor.DARK_RED + "You must be a player to use this feature!");
				
			}
			
			
		}else if(label.equalsIgnoreCase("kingdom")){
			if(sender instanceof Player){
				Player psend = (Player)sender;
				if(!psend.hasPermission("talk.kingdomless")){
				if(args.length == 0){
					if(cl.globalchat.containsKey(psend.getName())){
						sender.sendMessage("");
						sender.sendMessage(ChatColor.GOLD + "You are already in " + ChatColor.RED + "Kingdom Chat" + ChatColor.GOLD + ".");
						sender.sendMessage("");
					
					}else{
						
						
						cl.globalchat.put(psend.getName(), null);
						
						sender.sendMessage("");
						sender.sendMessage(ChatColor.GOLD + "You have switched to " + ChatColor.RED + "Kingdom Chat" + ChatColor.GOLD + ".");
						sender.sendMessage("");
					}
					
				}else{
					
					sender.sendMessage(ChatColor.DARK_RED + "Too many arguments.");
				}
				}else{
					
					psend.sendMessage("");
					psend.sendMessage(ChatColor.GOLD + "You aren't in a kingdom!");
					psend.sendMessage("");
					
				}
			}else{
				
				sender.sendMessage(ChatColor.DARK_RED + "You must be a player to use this feature!");
				
			}
			
			
		}else if(label.equalsIgnoreCase("kingdomchat")){
			
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "==== " + ChatColor.DARK_RED + "Kingdom Chat " + ChatColor.GOLD + "====");
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "Purpose: " + ChatColor.RED + "This plugin creates a kingdom only chat channel, for you to discuss your secrets in!");
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "Author: " + ChatColor.RED + "benjibobs");
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "Version: " + ChatColor.RED + "" + this.getDescription().getVersion());
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "======================");
			sender.sendMessage("");
			
		}
				return false;
		
	}
	
	
	
}
