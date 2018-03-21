package com.alexjamesmalcolm.virtualpetjpa;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PetShelterTest {
	
	@InjectMocks
	private PetShelter underTest;
	
	@Mock(extraInterfaces = Walkable.class)
	private Pet walkable;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		underTest.add(walkable);
	}
	
	@Test
	public void shouldWalkDogs() {
		underTest.walk();
		Mockito.verify((Walkable) walkable).walk();
	}
}
