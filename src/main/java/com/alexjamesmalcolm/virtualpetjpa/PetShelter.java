package com.alexjamesmalcolm.virtualpetjpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.alexjamesmalcolm.virtualpetjpa.pet.Organic;
import com.alexjamesmalcolm.virtualpetjpa.pet.Pet;
import com.alexjamesmalcolm.virtualpetjpa.pet.Robotic;
import com.alexjamesmalcolm.virtualpetjpa.pet.Walkable;

public class PetShelter {

	private Collection<Pet> pets = new ArrayList<>();

	public void add(Pet pet) {
		pets.add(pet);
	}

	private Iterable<Pet> getPets() {
		return pets;
	}

	public void walk() {
		pets.forEach(pet -> {
			if (isWalkable(pet))
				((Walkable) pet).walk();
		});
	}

	private boolean isWalkable(Pet pet) {
		return Walkable.class.isAssignableFrom(pet.getClass());
	}

	public void oilRobots() {
		pets.forEach(pet -> {
			if (isRobotic(pet)) {
				Robotic robot = (Robotic) pet;
				robot.oil();
			}
		});
	}

	private boolean isRobotic(Pet pet) {
		return Robotic.class.isAssignableFrom(pet.getClass());
	}

	public void feed() {
		pets.forEach(pet -> {
			if (isOrganic(pet))
				((Organic) pet).feed();
		});
	}

	private boolean isOrganic(Pet pet) {
		return Organic.class.isAssignableFrom(pet.getClass());
	}

	public void water() {
		pets.forEach(pet -> {
			if (isOrganic(pet))
				((Organic) pet).water();
		});
	}

	public Pet findByName(String name) {
		List<Pet> pets = (List<Pet>) getPets();
		for (int i = 0; i < pets.size(); i++) {
			Pet pet = pets.get(i);
			if (pet.getName().equals(name))
				return pet;
		}
		return null;
	}

	public void play(String name) {
		findByName(name).play();
	}

}
