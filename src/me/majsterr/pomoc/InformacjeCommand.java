package me.majsterr.pomoc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InformacjeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		Player p = (Player)sender;
		p.sendMessage(ChatColor.GREEN + "Serwer na wersje bla bla bla....");
		p.sendMessage("§2Wykonany przez:");
		p.sendMessage("§2Hostujemy go na: aternos/vps/titanaxe");
		p.sendMessage("§2Zakup na stronie xyz.xyz");
		return false;
	}

}
