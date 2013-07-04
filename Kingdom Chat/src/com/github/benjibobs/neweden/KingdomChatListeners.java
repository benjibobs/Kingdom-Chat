package com.github.benjibobs.neweden;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class KingdomChatListeners implements Listener {
	
	public final HashMap<String, ArrayList<Block>> globalchat = new HashMap<String, ArrayList<Block>>();
	public static Main plugin;
	
	public KingdomChatListeners(Main instance){
	
		
		plugin = instance;
		
	}

	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event){
		Player player = event.getPlayer();
		String msg = event.getMessage();
		if(globalchat.containsKey(player.getName())){
			if(player.hasPermission("talk.kingdomless")){
				
				event.setCancelled(false);
				
			}else if(player.hasPermission("talk.naqar.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.naqar.user") || players.hasPermission("talk.naqar.noble") || players.hasPermission("talk.naqar.council") || players.hasPermission("talk.naqar.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.naqar.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.naqar.user") || players.hasPermission("talk.naqar.noble") || players.hasPermission("talk.naqar.council") || players.hasPermission("talk.naqar.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.naqar.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.naqar.user") || players.hasPermission("talk.naqar.noble") || players.hasPermission("talk.naqar.council") || players.hasPermission("talk.naqar.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.naqar.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.naqar.user") || players.hasPermission("talk.naqar.noble") || players.hasPermission("talk.naqar.council") || players.hasPermission("talk.naqar.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			else if(player.hasPermission("talk.noihara.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.noihara.user") || players.hasPermission("talk.noihara.noble") || players.hasPermission("talk.noihara.council") || players.hasPermission("talk.noihara.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.noihara.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.noihara.user") || players.hasPermission("talk.noihara.noble") || players.hasPermission("talk.noihara.council") || players.hasPermission("talk.noihara.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.noihara.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.noihara.user") || players.hasPermission("talk.noihara.noble") || players.hasPermission("talk.noihara.council") || players.hasPermission("talk.noihara.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.noihara.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.noihara.user") || players.hasPermission("talk.noihara.noble") || players.hasPermission("talk.noihara.council") || players.hasPermission("talk.noihara.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			else if(player.hasPermission("talk.crystal.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.crystal.user") || players.hasPermission("talk.crystal.noble") || players.hasPermission("talk.crystal.council") || players.hasPermission("talk.crystal.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.crystal.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.crystal.user") || players.hasPermission("talk.crystal.noble") || players.hasPermission("talk.crystal.council") || players.hasPermission("talk.crystal.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.crystal.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.crystal.user") || players.hasPermission("talk.crystal.noble") || players.hasPermission("talk.crystal.council") || players.hasPermission("talk.crystal.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.crystal.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.crystal.user") || players.hasPermission("talk.crystal.noble") || players.hasPermission("talk.crystal.council") || players.hasPermission("talk.crystal.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			else if(player.hasPermission("talk.white.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.white.user") || players.hasPermission("talk.white.noble") || players.hasPermission("talk.white.council") || players.hasPermission("talk.white.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.white.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.white.user") || players.hasPermission("talk.white.noble") || players.hasPermission("talk.white.council") || players.hasPermission("talk.white.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.white.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.white.user") || players.hasPermission("talk.white.noble") || players.hasPermission("talk.white.council") || players.hasPermission("talk.white.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.white.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.white.user") || players.hasPermission("talk.white.noble") || players.hasPermission("talk.white.council") || players.hasPermission("talk.white.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			else if(player.hasPermission("talk.wellwood.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.wellwood.user") || players.hasPermission("talk.wellwood.noble") || players.hasPermission("talk.wellwood.council") || players.hasPermission("talk.wellwood.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.wellwood.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.wellwood.user") || players.hasPermission("talk.wellwood.noble") || players.hasPermission("talk.wellwood.council") || players.hasPermission("talk.wellwood.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.wellwood.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.wellwood.user") || players.hasPermission("talk.wellwood.noble") || players.hasPermission("talk.wellwood.council") || players.hasPermission("talk.wellwood.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.wellwood.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.wellwood.user") || players.hasPermission("talk.wellwood.noble") || players.hasPermission("talk.wellwood.council") || players.hasPermission("talk.wellwood.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			else if(player.hasPermission("talk.vesperia.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.vesperia.user") || players.hasPermission("talk.vesperia.noble") || players.hasPermission("talk.vesperia.council") || players.hasPermission("talk.vesperia.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.vesperia.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.vesperia.user") || players.hasPermission("talk.vesperia.noble") || players.hasPermission("talk.vesperia.council") || players.hasPermission("talk.vesperia.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.vesperia.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.vesperia.user") || players.hasPermission("talk.vesperia.noble") || players.hasPermission("talk.vesperia.council") || players.hasPermission("talk.vesperia.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.vesperia.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.vesperia.user") || players.hasPermission("talk.vesperia.noble") || players.hasPermission("talk.vesperia.council") || players.hasPermission("talk.vesperia.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			else if(player.hasPermission("talk.appa.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.appa.user") || players.hasPermission("talk.appa.noble") || players.hasPermission("talk.appa.council") || players.hasPermission("talk.appa.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.appa.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.appa.user") || players.hasPermission("talk.appa.noble") || players.hasPermission("talk.appa.council") || players.hasPermission("talk.appa.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.appa.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.appa.user") || players.hasPermission("talk.appa.noble") || players.hasPermission("talk.appa.council") || players.hasPermission("talk.appa.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.appa.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.appa.user") || players.hasPermission("talk.appa.noble") || players.hasPermission("talk.appa.council") || players.hasPermission("talk.appa.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			else if(player.hasPermission("talk.stryke.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.stryke.user") || players.hasPermission("talk.stryke.noble") || players.hasPermission("talk.stryke.council") || players.hasPermission("talk.stryke.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.stryke.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.stryke.user") || players.hasPermission("talk.stryke.noble") || players.hasPermission("talk.stryke.council") || players.hasPermission("talk.stryke.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.stryke.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.stryke.user") || players.hasPermission("talk.stryke.noble") || players.hasPermission("talk.stryke.council") || players.hasPermission("talk.stryke.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.stryke.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.stryke.user") || players.hasPermission("talk.stryke.noble") || players.hasPermission("talk.stryke.council") || players.hasPermission("talk.stryke.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.tortuga.user")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.tortuga.user") || players.hasPermission("talk.tortuga.noble") || players.hasPermission("talk.tortuga.council") || players.hasPermission("talk.tortuga.king")){
		 				
		 				players.sendMessage("(Citizen) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.tortuga.noble")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.tortuga.user") || players.hasPermission("talk.tortuga.noble") || players.hasPermission("talk.tortuga.council") || players.hasPermission("talk.tortuga.king")){
		 				
		 				players.sendMessage("(Nobleman) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.tortuga.council")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.tortuga.user") || players.hasPermission("talk.tortuga.noble") || players.hasPermission("talk.tortuga.council") || players.hasPermission("talk.tortuga.king")){
		 				
		 				players.sendMessage("(Council) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}else if(player.hasPermission("talk.tortuga.king")){
				for(Player players : Bukkit.getOnlinePlayers()){
		 			if(players.hasPermission("talk.tortuga.user") || players.hasPermission("talk.tortuga.noble") || players.hasPermission("talk.tortuga.council") || players.hasPermission("talk.tortuga.king")){
		 				
		 				players.sendMessage("(King) " + player.getDisplayName() + ": " + msg);
		 				event.setCancelled(true);
		 			}
		 			
		 		}
			}
			
			
			
			
					
		
	}


}
}
