package net.louiml.basicplugin.procedures;

import org.bukkit.entity.Entity;

import java.util.Map;

public class SendmessageProcedure implements org.bukkit.event.Listener {
	public static void executeProcedure(Map<String, Object> dependencies) {
		Entity entity = (Entity) dependencies.get("entity");
		entity.sendMessage("hello world");
	}

}
