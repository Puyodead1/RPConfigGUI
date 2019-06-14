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
package io.github.puyodead1.RPConfigGUI;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.randomhashtags.randompackage.RandomPackage;

public class ItemStacks {

	public static ItemStack WhiteSeperator() {
		ItemStack is = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
		ItemMeta im = is.getItemMeta();
		//ArrayList<String> il = new ArrayList<String>();
		
		im.setDisplayName(" ");
		
		//im.setLore(il);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack BlueSeperator() {
		ItemStack is = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
		ItemMeta im = is.getItemMeta();
		
		im.setDisplayName(" ");
		
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack NextPage() {
		ItemStack is = new ItemStack(Material.LIME_STAINED_GLASS);
		ItemMeta im = is.getItemMeta();
		
		im.setDisplayName(Utils.ChatColor("&bNext Page ->"));
		
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack PrevPage() {
		ItemStack is = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS);
		ItemMeta im = is.getItemMeta();
		
		im.setDisplayName(Utils.ChatColor("&b<- Previous Page"));
	
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CloseInventory() {
		ItemStack is = new ItemStack(Material.BARRIER);
		ItemMeta im = is.getItemMeta();
		
		im.setDisplayName(Utils.ChatColor("&c&lClose"));
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ReloadRandomPackge() {
		ItemStack is = new ItemStack(Material.ARROW);
		ItemMeta im = is.getItemMeta();
		
		im.setDisplayName(Utils.ChatColor("&b&lReload RandomPackage"));
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack BragSetting() {
		ItemStack is = new ItemStack(Material.MAP);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("chat cmds.brag.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&l&l[Brag]"));
		il.add(Utils.ChatColor("&7Toggle the brag"));
		il.add(Utils.ChatColor("&7feature in chat."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ItemSetting() {
		ItemStack is = new ItemStack(Material.MAP);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("chat cmds.item.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&l[Item]"));
		il.add(Utils.ChatColor("&7Toggle the item"));
		il.add(Utils.ChatColor("&7feature in chat."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack AlchemistSetting() {
		ItemStack is = new ItemStack(Material.BREWING_STAND);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("alchemist.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lAlchemist"));
		il.add(Utils.ChatColor("&7Toggle the Alchemist"));
		il.add(Utils.ChatColor("&7feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack AuctionHouseSetting() {
		ItemStack is = new ItemStack(Material.TRAPPED_CHEST);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("auction house.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lAuction House"));
		il.add(Utils.ChatColor("&7Toggle the Auction House"));
		il.add(Utils.ChatColor("&7feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack BalanceSetting() {
		ItemStack is = new ItemStack(Material.PAPER);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("balance.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lBalance"));
		il.add(Utils.ChatColor("&7Toggle the Balance command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack BlessSetting() {
		ItemStack is = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("bless.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lBless"));
		il.add(Utils.ChatColor("&7Toggle the Bless command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack BumpSetting() {
		ItemStack is = new ItemStack(Material.PISTON);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("bump.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lBump"));
		il.add(Utils.ChatColor("&7Toggle the Bump command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CoinFlipSetting() {
		ItemStack is = new ItemStack(Material.PLAYER_HEAD);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("coinflip.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCoinflip"));
		il.add(Utils.ChatColor("&7Toggle the Coinflip command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CombineSetting() {
		ItemStack is = new ItemStack(Material.GOLD_BLOCK);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("combine.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCombine"));
		il.add(Utils.ChatColor("&7Toggle the Combine command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ConfirmSetting() {
		ItemStack is = new ItemStack(Material.LIME_WOOL);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("confirm.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lConfirm"));
		il.add(Utils.ChatColor("&7Toggle the Confirm command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CollectionFilterSetting() {
		ItemStack is = new ItemStack(Material.HOPPER);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("collection filter.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCollection Filter"));
		il.add(Utils.ChatColor("&7Toggle the Collection Filter"));
		il.add(Utils.ChatColor("&7feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ConquestSetting() {
		ItemStack is = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("conquest.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lConquest"));
		il.add(Utils.ChatColor("&7Toggle the Conquest"));
		il.add(Utils.ChatColor("&7feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CustomArmorSetting() {
		ItemStack is = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom armor.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCustom Armor"));
		il.add(Utils.ChatColor("&7Toggle Custom Armor."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im.addEnchant(Enchantment.DURABILITY, 1, true);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CustomBossesSetting() {
		ItemStack is = new ItemStack(Material.SLIME_SPAWN_EGG);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom bosses.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCustom Bosses"));
		il.add(Utils.ChatColor("&7Toggle Custom Bosses."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CustomEnchantsSetting() {
		ItemStack is = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCustom Enchants"));
		il.add(Utils.ChatColor("&7Toggle Custom Enchants."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack BlackScrollsSetting() {
		ItemStack is = new ItemStack(Material.INK_SAC);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.black scrolls");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lBlack Scrolls"));
		il.add(Utils.ChatColor("&7Toggle Black Scrolls."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack DustsSetting() {
		ItemStack is = new ItemStack(Material.SUGAR);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.dusts");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lDusts"));
		il.add(Utils.ChatColor("&7Toggle Custom Enchant Dusts."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack EnchantOrbsSetting() {
		ItemStack is = new ItemStack(Material.ENDER_EYE);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.enchantment orbs");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lEnchantment Orbs"));
		il.add(Utils.ChatColor("&7Toggle Enchantment Orbs."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack FireballSettings() {
		ItemStack is = new ItemStack(Material.FIRE_CHARGE);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.fireballs");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lFireballs"));
		il.add(Utils.ChatColor("&7Toggle Custom Enchant Fireballs"));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack RandomizationScrollsSetting() {
		ItemStack is = new ItemStack(Material.PAPER);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.randomization scrolls");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lRandomization Scrolls"));
		il.add(Utils.ChatColor("&7Toggle Randomization Scrolls."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack RarityGemsSetting() {
		ItemStack is = new ItemStack(Material.FIRE_CHARGE);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.rarity gems");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lRarity Gems"));
		il.add(Utils.ChatColor("&7Toggle Rarity Gems."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack SoulTrackersSetting() {
		ItemStack is = new ItemStack(Material.PAPER);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom enchants.soul trackers");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lSoul Trackers"));
		il.add(Utils.ChatColor("&7Toggle Soul Trackers."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CustomCreepersSetting() {
		ItemStack is = new ItemStack(Material.CREEPER_SPAWN_EGG);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom creepers.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCustom Creepers"));
		il.add(Utils.ChatColor("&7Toggle Custom Creepers Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack CustomTNTSetting() {
		ItemStack is = new ItemStack(Material.TNT);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("custom tnt.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lCustom TNT"));
		il.add(Utils.ChatColor("&7Toggle Custom TNT Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack DuelsSetting() {
		ItemStack is = new ItemStack(Material.BOW);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("duels.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lDuels"));
		il.add(Utils.ChatColor("&7Toggle Duels Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack DungeonsSetting() {
		ItemStack is = new ItemStack(Material.MOSSY_STONE_BRICKS);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("dungeons.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lDungeons"));
		il.add(Utils.ChatColor("&7Toggle Dungeons Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack EnchantsSetting() {
		ItemStack is = new ItemStack(Material.BOOK);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("enchants.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lEnchant Guide"));
		il.add(Utils.ChatColor("&7Toggle Enchant Guide Command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack EnchanterSetting() {
		ItemStack is = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("enchanter.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lEnchanter"));
		il.add(Utils.ChatColor("&7Toggle the Enchanter Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack EnvoySetting() {
		ItemStack is = new ItemStack(Material.CHEST);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("envoy.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lEnvoy"));
		il.add(Utils.ChatColor("&7Toggle the Envoy Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack FactionAdditionsSetting() {
		ItemStack is = new ItemStack(Material.NETHER_STAR);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("faction additions.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lFaction Additions"));
		il.add(Utils.ChatColor("&7Toggle Faction Additions Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack FundSettings() {
		ItemStack is = new ItemStack(Material.CAULDRON);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("fund.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lFund"));
		il.add(Utils.ChatColor("&7Toggle the Fund Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack GKitsSetting() {
		ItemStack is = new ItemStack(Material.DIAMOND);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("gkits.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lGkits"));
		il.add(Utils.ChatColor("&7Toggle the Gkits Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack GlobalChallengesSetting() {
		ItemStack is = new ItemStack(Material.IRON_BARS);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("global challenges.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lGlobal Challenges"));
		il.add(Utils.ChatColor("&7Toggle Global Challenges Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack HomeSetting() {
		ItemStack is = new ItemStack(Material.RED_BED);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("home.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lHome"));
		il.add(Utils.ChatColor("&7Toggle the Home Command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ItemFilterSetting() {
		ItemStack is = new ItemStack(Material.STICK);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("item filter.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lItem Filter"));
		il.add(Utils.ChatColor("&7Toggle the Item Filter Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack JackpotSettings() {
		ItemStack is = new ItemStack(Material.CAULDRON);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("jackpot.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lJackpot"));
		il.add(Utils.ChatColor("&7Toggle the Jackpot Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack KOTHSetting() {
		ItemStack is = new ItemStack(Material.EMERALD);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("kingofthehill.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lKOTH"));
		il.add(Utils.ChatColor("&7Toggle the KOTH Feature."));
		il.add(Utils.ChatColor("&7(King of the Hill)"));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack LootboxesSetting() {
		ItemStack is = new ItemStack(Material.BEACON);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("lootboxes.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lLootboxes"));
		il.add(Utils.ChatColor("&7Toggle the Lootboxes Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack MasksSetting() {
		ItemStack is = new ItemStack(Material.CREEPER_HEAD);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("masks.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lMasks"));
		il.add(Utils.ChatColor("&7Toggle the Masks Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack MKitsSetting() {
		ItemStack is = new ItemStack(Material.DIAMOND);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("mkits.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lMkits"));
		il.add(Utils.ChatColor("&7Toggle the Mkits Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack MobStackerSetting() {
		ItemStack is = new ItemStack(Material.BLAZE_SPAWN_EGG);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("mob stacker.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lMob Stacker"));
		il.add(Utils.ChatColor("&7Toggle the Mob Stacker Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack MonthlyCratesSetting() {
		ItemStack is = new ItemStack(Material.ENDER_CHEST);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("monthly crates.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lMonthly Crates"));
		il.add(Utils.ChatColor("&7Toggle Monthly Crates."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack WildPVPSetting() {
		ItemStack is = new ItemStack(Material.GOLDEN_SWORD);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("wild pvp.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lWild PVP"));
		il.add(Utils.ChatColor("&7Toggle the Wild PVP Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack RollSetting() {
		ItemStack is = new ItemStack(Material.SLIME_BALL);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("roll.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lRoll"));
		il.add(Utils.ChatColor("&7Toggle the Roll Command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ServerCratesSetting() {
		ItemStack is = new ItemStack(Material.CHEST);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("server crates.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lServer Crates"));
		il.add(Utils.ChatColor("&7Toggle the Server Crates Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ShopSetting() {
		ItemStack is = new ItemStack(Material.VILLAGER_SPAWN_EGG);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("shop.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lShop"));
		il.add(Utils.ChatColor("&7Toggle the Shop Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack ShowcaseSetting() {
		ItemStack is = new ItemStack(Material.GLASS);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("showcase.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lShowcase"));
		il.add(Utils.ChatColor("&7Toggle the Showcase Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack TinkererSettings() {
		ItemStack is = new ItemStack(Material.ANVIL);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("tinkerer.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lTinkerer"));
		il.add(Utils.ChatColor("&7Toggle the Tinkerer Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack TitleSetting() {
		ItemStack is = new ItemStack(Material.PAPER);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("title.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lTitle"));
		il.add(Utils.ChatColor("&7Toggle the Titles Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack TradeSetting() {
		ItemStack is = new ItemStack(Material.VILLAGER_SPAWN_EGG);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("trade.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lTrade"));
		il.add(Utils.ChatColor("&7Toggle the Trade Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack TrinketsSetting() {
		ItemStack is = new ItemStack(Material.NETHER_STAR);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("trinkets.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lTrinkets"));
		il.add(Utils.ChatColor("&7Toggle the Trinkets Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack VKitsSetting() {
		ItemStack is = new ItemStack(Material.DIAMOND);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("vkits.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lVkits"));
		il.add(Utils.ChatColor("&7Toggle the Vkits Feature."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack WithdrawSetting() {
		ItemStack is = new ItemStack(Material.PAPER);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("withdraw.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lWithdraw"));
		il.add(Utils.ChatColor("&7Toggle the Withdraw Command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
	
	public static ItemStack XPBottleSetting() {
		ItemStack is = new ItemStack(Material.EXPERIENCE_BOTTLE);
		ItemMeta im = is.getItemMeta();
		ArrayList<String> il = new ArrayList<String>();
		Boolean currentSetting = RandomPackage.getPlugin.getConfig().getBoolean("xpbottle.enabled");
		String currentSettingString;
		if (currentSetting) {
			currentSettingString = "&a&l&nTrue";
		} else {
			currentSettingString = "&c&l&nFalse";
		}
		
		
		im.setDisplayName(Utils.ChatColor("&6&lXPBottle"));
		il.add(Utils.ChatColor("&7Toggle the XPBottle Command."));
		il.add(Utils.ChatColor("&bEnabled: " + currentSettingString));
		il.add(Utils.ChatColor("&eClick to toggle"));
		
		im.setLore(il);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is.setItemMeta(im);
		
		return is;
	}
}
