package net.louiml.basicplugin;

import org.bukkit.plugin.java.JavaPlugin;

import net.louiml.basicplugin.procedures.SendmessageProcedure;
import net.louiml.basicplugin.commands.Louihelloworld;

public class BasicPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("louihelloworld").setExecutor(new Louihelloworld());
		getServer().getPluginManager().registerEvents(new SendmessageProcedure(), this);
	}

	@Override
	public void onDisable() {
	}
}