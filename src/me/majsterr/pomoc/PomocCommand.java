package me.majsterr.pomoc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PomocCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		Player p = (Player)sender;
		p.sendMessage(ChatColor.GREEN + "Pomoc:");
		p.sendMessage("§2Informacje o vipie /vip");
		return false;
	}

}
