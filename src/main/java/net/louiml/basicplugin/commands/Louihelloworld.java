package net.louiml.basicplugin.commands;

import org.bukkit.entity.Entity;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.World;

import net.louiml.basicplugin.procedures.SendmessageProcedure;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Louihelloworld implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("louihelloworld")) {
			double x = 0;
			double y = 0;
			double z = 0;
			Entity entity = null;
			World world = null;
			if (sender instanceof Entity) {
				entity = (Entity) sender;
				x = entity.getLocation().getX();
				y = entity.getLocation().getX();
				z = entity.getLocation().getX();
				world = entity.getWorld();
			} else if (sender instanceof BlockCommandSender) {
				x = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				y = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				z = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				world = ((BlockCommandSender) sender).getBlock().getWorld();
			}
			HashMap<String, String> cmdparams = new HashMap<>();
			int[] index = { -1 };
			Arrays.stream(args).forEach(param -> {
				if (index[0] >= 0)
					cmdparams.put(Integer.toString(index[0]), param);
				index[0]++;
			});
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SendmessageProcedure.executeProcedure($_dependencies);
			}
			return true;
		}
		return false;
	}
}