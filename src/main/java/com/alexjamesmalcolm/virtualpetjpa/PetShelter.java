package com.alexjamesmalcolm.virtualpetjpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

	public void water() {
		pets.forEach(pet -> {
			if (Organic.class.isAssignableFrom(pet.getClass()))
				((Organic) pet).water();
		});
	}

	public Pet findByName(String name) {
		List<Pet> pets = (List<Pet>) getPets();
		for (int i = 0; i < pets.size(); i++) {
			Pet pet = pets.get(i);
			System.out.println(pet);
			if (pet.getName().equals(name))
				return pet;
		}
		return null;
	}

	private Iterable<Pet> getPets() {
		return pets;
	}

	public void play(String name) {
		findByName(name).play();
	}

}
