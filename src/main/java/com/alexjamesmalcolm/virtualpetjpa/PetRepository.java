package com.alexjamesmalcolm.virtualpetjpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alexjamesmalcolm.virtualpetjpa.pet.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
	List<Pet> findByName(String name);
}
