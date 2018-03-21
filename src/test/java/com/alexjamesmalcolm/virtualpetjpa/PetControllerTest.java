package com.alexjamesmalcolm.virtualpetjpa;

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
		
	}
}
