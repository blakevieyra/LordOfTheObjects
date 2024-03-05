package com.skilldistillery.entities;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Witcher extends Character {

	int spellpoints;
	int attackPower;
	private Inventory inventory;
	Sword wolfBane = new Sword("Wolf's Bane", "Issued sword from the academy", 5, "Steel Sword");
	Sword viperFang = new Sword("Viper's Fang", "Issued sword from the academy", 5, "Silver Sword");
	Potion healthPotion = new Potion("Health Potion", "Heals the Character", "+5 hitpoints", 5, 1);
	Potion spellPotion = new Potion("Spell Potion", "Refills the the Character's Spell Power", "+5 spell power", 5, 1);

	public Witcher() {
		hitpoints = 20;
		spellpoints = 6;
		defence = 0;
		attackPower = 2;
		inventory = new Inventory();
		inventory.addItem(wolfBane);
		inventory.addItem(viperFang);
		inventory.addItem(healthPotion);
		inventory.addItem(spellPotion);
	}

	@Override
	public void heal() {

		if (spellpoints >= 3) {
			if (hitpoints >= 12) {
				hitpoints = 15;
				System.out.println("You healed, your hitpoints are at: " + hitpoints);
			} else {
				hitpoints += 7;
				System.out.println("You healed, your hitpoints are at: " + hitpoints);
			}
			spellpoints -= 3;
			System.out.println("Your spellpoints are at: " + spellpoints);
		} else {
			System.out.println("You're out of spellpoints!");
		}
	}

	public void action(Scanner keyboard, Character enemy) {
		int choice = 0;
		System.out.println(
				"What would you like to do? '1' for sword attack, '2' for casting spells, '3' to use health potion");
		choice = keyboard.nextInt();
		if (choice == 1) {
			enemy.takeDamage(attack(keyboard));
		} else if (choice == 2) {
			enemy.takeDamage(castSpell(keyboard));
		} else if (choice == 3) {
			useHealthPotion();
		}
	}

	public void useHealthPotion() {
		if (inventory.getItemCount(healthPotion) <= 0) {
			System.out.println("You're out of health potions!");
		} else if (inventory.getItemCount(healthPotion) > 0) {
			inventory.useItem(healthPotion);
			if (hitpoints >= 10) {
				hitpoints = 15;
				System.out.println("Current hit points:" + hitpoints);
			} else {
				hitpoints += healthPotion.getPotency();
				System.out.println("Current hit points:" + hitpoints);

			}
		}
	}

	public void useSpellpotions() {
		if (inventory.getItemCount(spellPotion) <= 0) {
			System.out.println("Your out of spell potions!");
		} else if (inventory.getItemCount(spellPotion) > 0) {
			inventory.useItem(spellPotion);
			if (spellpoints >= 6)
				spellpoints = 10;
			System.out.println("Current spell points:" + spellpoints);
		} else {
			spellpoints += spellPotion.getPotency();
			System.out.println("Current spell points:" + spellpoints);
		}
	}

	public void increaseArmor(int value) {
		defence += value;
	}

	public String attack(Scanner keyboard) {
		int choice = 0;
		String strike = "";
		System.out.println("Which sword stike would you like? '1' for steel, '2' for silver.");
		choice = keyboard.nextInt();
		if (choice == 1)
			strike = wolfBane.getSwordType() + " Strike";
		else if (choice == 2) {
			strike = viperFang.getSwordType() + " Strike";
		}
		return strike;
	}

	public String castSpell(Scanner keyboard) {
		int choice = 0;
		String strike = "";
		System.out.println("Which spell would you like? '1' for Heal, '2' for Igni, or '3' for push?");
		choice = keyboard.nextInt();
		if (choice == 1) {
			heal();
			strike = "Heal";
		} else if (choice == 2) {
			strike = "Igni";
			spellpoints -= 3;
		} else if (choice == 3) {
			strike = "Aard";
			spellpoints -= 3;
		}
		return strike;
	}

	public int playDice() {
		// There are 5 dice that all range from 1 - 6
		Random rand = new Random();
		return rand.nextInt(26) + 5;
	}

	// Get all items in inventory
	public Map<Item, Integer> getItems() {
		return inventory.getItems();
	}

	// add item to inventory
	public void addItem(Item item) {
		inventory.addItem(item);
	}
	
	public void rest() {
		hitpoints = 15;
		spellpoints = 6;
		System.out.println("Cataline meditates and regenerates her health and spell points.");
	}
	
	public void giveHealthPotion() {
		inventory.useItem(healthPotion);
	}

}
