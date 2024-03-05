package com.skilldistillery.entities;

import java.util.HashMap;
import java.util.Map;

public abstract class Character {
	protected int hitpoints;
	protected int defence;
	protected Map<String, Integer> damage;

	public Character() {
		damage = new HashMap<>();
		damage.put("Steel Sword Strike", 2);
		damage.put("Silver Sword Strike", 5);
		damage.put("Igni", 6); // Ignores defence & some sort of cooldown
		damage.put("Aard", 6);
		damage.put("Bite", 4);
		damage.put("Charge", 3); // Ignores defence
		damage.put("Deafening Scream", 6);
		damage.put("Heal", 0);

	}

	public void takeDamage(String weapon) {
		hitpoints -= defence + damage.get(weapon);
		if (!weapon.equals("Heal")) {
			System.out.println(this.getClass().getSimpleName() + " was hit for " + damage.get(weapon));
		}
	}

	public void takeDamageIgnoreDefense(String weapon) {
		hitpoints -= damage.get(weapon);
		System.out.println(this.getClass().getSimpleName() + " was hit for " + damage.get(weapon) + " ignoring all defences.");
	}

	public abstract void heal();
	
	public boolean isAlive() {
		return hitpoints > 0;
	}

}