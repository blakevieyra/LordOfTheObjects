package com.skilldistillery.entities;
public class Sword extends Weapon {

	private String swordType; 

	public Sword(String name, String description, int attackPower, String swordType) {
		super(name, description, attackPower);
		this.swordType = swordType;
	}

	@Override
	public void attack() {
		//sword attack logic
	}

	public String getSwordType() {
		return swordType;
	}

	public void setSwordType(String swordType) {
		this.swordType = swordType;
	}

	@Override
	public String toString() {
		return "\nSword"
				+ "\n\t Sword Type: " + swordType
				+ "\n\t Name: " + name
				+ "\n\t Description: " + description 
				+ "\n\t Attack Power: " + getAttackPower() + "\n";
	}


	
}