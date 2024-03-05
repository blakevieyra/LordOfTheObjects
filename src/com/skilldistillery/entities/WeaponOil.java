package com.skilldistillery.entities;
public class WeaponOil extends Item {
    private String effectType;
    private int duration;

    public WeaponOil(String name, String description, String effectType, int duration) {
        super(name, description);
        this.effectType = effectType;
        this.duration = duration;
    }

    @Override
    public void use() {
        //oil application logic
    }

	public String getEffectType() {
		return effectType;
	}

	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "\nWeapon Oil"
				+ "\n\t Name: " + name
				+ "\n\t Description: " + description
				+ "\n\t Effect Type: " + effectType 
				+ "\n\t Duration: " + duration + " seconds \n";
	}
	
}