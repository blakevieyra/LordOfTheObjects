package com.skilldistillery.entities;

import java.util.Random;

public class Werewolf extends Monster {
	protected int gold = 10;

	public Werewolf(String type) {
		super(type);
		hitpoints = 12;
	}

	@Override
	public void attack(Character target) {
		Random random = new Random();
		int randomAttack;

		if (canHeal && hitpoints < 12)
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

		System.out.println("Werewolf eats nearby carcass and heals for " + "3" + " hitpoints.");
	}
}