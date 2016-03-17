package items.controller;

import java.util.ArrayList;

import items.model.Armor;
import items.model.Consumable;
import items.model.Item;
import items.model.Weapon;
import items.model.resources.ArmorType;
import items.model.resources.FoodType;
import items.model.resources.Quality;
import items.model.resources.WeaponType;

public class ItemCreator {

	private ArrayList<Item> allItemsInGame;

	public ItemCreator() {
		allItemsInGame = new ArrayList<>();
	}
	
	private Item newItem(Item item) {
		allItemsInGame.add(item);
		return item;
	}

	public Item createWeapon(int level, Quality quality, WeaponType type) {
		Weapon weapon = new Weapon(level, quality, type);
		return newItem(weapon);
	}

	public Item createArmor(int level, Quality quality, ArmorType type) {
		Armor armor = new Armor(level, quality, type);
		return newItem(armor);
	}

	public Item createFood(int level, Quality quality, FoodType type) {
		Consumable consumable = new Consumable(level, quality, type);
		return newItem(consumable);
	}

	public Item newRandom() {
		return null;
	}

	public Item newRandomWeapon() {
		return null;
	}

	public Item newRandomArmor() {
		return null;
	}

	public Item newRandomFood() {
		return null;
	}

	public ArrayList<Item> getAllItemsInGame() {
		return allItemsInGame;
	}

}
