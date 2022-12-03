package me.majsterr.pomoc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VipCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		Player p = (Player)sender;
		p.sendMessage(ChatColor.GREEN + "Informacje dla rangi vip:");
		p.sendMessage("§2Dostep do kit: vip, gracz, enderchest");
		p.sendMessage("§2Mozliwosc latania na spawn");
		p.sendMessage("§2Zakup na stronie xyz.xyz");
		return false;
	}

}
