package com.skilldistillery.entities;

import java.util.Random;

public class Banshee extends Monster {
	int gold = 25;

	public Banshee(String type) {
		super("Banshee");
		hitpoints = 17;
	}

	@Override
	public void attack(Character target) {
		Random random = new Random();
		int randomAttack;

		if (canHeal && hitpoints < 20) {
			randomAttack = random.nextInt(4);
		} else {
			randomAttack = random.nextInt(3);
		}

		switch (randomAttack) {
		case 0:
			bite(target);
			break;
		case 1:
			charge(target);
			break;
		case 2:
			deafeningScream(target);
			break;
		case 3:
			heal();
			break;
		default:
			break;
		}

		canHeal = true;
	}
	
	private void deafeningScream(Character target) {
		System.out.println(type + " lets out a deafening scream!");

		target.takeDamageIgnoreDefense("Deafening Scream");

	}

	@Override
	public void heal() {
		hitpoints += 3;

		canHeal = false;

		System.out.println("The Banshee casts a spell and heals for  " + "3" + " hitpoints.");
	}
}