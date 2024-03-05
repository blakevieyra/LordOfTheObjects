package com.skilldistillery.entities;
public class MonsterTrophy extends Item {
	private String monsterType;
	private String bonusEffect;

	public MonsterTrophy(String name, String description, String monsterType, String bonusEffect) {
		super(name, description);
		this.monsterType = monsterType;
		this.bonusEffect = bonusEffect;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub

	}

	public String getMonsterType() {
		return monsterType;
	}

	public void setMonsterType(String monsterType) {
		this.monsterType = monsterType;
	}

	public String getBonusEffect() {
		return bonusEffect;
	}

	public void setBonusEffect(String bonusEffect) {
		this.bonusEffect = bonusEffect;
	}
	
	@Override
	public String toString() {
		return "Monster Trophy "
				+ "\n\t Name: " + name
				+ "\n\t Description: " + description
				+ "\n\t Monster Type: " + monsterType 
				+ "\n\t Bonus Effect: " + bonusEffect + "\n";
	}
}