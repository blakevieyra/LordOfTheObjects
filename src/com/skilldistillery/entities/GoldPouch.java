package com.skilldistillery.entities;
public class GoldPouch extends Item {
	private int amount;

	public GoldPouch(String name, String description, int amount) {
		super(name, description);
		this.amount = amount;
	}

	public void addGold(int gold) {
		this.amount += gold;
	}

	public void removeGold(int gold) {
		this.amount -= gold;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\nGold Pouch" 
				+ "\n\t Amount of Gold: " + amount + " gold coins \n";
	}
	
}