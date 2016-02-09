package com.github.zinntikumugai.command_put;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Command_Put extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {

	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		//右クリックの時
		if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			Player player = event.getPlayer();
			//playerが持っているアイテムがcommandの時
			if(player.getItemInHand().equals(Material.COMMAND)) {
				World world = getServer().getWorld(event.getClickedBlock().getWorld().toString());
				Block block = event.getClickedBlock();

			}
		}
	}
}
