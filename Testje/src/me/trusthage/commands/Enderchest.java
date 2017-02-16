package me.trusthage.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Enderchest implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Player player = (Player)sender;
		
		if(args.length == 0){
			player.openInventory(player.getEnderChest());
		}else if (args.length == 1){
			Player target = Bukkit.getPlayer(args[0]);
			if(target != null){
				player.openInventory(target.getEnderChest());
			}else{
				player.sendMessage(ChatColor.RED + "That player is not online.");
			}
		}else{
			player.sendMessage(ChatColor.RED + "Please type: /enderchest <playername>");
		}
		
		return false;
	}

}
