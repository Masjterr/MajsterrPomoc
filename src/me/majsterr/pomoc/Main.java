package me.majsterr.pomoc;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		super.onEnable();
		getCommand("pomoc").setExecutor(new PomocCommand());
		getCommand("vip").setExecutor(new VipCommand());
		getCommand("informacje").setExecutor(new InformacjeCommand());
	}

}
