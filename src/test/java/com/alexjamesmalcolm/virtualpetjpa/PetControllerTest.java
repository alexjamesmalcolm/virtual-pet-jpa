package com.alexjamesmalcolm.virtualpetjpa;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;

public class PetControllerTest {
	
	@InjectMocks
	PetController underTest;
	
	@Mock
	CrudRepository<Pet, Long> petRepo;
	
	@Mock
	Pet pet;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldGetPets() {
		when(petRepo.findAll()).thenReturn(Collections.singleton(pet));
		
		Iterable<Pet> result = underTest.getPets();
		
		assertThat(result, contains(any(Pet.class)));
	}
	
	@Test
	public void shouldGetPetsFromDb() {
		when(petRepo.findAll()).thenReturn(Collections.singleton(pet));
		
		Iterable<Pet> result = underTest.getPets();
		
		assertThat(result, contains(pet));
	}
}
