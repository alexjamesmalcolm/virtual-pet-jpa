package com.alexjamesmalcolm.virtualpetjpa;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PetShelterTest {
	
	@InjectMocks
	private PetShelter underTest;
	
	@Mock(extraInterfaces = Walkable.class)
	private Pet walkable;
	
	@Mock
	private Robotic robot;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		underTest.add(walkable);
		underTest.add(robot);
	}
	
	@Test
	public void shouldWalkDogs() {
		underTest.walk();
		verify((Walkable) walkable).walk();
	}
	
	@Test
	public void shouldOilRobots() {
		underTest.oilRobots();
		verify(robot).oil();
	}
}
