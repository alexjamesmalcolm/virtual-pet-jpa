package com.alexjamesmalcolm.virtualpetjpa;

import java.util.Collections;

public class PetController {

	public Iterable<Pet> getPets() {
		Pet pet = new OrganicDog("","");
		return Collections.singleton(pet);
	}

}
