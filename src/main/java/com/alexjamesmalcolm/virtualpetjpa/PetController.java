package com.alexjamesmalcolm.virtualpetjpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;

import com.alexjamesmalcolm.virtualpetjpa.pet.Pet;

public class PetController {
	
	private CrudRepository<Pet, Long> petRepo;

	public Iterable<Pet> getPets() {
		return petRepo.findAll();
	}

	public void addPetsToModel(Model model) {
		Iterable<Pet> pets = petRepo.findAll();
		model.addAttribute("pets", pets);
	}

}
