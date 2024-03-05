package com.skilldistillery.entities;
public abstract class Item {
	protected String name;
	protected String description;

	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public abstract void use();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "\nItem"
				+ "\n\t Name: " + name
				+ "\n\t Description: " + description + "\n";
	}
}