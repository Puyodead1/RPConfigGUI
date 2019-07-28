/*******************************************************************************
 * Copyright 2019 Puyodead1
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package me.puyodead1.rpconfiggui;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.puyodead1.rpconfiggui.Events.InventoryClick;

public class RPConfigGUI extends JavaPlugin {

	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &b============================================================="));
		InitConfig();
		InitEvents();
		InitMetrics();
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &d========================"));
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bAuthor: &ePuyodead1"));
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bRandomPackage Version: &e" + getServer().getPluginManager().getPlugin("RandomPackage").getDescription().getVersion()));
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bRPConfigGUI Version: &e" + getServer().getPluginManager().getPlugin("RPConfigGUI").getDescription().getVersion()));
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bMinecraft Version: &e" + getServer().getVersion()));
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &b============================================================="));
	}

	public void onDisable() {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("rpconfig")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				// Permission check
				// TODO: move permission to config
				if (player.hasPermission(getConfig().getString("permissions.use"))) {
					player.openInventory(Inventories.SettingsMenu1());
					return true;
				} else {
					// TODO: Change to config
					player.sendMessage(Utils.ChatColor(getConfig().getString("messages.no-permission")));
					return false;
				}
			} else {
				// TODO: Config
				sender.sendMessage(Utils.ChatColor(getConfig().getString("messages.only-players")));
				return false;
			}
		}
		return false;
	}
	public void InitConfig() {
		long started = System.currentTimeMillis();
		
		getConfig().options().copyDefaults(true);
		
		saveDefaultConfig();
		
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bLoaded Configuration file &e(" + (System.currentTimeMillis()-started) + "ms)"));
	}
	
	public void InitEvents() {
		long started = System.currentTimeMillis();
		
		getServer().getPluginManager().registerEvents(new InventoryClick(), this);
		
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bLoaded Events &e(" + (System.currentTimeMillis()-started) + "ms)"));
	}
	
	public void InitMetrics() {
		long started = System.currentTimeMillis();
		
		MetricsLite metrics = new MetricsLite(this);
		
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bInitalized Metrics &e(" + (System.currentTimeMillis()-started) + "ms)"));
		Bukkit.getConsoleSender().sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bUsing Metrics: &e" + metrics.isEnabled()));
	}
}
