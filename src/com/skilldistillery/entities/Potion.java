package com.skilldistillery.entities;
public class Potion extends Item {
	private String effectType;
	private int potency;
	private int duration;

	public Potion(String name, String description, String effectType, int potency, int duration) {
		super(name, description);
		this.effectType = effectType;
		this.potency = potency;
		this.duration = duration;
	}

	@Override
	public void use() {
		// potion logic
	}

	public String getEffectType() {
		return effectType;
	}

	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public int getPotency() {
		return potency;
	}

	public void setPotency(int potency) {
		this.potency = potency;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "\nPotion"
				+ "\n\t Name: " + name
				+ "\n\t Description: " + description
				+ "\n\t Effect Type: " + effectType 
				+ "\n\t Potency: " + potency 
				+ "\n\t Duration: " + duration + "\n";
	}


	
}