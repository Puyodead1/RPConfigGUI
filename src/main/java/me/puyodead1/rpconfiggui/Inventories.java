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
import org.bukkit.inventory.Inventory;

public class Inventories {

	public static Inventory SettingsMenu1() {
		Inventory inv = Bukkit.createInventory(null, 45, "RandomPackage Settings - 1");
		
		/**
		 * White border with blue center
		 */
		for(int i = 0; i < 45; i++) {
			inv.setItem(i, ItemStacks.WhiteSeperator());
		}
		for(int i = 10; i < 17; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		for(int i = 19; i < 26; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		for(int i = 28; i < 35; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		/**/
		
		inv.setItem(10, ItemStacks.BragSetting());
		inv.setItem(11, ItemStacks.ItemSetting());
		inv.setItem(12, ItemStacks.AlchemistSetting());
		inv.setItem(13, ItemStacks.AuctionHouseSetting());
		inv.setItem(14, ItemStacks.BalanceSetting());
		inv.setItem(15, ItemStacks.BlessSetting());
		inv.setItem(16, ItemStacks.BumpSetting());
		inv.setItem(19, ItemStacks.CoinFlipSetting());
		inv.setItem(20, ItemStacks.CombineSetting());
		inv.setItem(21, ItemStacks.ConfirmSetting());
		inv.setItem(22, ItemStacks.CollectionFilterSetting());
		inv.setItem(23, ItemStacks.ConquestSetting());
		inv.setItem(24, ItemStacks.CustomArmorSetting());
		inv.setItem(25, ItemStacks.CustomBossesSetting());
		inv.setItem(28, ItemStacks.CustomEnchantsSetting());
		inv.setItem(29, ItemStacks.BlackScrollsSetting());
		inv.setItem(30, ItemStacks.DustsSetting());
		inv.setItem(31, ItemStacks.EnchantOrbsSetting());
		inv.setItem(32, ItemStacks.FireballSettings());
		inv.setItem(33, ItemStacks.RandomizationScrollsSetting());
		inv.setItem(34, ItemStacks.RarityGemsSetting());
		
		//inv.setItem(36, ItemStacks.ReloadRandomPackge());
		inv.setItem(38, ItemStacks.PrevPage());
		inv.setItem(40, ItemStacks.CloseInventory());
		inv.setItem(42, ItemStacks.NextPage());
		
		return inv;
	}
	
	public static Inventory SettingsMenu2() {
		Inventory inv = Bukkit.createInventory(null, 45, "RandomPackage Settings - 2");
		
		/**
		 * White border with blue center
		 */
		for(int i = 0; i < 45; i++) {
			inv.setItem(i, ItemStacks.WhiteSeperator());
		}
		for(int i = 10; i < 17; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		for(int i = 19; i < 26; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		for(int i = 28; i < 35; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		/**/
		
		inv.setItem(10, ItemStacks.SoulTrackersSetting());
		inv.setItem(11, ItemStacks.CustomCreepersSetting());
		inv.setItem(12, ItemStacks.CustomTNTSetting());
		inv.setItem(13, ItemStacks.DuelsSetting());
		inv.setItem(14, ItemStacks.DungeonsSetting());
		inv.setItem(15, ItemStacks.EnchantsSetting());
		inv.setItem(16, ItemStacks.EnchanterSetting());
		inv.setItem(19, ItemStacks.EnvoySetting());
		inv.setItem(20, ItemStacks.FactionAdditionsSetting());
		inv.setItem(21, ItemStacks.FundSettings());
		inv.setItem(22, ItemStacks.GKitsSetting());
		inv.setItem(23, ItemStacks.GlobalChallengesSetting());
		inv.setItem(24, ItemStacks.HomeSetting());
		inv.setItem(25, ItemStacks.ItemFilterSetting());
		inv.setItem(28, ItemStacks.JackpotSettings());
		inv.setItem(29, ItemStacks.KOTHSetting());
		inv.setItem(30, ItemStacks.LootboxesSetting());
		inv.setItem(31, ItemStacks.MasksSetting());
		inv.setItem(32, ItemStacks.MKitsSetting());
		inv.setItem(33, ItemStacks.MobStackerSetting());
		inv.setItem(34, ItemStacks.MonthlyCratesSetting());
		
		//inv.setItem(36, ItemStacks.ReloadRandomPackge());
		inv.setItem(38, ItemStacks.PrevPage());
		inv.setItem(40, ItemStacks.CloseInventory());
		inv.setItem(42, ItemStacks.NextPage());
		
		return inv;
	}
	
	public static Inventory SettingsMenu3() {
		Inventory inv = Bukkit.createInventory(null, 45, "RandomPackage Settings - 3");
		
		/**
		 * White border with blue center
		 */
		for(int i = 0; i < 45; i++) {
			inv.setItem(i, ItemStacks.WhiteSeperator());
		}
		for(int i = 10; i < 17; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		for(int i = 19; i < 26; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		for(int i = 28; i < 35; i++) {
			inv.setItem(i, ItemStacks.BlueSeperator());
		}
		/**/
		
		inv.setItem(10, ItemStacks.WildPVPSetting());
		inv.setItem(11, ItemStacks.RollSetting());
		inv.setItem(12, ItemStacks.ServerCratesSetting());
		inv.setItem(13, ItemStacks.ShopSetting());
		inv.setItem(14, ItemStacks.ShowcaseSetting());
		inv.setItem(15, ItemStacks.TinkererSettings());
		inv.setItem(16, ItemStacks.TitleSetting());
		inv.setItem(19, ItemStacks.TradeSetting());
		inv.setItem(20, ItemStacks.TrinketsSetting());
		inv.setItem(21, ItemStacks.VKitsSetting());
		inv.setItem(22, ItemStacks.WithdrawSetting());
		inv.setItem(23, ItemStacks.XPBottleSetting());
		
		//inv.setItem(36, ItemStacks.ReloadRandomPackge());
		inv.setItem(38, ItemStacks.PrevPage());
		inv.setItem(40, ItemStacks.CloseInventory());
		inv.setItem(42, ItemStacks.NextPage());
		
		return inv;
	}
}
