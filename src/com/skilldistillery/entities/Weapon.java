package com.skilldistillery.entities;
public abstract class Weapon extends Item {
	private int attackPower;

	public Weapon(String name, String description, int attackPower) {
		super(name, description);
		this.attackPower = attackPower;
	}

	public void attack() {
		// attack logic
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub

	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public String toString() {
		return "\nWeapon"
				+ "\n\t Name: " + name
				+ "\n\t Description: " + description
				+ "\n\t attackPower: " + attackPower + "\n";
	}
	
}