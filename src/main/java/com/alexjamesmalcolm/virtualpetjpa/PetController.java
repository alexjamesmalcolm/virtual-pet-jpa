package com.alexjamesmalcolm.virtualpetjpa;

import org.springframework.data.repository.CrudRepository;

public class PetController {
	
	private CrudRepository<Pet, Long> petRepo;

	public Iterable<Pet> getPets() {
		return petRepo.findAll();
	}

}
