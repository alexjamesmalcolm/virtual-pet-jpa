package com.alexjamesmalcolm.virtualpetjpa;

public class PetShelter {

	private Pet pet;

	public void walk() {
		((Walkable) pet).walk();
	}

	public void add(Pet pet) {
		this.pet = pet;
	}

}
