package com.skilldistillery.entities;
public class Armor extends Item {
	private int defensePower;

	public Armor(String name, String description, int defensePower) {
		super(name, description);
		this.defensePower = defensePower;
	}

	public void protect() {
		//protection logic
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub

	}

	public int getDefensePower() {
		return defensePower;
	}

	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}

	@Override
	public String toString() {
		return "Armor" 
				+ "\n\t Name: " + name
				+ "\n\t Description: " + description
				+"\n\t Defense Power: " + defensePower + "\n";
	}
	
}