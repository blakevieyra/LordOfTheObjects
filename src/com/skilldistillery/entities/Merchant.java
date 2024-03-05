package com.skilldistillery.entities;

import java.util.Scanner;

public class Merchant extends Character {

	public void interact(Scanner keyboard, Witcher witcher) {
		System.out.println("Merchant: Witcher, over here! I have some wares you're sure to love!");
		System.out.println("Merchant: I have this full leather jacket accented with steel plates"
				+ " over vulnerable areas for superb protection in combat");
		System.out.println("This armor will give you +2 defence and costs 75 gold.");
		System.out.println("Merchant: Or theres my selection of potions and weapon oils!"
				+ " Made from only the finest alchemists in the land!");
		System.out.println("You see an assortment of health potions and weapon oils designed for killing obscure monsters.");
		System.out.println("The health potions will give you +5 hitpoints and cost 30 gold each.");
		System.out.println("There is one weapon oil that catches your eye by glinting brightly in the sunlight.");
		System.out.println("You pick it up and inspect it. The merchant jitters out of glee.");
		System.out.println("Merchant: That is the finest weapon oil in all of the continent!"
				+ " It allows the wielder to actually strike ethereal beings with their sword! Heehee!");
		System.out.println("The merchant informs you the weapon oil costs 35 gold.");
		System.out.println("Hint: Reply with 'yes' or 'no'");
		String response = keyboard.nextLine();
	}

	@Override
	public void heal() {
		// Do nothing. Commoner won't fight or heal.
	}

}
