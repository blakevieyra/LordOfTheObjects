package com.skilldistillery.entities;

public abstract class Monster extends Character {
	protected String type;
	public boolean canHeal = true;
	
	public Monster(String type) {
		super();
		this.type = type;
	}

	public abstract void attack(Character target);

	protected void bite(Character target) {
		System.out.println(type + " bites!");

		target.takeDamage("Bite");
	}

	protected void charge(Character target) {
		System.out.println(type + " charges!");
		
		target.takeDamageIgnoreDefense("Charge");
	}

	public void heal() {
		hitpoints += 3;
		
		canHeal = false;
	}

}