package com.alexjamesmalcolm.virtualpetjpa;

import java.util.ArrayList;
import java.util.Collection;

public class PetShelter {

	private Collection<Pet> pets = new ArrayList<>();

	public void walk() {
		pets.forEach(pet -> {
			if (Walkable.class.isAssignableFrom(pet.getClass()))
				((Walkable) pet).walk();
		});
	}

	public void add(Pet pet) {
		pets.add(pet);
	}

	public void oilRobots() {
		pets.forEach(pet -> {
			if (Robotic.class.isAssignableFrom(pet.getClass())) {
				Robotic robot = (Robotic) pet;
				robot.oil();
			}
		});
	}

	public void feed() {
		pets.forEach(pet -> {
			if (Organic.class.isAssignableFrom(pet.getClass()))
				((Organic) pet).feed();
		});
	}

}
