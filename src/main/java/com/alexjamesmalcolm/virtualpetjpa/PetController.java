package com.alexjamesmalcolm.virtualpetjpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;

import com.alexjamesmalcolm.virtualpetjpa.pet.Pet;

public class PetController {
	
	private CrudRepository<Pet, Long> petRepo;
	
	private PetShelter shelter;

	public Iterable<Pet> getPets() {
		return petRepo.findAll();
	}

	public void addPetsToModel(Model model) {
		Iterable<Pet> pets = petRepo.findAll();
		model.addAttribute("pets", pets);
	}

	public void waterPets() {
		shelter.water();
	}

	public void walkPets() {
		shelter.walk();
	}

	public void oilRoboticPets() {
		shelter.oilRobots();
	}

	public void playWithPet(String name) {
		shelter.play(name);
	}

	public void feedPets() {
		shelter.feed();
	}

}
