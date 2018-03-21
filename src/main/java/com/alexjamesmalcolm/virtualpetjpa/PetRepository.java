package com.alexjamesmalcolm.virtualpetjpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
	List<Pet> findByName(String name);
}
