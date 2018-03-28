package com.alexjamesmalcolm.virtualpetjpa;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.alexjamesmalcolm.virtualpetjpa.pet.Pet;

public class PetControllerTest {
	
	@InjectMocks
	PetController underTest;
	
	@Mock
	PetRepository petRepo;
	
	@Mock
	Pet pet;
	
	@Mock
	Model model;
	
	@Mock
	PetShelter shelter;
	
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
	
	@Test
	public void shouldAddPetsToModel() {
		Set<Pet> singleton = Collections.singleton(pet);
		when(petRepo.findAll()).thenReturn(singleton);
		
		underTest.addPetsToModel(model);
		
		verify(model).addAttribute("pets", singleton);
	}
	
	@Test
	public void shouldCallWaterOnShelter() {
		underTest.waterPets();
		verify(shelter).water();
	}
	
	@Test
	public void shouldCallWalkOnShelter() {
		underTest.walkPets();
		verify(shelter).walk();
	}
	
	@Test
	public void shouldCallOilRobots() {
		underTest.oilRoboticPets();
		verify(shelter).oilRobots();
	}
	
	@Test
	public void shouldCallPlay() {
		String name = "Joey";
		underTest.playWithPet(name);
		verify(shelter).play(name);
	}
	
	@Test
	public void shouldCallFeed() {
		underTest.feedPets();
		verify(shelter).feed();
	}
}
