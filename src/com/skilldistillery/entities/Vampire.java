package com.skilldistillery.entities;

import java.util.Random;

public class Vampire extends Monster {
	int gold = 15;

	public Vampire(String type) {
		super("Vampire");
		hitpoints = 15;
	}

	@Override
	public void attack(Character target) {
		Random random = new Random();
		int randomAttack;

		if (canHeal && hitpoints < 15)
			randomAttack = random.nextInt(3);
		else {
			randomAttack = random.nextInt(2);
		}

		switch (randomAttack) {
		case 0:
			bite(target);
			break;
		case 1:
			charge(target);
			break;
		case 2:
			heal();
			break;
		default:
			break;
		}

		canHeal = true;
	}

	public void heal() {
		hitpoints += 3;

		canHeal = false;

		System.out.println("The Vampire drinks a suspicious red vial and heals for " + "3" + " hitpoints.");
	}
}