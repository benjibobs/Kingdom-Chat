package com.github.benjibobs.neweden;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class CodeDump implements Listener{

	HashMap<String, ArrayList<Block>> globalchat = new HashMap<String, ArrayList<Block>>();

@EventHandler
public void onPlayerChat(AsyncPlayerChatEvent event){
	Player player = event.getPlayer();
	String msg = event.getMessage();
	if(!globalchat.containsKey(player.getName())){
	 		if(player.hasPermission("talk.naqar.user")){
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.naqar.user");
		 	Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.naqar.noble");
		 	Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.naqar.council");
		 	Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.naqar.king");
		    event.setCancelled(true);
	 	}else if(player.hasPermission("talk.naqar.noble")){
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.user");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.noble");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.council");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.naqar.council")){
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.naqar.user");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.naqar.noble");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.naqar.council");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.naqar.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.naqar.king")){
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.naqar.user");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.naqar.noble");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.naqar.council");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.naqar.king");
	 		event.setCancelled(true);
	 	}
	 	
	 	else if(player.hasPermission("talk.whitecliff.user")){
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.whitecliff.user");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.whitecliff.noble");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.whitecliff.council");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.whitecliff.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.whitecliff.noble")){
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.whitecliff.user");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.whitecliff.noble");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.whitecliff.council");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.whitecliff.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.whitecliff.council")){
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.whitecliff.user");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.whitecliff.noble");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.whitecliff.council");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.whitecliff.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.whitecliff.king")){
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.whitecliff.user");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.whitecliff.noble");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.whitecliff.council");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.whitecliff.king");
	 		event.setCancelled(true);
	 	}
	 	
	 	else if(player.hasPermission("talk.wellwood.user")){
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.wellwood.user");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.wellwood.noble");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.wellwood.council");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.wellwood.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.wellwood.noble")){
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.user");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.noble");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.council");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.naqar.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.wellwood.council")){
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.wellwood.user");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.wellwood.noble");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.wellwood.council");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.wellwood.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.wellwood.king")){
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.wellwood.user");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.wellwood.noble");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.wellwood.council");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.wellwood.king");
	 		event.setCancelled(true);
	 	}
	 	
	 	else if(player.hasPermission("talk.crystal.user")){
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.crystal.user");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.crystal.noble");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.crystal.council");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.crystal.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.crystal.noble")){
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.crystal.user");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.crystal.noble");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.crystal.council");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.crystal.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.crystal.council")){
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.crystal.user");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.crystal.noble");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.crystal.council");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.crystal.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.crystal.king")){
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.crystal.user");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.crystal.noble");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.crystal.council");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.crystal.king");
	 		event.setCancelled(true);
	 	}
	 	
	 	else if(player.hasPermission("talk.appalache.user")){
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.appalache.user");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.appalache.noble");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.naqar.council");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.naqar.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.appalache.noble")){
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.appalache.user");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.appalache.noble");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.appalache.council");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.appalache.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.appalache.council")){
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.appalache.user");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.appalache.noble");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.appalache.council");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.appalache.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.appalache.king")){
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.appalache.user");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.appalache.noble");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.appalache.council");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.appalache.king");
	 		event.setCancelled(true);
	 	}
	 	
	 	else if(player.hasPermission("talk.stry.user")){
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.stry.user");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.stry.noble");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.stry.council");
	 		Bukkit.broadcast("(Citizen) " + player.getName() + ": " + msg, "talk.stry.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.stry.noble")){
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.stry.user");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.stry.noble");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.stry.council");
	 		Bukkit.broadcast("(Nobleman) " + player.getName() + ": " + msg, "talk.stry.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.stry.council")){
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.stry.user");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.stry.noble");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.stry.council");
	 		Bukkit.broadcast("(Council) " + player.getName() + ": " + msg, "talk.stry.king");
	 		event.setCancelled(true);
	 	}else if(player.hasPermission("talk.stry.king")){
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.stry.user");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.stry.noble");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.stry.council");
	 		Bukkit.broadcast("(King) " + player.getName() + ": " + msg, "talk.stry.king");
	 		event.setCancelled(true);
	 	}
		
	}
	
}


}