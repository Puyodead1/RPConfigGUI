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
package io.github.puyodead1.RPConfigGUI.Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import io.github.puyodead1.RPConfigGUI.Inventories;
import io.github.puyodead1.RPConfigGUI.ItemStacks;
import io.github.puyodead1.RPConfigGUI.Utils;
import me.randomhashtags.randompackage.RandomPackage;

public class InventoryClick implements Listener {

	@EventHandler
	public void InventoryClickEvent(InventoryClickEvent e) {
		if (!e.isCancelled() && e.getCurrentItem() != null && !e.getCurrentItem().getType().equals(Material.AIR)
				&& e.getClickedInventory() != null && e.getCursor() != null
				&& !e.getClick().equals(ClickType.DOUBLE_CLICK)) {
			/*
			 * Menu1 click
			 */
			if (e.getClickedInventory().getTitle().equals(Inventories.SettingsMenu1().getTitle())) {
				e.setCancelled(true);
				Player player = (Player) e.getWhoClicked();
				ItemStack ci = e.getCurrentItem();

				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.NextPage().clone().getItemMeta().getDisplayName())) {
					// Open next page
					player.closeInventory();
					player.openInventory(Inventories.SettingsMenu2());
				}

				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.CloseInventory().clone().getItemMeta().getDisplayName())) {
					// Open next page
					player.closeInventory();
				}

				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.ReloadRandomPackge().clone().getItemMeta().getDisplayName())) {
					// Open next page
					long started = System.currentTimeMillis();
					player.closeInventory();
					player.sendMessage(
							Utils.ChatColor("&7[&dRPConfigGUI&7] &bRunning RandomPackage reload command..."));
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "rp reload");
					player.sendMessage(Utils.ChatColor("&7[&dRPConfigGUI&7] &bReloaded RandomPackage in &e"
							+ (System.currentTimeMillis() - started) + "ms"));
				}

				if (!ci.getType().equals(Material.WHITE_STAINED_GLASS_PANE)
						&& !ci.getType().equals(Material.BLUE_STAINED_GLASS_PANE)
						&& !ci.getType().equals(Material.LIGHT_BLUE_STAINED_GLASS)
						&& !ci.getType().equals(Material.LIME_STAINED_GLASS) && !ci.getType().equals(Material.BARRIER)
						&& !ci.getType().equals(Material.ARROW)) {
					String settingName = null;
					String ciName = Utils.Strip(ci.getItemMeta().getDisplayName().toLowerCase());
					if (ciName.equals("black scrolls") || ciName.equals("dusts") || ciName.equals("enchantment orbs")
							|| ciName.equals("fireballs") || ciName.equals("randomization scrolls")
							|| ciName.equals("rarity gems") || ciName.equals("soul trackers")) {
						settingName = "custom enchants." + ciName;
					} else if (ciName.equals("[item]") || ciName.equals("[brag]")) {
						settingName = "chat cmds." + ciName.substring(1).substring(0, ciName.length() - 2) + ".enabled";
					} else {
						settingName = ciName + ".enabled";
					}
					Boolean setting = RandomPackage.getPlugin.getConfig().getBoolean(settingName);
					if (setting != null) {
						// Toggle the setting
						Boolean newSetting = !RandomPackage.getPlugin.getConfig().getBoolean(settingName);
						RandomPackage.getPlugin.getConfig().set(settingName, newSetting);
						player.closeInventory();
						player.sendMessage(Utils.ChatColor(
								"&7[&dRPConfigGUI&7] &bChanges will take effect after next server restart."));
						player.openInventory(Inventories.SettingsMenu1());
					}
				}
			}

			/*
			 * menu 2 click
			 */
			if (e.getClickedInventory().getTitle().equals(Inventories.SettingsMenu2().getTitle())) {
				e.setCancelled(true);
				Player player = (Player) e.getWhoClicked();
				ItemStack ci = e.getCurrentItem();

				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.PrevPage().clone().getItemMeta().getDisplayName())) {
					player.closeInventory();
					player.openInventory(Inventories.SettingsMenu1());
				}
				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.NextPage().clone().getItemMeta().getDisplayName())) {
					player.closeInventory();
					player.openInventory(Inventories.SettingsMenu3());
				}
				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.CloseInventory().clone().getItemMeta().getDisplayName())) {
					// Open next page
					player.closeInventory();
				}
				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.ReloadRandomPackge().clone().getItemMeta().getDisplayName())) {
					// Open next page
					player.closeInventory();
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "rp reload");
				}

				if (!ci.getType().equals(Material.WHITE_STAINED_GLASS_PANE)
						&& !ci.getType().equals(Material.BLUE_STAINED_GLASS_PANE)
						&& !ci.getType().equals(Material.LIGHT_BLUE_STAINED_GLASS)
						&& !ci.getType().equals(Material.LIME_STAINED_GLASS) && !ci.getType().equals(Material.BARRIER)
						&& !ci.getType().equals(Material.ARROW)) {
					String settingName = null;
					String ciName = Utils.Strip(ci.getItemMeta().getDisplayName().toLowerCase());
					if (ciName.equals("black scrolls") || ciName.equals("dusts") || ciName.equals("enchantment orbs")
							|| ciName.equals("fireballs") || ciName.equals("randomization scrolls")
							|| ciName.equals("rarity gems") || ciName.equals("soul trackers")) {
						settingName = "custom enchants." + ciName;
					} else {
						settingName = ciName + ".enabled";
					}
					Boolean setting = RandomPackage.getPlugin.getConfig().getBoolean(settingName);
					if (setting != null) {
						// Toggle the setting
						Boolean newSetting = !RandomPackage.getPlugin.getConfig().getBoolean(settingName);
						RandomPackage.getPlugin.getConfig().set(settingName, newSetting);
						player.closeInventory();
						player.sendMessage(Utils.ChatColor(
								"&7[&dRPConfigGUI&7] &bChanges will take effect after next server restart."));
						player.openInventory(Inventories.SettingsMenu2());
					}
				}
			}

			/*
			 * Menu 3 click
			 */
			if (e.getClickedInventory().getTitle().equals(Inventories.SettingsMenu3().getTitle())) {
				e.setCancelled(true);
				Player player = (Player) e.getWhoClicked();
				ItemStack ci = e.getCurrentItem();

				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.PrevPage().clone().getItemMeta().getDisplayName())) {
					player.closeInventory();
					player.openInventory(Inventories.SettingsMenu2());
				}

				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.CloseInventory().clone().getItemMeta().getDisplayName())) {
					// Open next page
					player.closeInventory();
				}
				if (ci.getItemMeta().getDisplayName()
						.equals(ItemStacks.ReloadRandomPackge().clone().getItemMeta().getDisplayName())) {
					// Open next page
					player.closeInventory();
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "rp reload");
				}

				if (!ci.getType().equals(Material.WHITE_STAINED_GLASS_PANE)
						&& !ci.getType().equals(Material.BLUE_STAINED_GLASS_PANE)
						&& !ci.getType().equals(Material.LIGHT_BLUE_STAINED_GLASS)
						&& !ci.getType().equals(Material.LIME_STAINED_GLASS) && !ci.getType().equals(Material.BARRIER)
						&& !ci.getType().equals(Material.ARROW)) {
					String settingName = null;
					String ciName = Utils.Strip(ci.getItemMeta().getDisplayName().toLowerCase());
					if (ciName.equals("black scrolls") || ciName.equals("dusts") || ciName.equals("enchantment orbs")
							|| ciName.equals("fireballs") || ciName.equals("randomization scrolls")
							|| ciName.equals("rarity gems") || ciName.equals("soul trackers")) {
						settingName = "custom enchants." + ciName;
					} else {
						settingName = ciName + ".enabled";
					}
					Boolean setting = RandomPackage.getPlugin.getConfig().getBoolean(settingName);
					if (setting != null) {
						// Toggle the setting
						Boolean newSetting = !RandomPackage.getPlugin.getConfig().getBoolean(settingName);
						RandomPackage.getPlugin.getConfig().set(settingName, newSetting);
						player.closeInventory();
						player.sendMessage(Utils.ChatColor(
								"&7[&dRPConfigGUI&7] &bChanges will take effect after next server restart."));
						player.openInventory(Inventories.SettingsMenu3());
					}
				}
			}

		}
	}
}
