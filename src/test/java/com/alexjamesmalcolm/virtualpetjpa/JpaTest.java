package com.alexjamesmalcolm.virtualpetjpa;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

import com.alexjamesmalcolm.virtualpetjpa.pet.Pet;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaTest {
	
	@Resource
	private CrudRepository<Pet, Long> petRepo;
	
	@Test
	public void shouldInitializePetRepository() {}
}
